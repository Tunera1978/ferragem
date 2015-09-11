package dao;

import beans.Contato;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ContatoDAO extends GenericDAO
{

  public ContatoDAO()
  {
    super();//a classe mãe pega a conexão
  }

  public boolean inserir(Contato contato)
  {
    String sql = "INSERT INTO tblContato(nome, telefone, celular, email, setor, observacao, idcliente) VALUES(?, ?, ?, ?, ?, ?, ?)";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, contato.getNome());
      this.stmte.setString(2, contato.getTelefone());
      this.stmte.setString(3, contato.getCelular());
      this.stmte.setString(4, contato.getEmail());
      this.stmte.setString(5, contato.getSetor());
      this.stmte.setString(6, contato.getObservacao());
      this.stmte.setInt(7, contato.getIdcliente());
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public Contato getContatoById(int idcontato)
  {
    Contato u = new Contato();
    String sql = "SELECT nome, celular, telefone, email, observacao FROM tblcontato WHERE idtblcontato = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, idcontato);//parametro
      ResultSet rs = this.stmte.executeQuery();//return um resultset
      rs.first();//ResultSet na primeira posição
      u.setNome(rs.getString("nome"));
      u.setCelular(rs.getString("celular"));
      u.setTelefone(rs.getString("telefone"));
      u.setEmail(rs.getString("email"));
      u.setObservacao(rs.getString("observacao"));
      return u;
    }
    catch (Exception e)
    {
      return null;// não tem contato para retornar retorna null
    }
  }

  public boolean excluir(Contato u)
  {
    String sql = "DELETE FROM tblcontato WHERE idcontato = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, u.getIdtblcontato());//1 significa o 1º que será visto no caso idcontato
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public boolean editar(Contato contato)
  {
    String sql = "UPDATE tblcontato SET nome = ?, telefone = ?, celular = ?, email = ?, setor = ?, observacao = ? WHERE idtblcontato = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, contato.getNome());
      this.stmte.setString(2, contato.getTelefone());
      this.stmte.setString(3, contato.getCelular());
      this.stmte.setString(4, contato.getEmail());
      this.stmte.setString(5, contato.getSetor());
      this.stmte.setString(6, contato.getObservacao());
      this.stmte.executeUpdate();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public ArrayList<Contato> getContatoByLista(String descricao)
  {
    ArrayList<Contato> contato = new ArrayList<Contato>();
    String sql = "SELECT nome, celular, telefone, email, observacao FROM tblcontato WHERE descricao LIKE ?";

    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, "%" + descricao + "%");
      ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)

      while (rs.next())
      {
        Contato u = new Contato();
        u.setNome(rs.getString("nome"));
        u.setCelular(rs.getString("celular"));
        u.setTelefone(rs.getString("telefone"));
        u.setEmail(rs.getString("email"));
        u.setObservacao(rs.getString("observacao"));
        contato.add(u);
      }
      return contato;

    }
    catch (Exception e)
    {
      return null;
    }
  }

}
