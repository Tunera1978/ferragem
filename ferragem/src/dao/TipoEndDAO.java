package dao;

import beans.TipoEndereco;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    String sql = "SELECT * FROM tbltipoEndereco WHERE idtipoendereco = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, idtipoEndereco);//parametro
      ResultSet rs = this.stmte.executeQuery();//return um resultset
      rs.first();//ResultSet na primeira posição
      u.setIdtipoendereco(rs.getInt("idtipoendereco"));
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
    String sql = "DELETE FROM tbltipoEndereco WHERE idtipoendereco = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, u.getIdtipoendereco());//1 significa o 1º que será visto no caso idtipoEndereco
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
      this.stmte.setInt(2, tipoEndereco.getIdtipoendereco());
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
        u.setIdtipoendereco(rs.getInt("idtipoendereco"));
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
  
  
  
  
  //combo tipo endereco
  public ArrayList<TipoEndereco> gettipoEnds()
  { 
    ArrayList<TipoEndereco> tp = new ArrayList<>();
    String sql = "SELECT * FROM tbltipoendereco order by descricao";
    try
    {
      this.prepareStmte(sql);
      ResultSet rs = this.stmte.executeQuery(sql); 
      rs.beforeFirst();
      while (rs.next())
      {
        TipoEndereco t = new TipoEndereco();
        t.setIdtipoendereco(rs.getInt("idtipoendereco"));
        t.setDescricao(rs.getString("descricao"));
        tp.add(t);                
      }
      return tp;
    }
    catch (Exception e)
    {
      return null;
    }
  }
}
