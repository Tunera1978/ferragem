
package dao;


import beans.Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDAO extends GenericDAO {
    
    public ClienteDAO(){
        super();//a classe mãe pega a conexão
    }
    
        public boolean inserir(Cliente cliente){
        String sql = "INSERT INTO tblcliente(descricao, pesoBarra) VALUES(?, ?)";
        try{
            this.prepareStmte(sql);
            //this.stmte.setInt(1, cliente.getIdCliente());
            this.stmte.setString(1, cliente.getDescricao());
            this.stmte.setFloat(2, cliente.getPeso() );
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public Cliente getClienteById(int idcliente){
        Cliente u = new Cliente();
        String sql = "SELECT * FROM tblcliente WHERE idcliente = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, idcliente);//parametro
            ResultSet rs = this.stmte.executeQuery();//return um resultset
            rs.first();//ResultSet na primeira posição
            u.setIdCliente(rs.getInt("idCliente"));
            u.setDescricao(rs.getString("descricao"));
            return u;
        }
        catch(Exception e){
            return null;// não tem cliente para retornar retorna null
        }
    }
    
    public boolean excluir(Cliente u){
        String sql = "DELETE FROM tblcliente WHERE idcliente = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, u.getIdCliente());//1 significa o 1º que será visto no caso idcliente
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }   
    }
    
    public boolean editar(Cliente cliente){
        String sql = "UPDATE tblcliente SET descricao = ? WHERE idcliente = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(2, cliente.getIdCliente());
            this.stmte.setString(1, cliente.getDescricao());
            this.stmte.executeUpdate();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public ArrayList<Cliente> getClienteByLista(String descricao){
       ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        String sql = "SELECT * FROM tblcliente WHERE descricao LIKE ?";
        
        try
        {
            this.prepareStmte(sql);
            this.stmte.setString(1, "%"+descricao+"%");
            ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
           
            while(rs.next())
            {
                Cliente u = new Cliente();
                u.setIdCliente(rs.getInt("idcliente"));
                u.setDescricao(rs.getString("descricao"));                
                cliente.add(u);
            }
            return cliente;
            
        }
        catch(Exception e)
        {
            return null;
        }  
    }
    
}
