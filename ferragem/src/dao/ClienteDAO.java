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
      this.stmte.setBoolean(2, cliente.isFisicoJuridico());
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

  public Cliente getClienteById(int idcliente)
  {
    Cliente u = new Cliente();
    String sql = "SELECT nome, fisicoJuridico, cnpj, inscricao, cpf, rg FROM tblcliente WHERE idtblcliente = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, idcliente);//parametro
      ResultSet rs = this.stmte.executeQuery();//return um resultset
      rs.first();//ResultSet na primeira posição
      u.setNome(rs.getString("nome"));
      u.setFisicoJuridico(rs.getBoolean("fisicoJuridico"));
      u.setCnpj(rs.getString("cnpj"));
      u.setInscricao(rs.getString("inscricao"));
      u.setCpf(rs.getString("cpf"));
      u.setRg(rs.getString("rg"));
      return u;
    }
    catch (Exception e)
    {
      return null;// não tem cliente para retornar retorna null
    }
  }

  public boolean excluir(Cliente u)
  {
    String sql = "DELETE FROM tblcliente WHERE idcliente = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setInt(1, u.getIdtblentidade());//1 significa o 1º que será visto no caso idcliente
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
    String sql = "UPDATE tblcliente SET nome = ?, fisicoJuridico = ?, cnpj = ?, inscricao = ?, cpf = ?, rg = ?  WHERE idcliente = ?";
    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, cliente.getNome());
      this.stmte.setBoolean(2, cliente.isFisicoJuridico());
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
    String sql = "SELECT nome, celular, telefone, email, observacao FROM tblcliente WHERE descricao LIKE ?";

    try
    {
      this.prepareStmte(sql);
      this.stmte.setString(1, "%" + descricao + "%");
      ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)

      while (rs.next())
      {
        Cliente u = new Cliente();
        u.setNome(rs.getString("nome"));
        u.setFisicoJuridico(rs.getBoolean("fisicoJuridico"));
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

}