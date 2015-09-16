package dao;

import beans.PedidoItem;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ItemFerragemDAO extends GenericDAO
{

  public ItemFerragemDAO()
  {
    super();//a classe mãe pega a conexão
  }

  public boolean inserir(PedidoItem pedidoitem)
  {
    String sql = "INSERT INTO tblitemferragem(diametro, qtdeferro,qtdepecas, qtdematerial, idferragem, idproduto) VALUES(?,?,?,?,?,?)";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, pedidoitem.getDiametro());
      this.stmte.setDouble(2, pedidoitem.getQtdeferro());
      this.stmte.setDouble(3, pedidoitem.getQtdematerial());
      this.stmte.setInt(4, pedidoitem.getIdferragem());
      this.stmte.setInt(5, pedidoitem.getIdproduto());
      this.stmte.setInt(6, pedidoitem.getIdItemFerragem());
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
      return false;
    }
  }

  public boolean excluir(PedidoItem u)
  {
    String sql = "DELETE FROM tblitemferragem WHERE iditemferragem = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, u.getIdItemFerragem());//1 significa o 1º que será visto no caso idferragem
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public boolean editar(PedidoItem pedidoitem)
  {
    String sql = "UPDATE tblitemferragem SET diametro = ?, qtdeferro = ?,qtdepecas = ?, qtdematerial = ?, idferragem = ?, idproduto = ? WHERE idferragem = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, pedidoitem.getDiametro());
      this.stmte.setDouble(2, pedidoitem.getQtdeferro());
      this.stmte.setDouble(3, pedidoitem.getQtdematerial());
      this.stmte.setInt(4, pedidoitem.getIdferragem());
      this.stmte.setInt(5, pedidoitem.getIdproduto());
      this.stmte.setInt(6, pedidoitem.getIdItemFerragem());
      this.stmte.executeUpdate();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public PedidoItem getFerragemById(int idferragem)
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

}
