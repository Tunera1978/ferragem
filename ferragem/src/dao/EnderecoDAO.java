package dao;

import beans.Cidade;
import beans.Endereco;
import beans.TipoEndereco;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EnderecoDAO extends GenericDAO
{

  public EnderecoDAO()
  {
    super();//a classe mãe pega a conexão
  }

  public boolean inserir(Endereco endereco)
  {
    String sql = "INSERT INTO tblEndereco( identrega, endereco, idcidade, idtipoendereco, idcliente ) VALUES(?, ?, ?, ?, ?)";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, endereco.getIdentrega());
      this.stmte.setString(2, endereco.getDescricao());
      this.stmte.setInt(3, endereco.getIdcidade());
      this.stmte.setInt(4, endereco.getIdtipoendereco());
      this.stmte.setInt(5, endereco.getIdcliente());
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public Endereco getEnderecoById(int idendereco)
  {
    Endereco u = new Endereco();
    String sql = "SELECT idendentrega, endereco, idcidade, idtipoendereco, idcliente FROM tblendereco WHERE idendentrega = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, idendereco);//parametro
      ResultSet rs = this.stmte.executeQuery();//return um resultset
      rs.first();//ResultSet na primeira posição
      u.setIdentrega(rs.getInt("idendentrega"));
      u.setDescricao(rs.getString("endereco"));
      u.setIdcidade(rs.getInt("idcidade"));
      u.setIdtipoendereco(rs.getInt("idtipoendereco"));
      u.setIdcliente(rs.getInt("idcliente"));
      return u;
    }
    catch (Exception e)
    {
      return null;// não tem endereco para retornar retorna null
    }
  }

  public boolean excluir(Endereco u)
  {
    String sql = "DELETE FROM tblendereco WHERE identrega = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, u.getIdentrega());//1 significa o 1º que será visto no caso idendereco
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public boolean editar(Endereco endereco)
  {
    String sql = "UPDATE tblendereco SET nome = ?, fisicoJuridico = ?, cnpj = ?, inscricao = ?, cpf = ?, rg = ?  WHERE idendereco = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, endereco.getDescricao());
      this.stmte.setInt(2, endereco.getIdcidade());
      this.stmte.setInt(3, endereco.getIdtipoendereco());
      this.stmte.setInt(4, endereco.getIdentrega());
      this.stmte.executeUpdate();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public ArrayList<Endereco> getEnderecoByLista(String descricao)
  {
    ArrayList<Endereco> endereco = new ArrayList<Endereco>();
    String sql = "SELECT endereco, idcidade, idtipoendereco, idcliente  FROM tblendereco WHERE endereco LIKE ?";

    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, "%" + descricao + "%");
      ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)

      while (rs.next())
      {
        Endereco u = new Endereco();
        u.setDescricao(rs.getString("endereco"));
        u.setIdcidade(rs.getInt("idcidade"));
        u.setIdtipoendereco(rs.getInt("idtipoendereco"));
        u.setIdcliente(rs.getInt("idcliente"));
        endereco.add(u);
      }
      return endereco;

    }
    catch (Exception e)
    {
      return null;
    }
  }

  public ArrayList<Endereco> getClienteEndereco(int id)
  {
    ArrayList<Endereco> endereco = new ArrayList<Endereco>();
    String sql = "SELECT tbltipoendereco.descricao , tblendereco.endereco, tblcidade.nome  FROM tblendereco "
            + "LEFT JOIN tbltipoendereco ON tbltipoendereco.idtipoendereco = tblendereco.idtipoendereco"
            + "LEFT JOIN tblcidade ON tblcidade.idcidade = tblendereco.idcidade"
            + "where tblendereco.idcliente = ? ";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, id);
      ResultSet rs = this.stmte.executeQuery();

      while (rs.next())
      {
        Endereco e = new Endereco();
        Cidade c = new Cidade();
        TipoEndereco t = new TipoEndereco();
        t.setDescricao(rs.getString("descricao"));
        e.setDescricao(rs.getString("endereco"));
        c.setNome(rs.getString("nome"));
        
        /*e.setIdtipoendereco(rs.getInt("idendentrega"));
        e.setDescricao(rs.getString("endereco"));
        e.setIdtipoendereco(rs.getInt("idtipoendereco"));
        e.setIdcliente(rs.getInt("idcliente"));
        e.setIdcidade(rs.getInt("idcidade")); */
        
                
        endereco.add(e);
      }
      return endereco;

    }
    catch (Exception e)
    {
      return null;
    }
  }

}
