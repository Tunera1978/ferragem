package dao;

import beans.Ferragem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FerragemDAO extends GenericDAO
{

  public FerragemDAO()
  {
    super();//a classe mãe pega a conexão
  }

  public boolean inserir(Ferragem ferragem)
  {
    String sql = "INSERT INTO tblferragem(qtde, estriboaltura, estribolargura, comprimento, estriboespaco, idpedido) VALUES(?,?,?,?,?,?)";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, ferragem.getQtdeFerragem());
      this.stmte.setDouble(2, ferragem.getEstriboAltura());
      this.stmte.setDouble(3, ferragem.getEstriboLargura());
      this.stmte.setDouble(4, ferragem.getComprimento());
      this.stmte.setDouble(5, ferragem.getEspacoEstribo());
      this.stmte.setInt(6, ferragem.getIdPedido());
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
      return false;
    }
  }

  public boolean excluir(Ferragem u)
  {
    String sql = "DELETE FROM tblferragem WHERE idferragem = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, u.getIdFerragem());//1 significa o 1º que será visto no caso idferragem
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public boolean editar(Ferragem ferragem)
  {
    String sql = "UPDATE tblferragem SET qtde = ?, estriboaltura = ?, estribolargura = ?, comprimento = ?, estriboespaco = ?, idpedido = ? WHERE idferragem = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, ferragem.getQtdeFerragem());
      this.stmte.setDouble(2, ferragem.getEstriboAltura());
      this.stmte.setDouble(3, ferragem.getEstriboLargura());
      this.stmte.setDouble(4, ferragem.getComprimento());
      this.stmte.setDouble(5, ferragem.getEspacoEstribo());
      this.stmte.setInt(6, ferragem.getIdPedido());
      this.stmte.setInt(7, ferragem.getIdFerragem());
      this.stmte.executeUpdate();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public Ferragem getFerragemById(int idferragem)
  {
    Ferragem u = new Ferragem();
    String sql = "SELECT * FROM tblferragem WHERE idferragem = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, idferragem);//parametro
      ResultSet rs = this.stmte.executeQuery();//return um resultset
      rs.first();//ResultSet na primeira posição
      u.setIdFerragem(rs.getInt("idferragem"));
      u.setQtdeFerragem(rs.getInt("qtde"));
      u.setEstriboLargura(rs.getDouble("estriboaltura"));
      u.setEstriboAltura(rs.getDouble("estribolargura"));
      u.setComprimento(rs.getDouble("comprimento"));
      u.setEspacoEstribo(rs.getDouble("estriboespaco"));
      u.setIdPedido(rs.getInt("idpedido"));
      return u;
    }
    catch (Exception e)
    {
      return null;// não tem ferragem para retornar retorna null
    }
  }

  public Ferragem getFerragemByMax()
  {
    Ferragem u = new Ferragem();
    String sql = "select max(?) FROM tblferragem;";
    try
    {
      this.prepareStmte(sql);
      ResultSet rs = this.stmte.executeQuery();//return um resultset
      System.out.println(u);
      while (rs.next())
      {
        System.out.println(u);
        // u = new Ferragem();
        u.setIdFerragem(rs.getInt("idferragem"));
        System.out.println(u);
      }
      System.out.println(u);
      return u;
    }
    catch (Exception e)
    {
      return null;// não tem ferragem para retornar retorna null
    }
  }

  public ArrayList<Ferragem> getFerragemByMaxId()
  {
    ArrayList<Ferragem> ferragem = new ArrayList<Ferragem>();
    String sql = "select max(?) FROM tblferragem;";

    try
    {
      this.prepareStmte(sql);

      ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)

      while (rs.next())
      {
        Ferragem f = new Ferragem();
        f.setIdFerragem(rs.getInt("idferragem"));
        ferragem.add(f);
      }
      return ferragem;

    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e.getMessage());
      return null;
    }
  }
  
  public int getUltimo(){
        String sql = "SELECT (MAX(idferragem)) as id FROM tblferragem";
        this.prepareStmte(sql);
        ResultSet rs;
        int retorno = 0;
        try{
            rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
            rs.first();
            retorno = rs.getInt("id");
        }
        catch(SQLException ex){
            Logger.getLogger(FerragemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
  
  public int getFerragemUltimo(){
        String sql = "SELECT (MAX(idferragem) + 1) as id FROM tblferragem";
        this.prepareStmte(sql);
        ResultSet rs;
        int retorno = 0;
        try{
            rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
            rs.first();
            retorno = rs.getInt("id");
        }
        catch(SQLException ex){
            Logger.getLogger(FerragemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
  
  

}
