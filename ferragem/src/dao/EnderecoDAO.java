package dao;

import beans.Endereco;
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
    String sql = "INSERT INTO tblEndereco( endereco, idcidade, idtipoendereco, idtblcliente ) VALUES(?, ?, ?, ?)";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, endereco.getDescricao());
      this.stmte.setInt(2, endereco.getIdcidade());
      this.stmte.setInt(3, endereco.getIdtipoendereco());
      this.stmte.setInt(4, endereco.getIdtblcliente());
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
    String sql = "SELECT endereco, idcidade, idtipoendereco, idtblcliente FROM tblendereco WHERE idtblentrega = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, idendereco);//parametro
      ResultSet rs = this.stmte.executeQuery();//return um resultset
      rs.first();//ResultSet na primeira posição
      u.setDescricao(rs.getString("endereco"));
      u.setIdcidade(rs.getInt("idcidade"));
      u.setIdtipoendereco(rs.getInt("idtipoendereco"));
      u.setIdtblcliente(rs.getInt("idtblcliente"));
      return u;
    }
    catch (Exception e)
    {
      return null;// não tem endereco para retornar retorna null
    }
  }

  public boolean excluir(Endereco u)
  {
    String sql = "DELETE FROM tblendereco WHERE idtblentrega = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, u.getIdtblentrega());//1 significa o 1º que será visto no caso idendereco
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
    String sql = "UPDATE tblendereco SET nome = ?, fisicoJuridico = ?, cnpj = ?, inscricao = ?, cpf = ?, rg = ?  WHERE idtblendereco = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, endereco.getDescricao());
      this.stmte.setInt(2, endereco.getIdcidade());
      this.stmte.setInt(3, endereco.getIdtipoendereco());
      this.stmte.setInt(4, endereco.getIdtblentrega());
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
    String sql = "SELECT endereco, idcidade, idtipoendereco, idtblcliente  FROM tblendereco WHERE endereco LIKE ?";

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
        u.setIdtblcliente(rs.getInt("idtblcliente"));
        endereco.add(u);
      }
      return endereco;

    }
    catch (Exception e)
    {
      return null;
    }
  }

}
