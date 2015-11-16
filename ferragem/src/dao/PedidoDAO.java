package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import beans.Pedido;
import beans.TelaPedido;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PedidoDAO extends GenericDAO
{

  public PedidoDAO()
  {
    super();//a classe mãe pega a conexão
  }

  public boolean inserir(Pedido pedido)
  {
    String sql = "INSERT INTO tblpedido(idpedido, data, dataentrega, idtblcliente, idusuario) VALUES(?, ?, ?, ?, ?)";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, pedido.getIdPedido());
      this.stmte.setString(2, pedido.getData());
      this.stmte.setString(3, pedido.getDataentrega());
      this.stmte.setInt(4, pedido.getIdcliente());
      this.stmte.setInt(5, pedido.getIdusuario());
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
      return false;
    }
  }

  public boolean excluir(Pedido u)
  {
    String sql = "DELETE FROM tblpedido WHERE idpedido = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, u.getIdPedido());//1 significa o 1º que será visto no caso idpedido
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public boolean editar(Pedido pedido)
  {
    String sql = "UPDATE tblpedido SET data = ?, dataentrega = ?, idtblcliente = ?, idusuario = ? WHERE idpedido = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, pedido.getData());
      this.stmte.setString(2, pedido.getDataentrega());
      this.stmte.setInt(3, pedido.getIdcliente());
      this.stmte.setInt(4, pedido.getIdusuario());
      this.stmte.setInt(5, pedido.getIdPedido());
      this.stmte.executeUpdate();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public Pedido getPedidoById(int idpedido)
  {
    Pedido u = new Pedido();
    String sql = "SELECT * FROM tblpedido WHERE idpedido = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, idpedido);//parametro
      ResultSet rs = this.stmte.executeQuery();//return um resultset
      rs.first();//ResultSet na primeira posição
      u.setIdPedido(rs.getInt("idpedido"));
      u.setData(rs.getString("data"));
      u.setData(rs.getString("dataentrega"));
      u.setIdcliente(rs.getInt("idtblcliente"));
      u.setIdusuario(rs.getInt("idusuario"));
      return u;
    }
    catch (Exception e)
    {
      return null;// não tem pedido para retornar retorna null
    }
  }

  public Pedido getPedidoByMax()
  {
    Pedido u = new Pedido();
    String sql = "select max(?) FROM tblpedido;";
    try
    {
      this.prepareStmte(sql);
      ResultSet rs = this.stmte.executeQuery();//return um resultset
      System.out.println(u);
      while (rs.next())
      {
        System.out.println(u);
        // u = new Pedido();
        u.setIdPedido(rs.getInt("idpedido"));
        System.out.println(u);
      }
      System.out.println(u);
      return u;
    }
    catch (Exception e)
    {
      return null;// não tem pedido para retornar retorna null
    }
  }

  public ArrayList<Pedido> getPedidoByMaxId()
  {
    ArrayList<Pedido> pedido = new ArrayList<Pedido>();
    String sql = "select max(?) FROM tblpedido;";

    try
    {
      this.prepareStmte(sql);

      ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)

      while (rs.next())
      {
        Pedido f = new Pedido();
        f.setIdPedido(rs.getInt("idpedido"));
        pedido.add(f);
      }
      return pedido;

    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e.getMessage());
      return null;
    }
  }
    
  public TelaPedido getConferencia(int idferragem, int idproduto){
        TelaPedido u = new TelaPedido();
        String sql = "SELECT idproduto FROM tblferragem f, tblitemferragem i WHERE i.idferragem = f.idferragem and f.idferragem = ? and i.idproduto = ?" ;
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, idferragem);//parametro
            this.stmte.setInt(2, idproduto);//parametro
            ResultSet rs = this.stmte.executeQuery();//return um resultset
            rs.first();//ResultSet na primeira posição                
            u.setIdproduto(rs.getInt("idproduto"));            
            return u;
        }
        catch(Exception e){
            return null;// não tem produto para retornar retorna null
        }
    }
  
  public int getPedidoUltimo(){
        String sql = "SELECT (MAX(idpedido) + 1) as id FROM tblpedido";
        this.prepareStmte(sql);
        ResultSet rs;
        int retorno = 0;
        try{
            rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
            rs.first();
            retorno = rs.getInt("id");
        }
        catch(SQLException ex){
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
   

}
