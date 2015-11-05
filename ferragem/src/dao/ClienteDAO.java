package dao;

import beans.Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDAO extends GenericDAO
{

  public ClienteDAO()
  {
    super();//a classe mãe pega a conexão
  }

  public boolean inserir(Cliente cliente)
  {
    String sql = "INSERT INTO tblCliente(nome, fisicoJuridico, cnpj, inscricao, cpf, rg ) VALUES(?, ?, ?, ?, ?, ?)";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, cliente.getNome());
      this.stmte.setInt(2, cliente.getFisicoJuridico());
      this.stmte.setString(3, cliente.getCnpj());
      this.stmte.setString(4, cliente.getInscricao());
      this.stmte.setString(5, cliente.getCpf());
      this.stmte.setString(6, cliente.getRg());
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public Cliente getClienteId(int id)
  {
    Cliente cli = new Cliente();
    String sql = "SELECT * FROM tblentidade WHERE idcliente = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, id);//parametro
      ResultSet rs = this.stmte.executeQuery();//return um resultset
      rs.first();//ResultSet na primeira posição                
      cli.setIdcliente(rs.getInt("idcliente"));
      cli.setNome(rs.getString("nome"));
      //u.setFisicoJuridico(rs.getBoolean("fisicoJuridico"));
      cli.setCnpj(rs.getString("cnpj"));
      cli.setInscricao(rs.getString("inscricao"));
      cli.setCpf(rs.getString("cpf"));
      cli.setRg(rs.getString("rg"));
      return cli;
    }
    catch (Exception e)
    {
      return null;
    }
  }

  public boolean excluir(Cliente u)
  {
    String sql = "DELETE FROM tblentidade WHERE idcliente = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, u.getIdcliente());//1 significa o 1º que será visto no caso idcliente
      this.stmte.execute();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public boolean editar(Cliente cliente)
  {
    String sql = "UPDATE tblentidade SET nome = ?, fisicoJuridico = ?, cnpj = ?, inscricao = ?, cpf = ?, rg = ?  WHERE idcliente = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, cliente.getNome());
      this.stmte.setInt(2, cliente.getFisicoJuridico());
      this.stmte.setString(3, cliente.getCnpj());
      this.stmte.setString(4, cliente.getInscricao());
      this.stmte.setString(5, cliente.getCpf());
      this.stmte.setString(6, cliente.getRg());
      this.stmte.executeUpdate();
      return true;
    }
    catch (Exception e)
    {
      return false;
    }
  }

  public ArrayList<Cliente> getClienteByLista(String descricao)
  {
    ArrayList<Cliente> cliente = new ArrayList<Cliente>();
    String sql = "SELECT nome, celular, telefone, email, observacao FROM tblentidade WHERE descricao LIKE ?";

    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, "%" + descricao + "%");
      ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)

      while (rs.next())
      {
        Cliente u = new Cliente();
        u.setNome(rs.getString("nome"));
        u.setFisicoJuridico(rs.getByte("fisicoJuridico"));
        u.setCnpj(rs.getString("cnpj"));
        u.setInscricao(rs.getString("inscricao"));
        u.setCpf(rs.getString("cpf"));
        u.setRg(rs.getString("rg"));
        cliente.add(u);
      }
      return cliente;
    }
    catch (Exception e)
    {
      return null;
    }
  }
  
  public ArrayList<Cliente> getClientes()
  { //L I S T A        
    ArrayList<Cliente> cliente = new ArrayList<>();
    String sql = "SELECT * FROM tblentidade order by nome";
    try
    {
      this.prepareStmte(sql);
      ResultSet rs = this.stmte.executeQuery(sql); //sempre usar quando fazer uma consulta(SELECT)
      rs.beforeFirst();
      while (rs.next())
      {
        Cliente cl = new Cliente();
      //  cl.getIdcliente(rs.getInt("idcliente"));                
        cl.setNome(rs.getString("nome"));
        cliente.add(cl);  //fazer no o mesmo no DAO Estado
      }
      return cliente;
    }
    catch (Exception e)
    {
      return null;
    }
  }

}
