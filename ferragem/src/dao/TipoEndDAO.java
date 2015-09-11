package dao;

import beans.TipoEndereco;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TipoEndDAO extends GenericDAO
{

  public TipoEndDAO()
  {
    super();//a classe mãe pega a conexão
  }

  public boolean inserir(TipoEndereco tipoEndereco)
  {
    String sql = "INSERT INTO tbltipoEndereco( descricao ) VALUES( ? )";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(2, tipoEndereco.getDescricao());
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public TipoEndereco getTipoEnderecoById(int idtipoEndereco)
  {
    TipoEndereco u = new TipoEndereco();
    String sql = "SELECT * FROM tbltipoEndereco WHERE idtbltipoendereco = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, idtipoEndereco);//parametro
      ResultSet rs = this.stmte.executeQuery();//return um resultset
      rs.first();//ResultSet na primeira posição
      u.setIdtbltipoendereco(rs.getInt("idtbltipoendereco"));
      u.setDescricao(rs.getString("descricao"));
      return u;
    }
    catch (Exception e)
    {
      return null;// não tem tipoEndereco para retornar retorna null
    }
  }

  public boolean excluir(TipoEndereco u)
  {
    String sql = "DELETE FROM tbltipoEndereco WHERE idtbltipoendereco = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, u.getIdtbltipoendereco());//1 significa o 1º que será visto no caso idtipoEndereco
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public boolean editar(TipoEndereco tipoEndereco)
  {
    String sql = "UPDATE tbltipoEndereco SET descricao = ? WHERE idtipoEndereco = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(2, tipoEndereco.getIdtbltipoendereco());
      this.stmte.setString(1, tipoEndereco.getDescricao());
      this.stmte.executeUpdate();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public ArrayList<TipoEndereco> getTipoEnderecoByLista(String descricao)
  {
    ArrayList<TipoEndereco> tipoEndereco = new ArrayList<TipoEndereco>();
    String sql = "SELECT * FROM tbltipoEndereco WHERE descricao LIKE ?";

    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, "%" + descricao + "%");
      ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)

      while (rs.next())
      {
        TipoEndereco u = new TipoEndereco();
        u.setIdtbltipoendereco(rs.getInt("idtbltipoendereco"));
        u.setDescricao(rs.getString("descricao"));
        tipoEndereco.add(u);
      }
      return tipoEndereco;

    }
    catch (Exception e)
    {
      return null;
    }
  }

}
