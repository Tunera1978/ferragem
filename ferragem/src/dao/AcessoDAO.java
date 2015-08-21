
package dao;


import beans.Acesso;
import beans.Acesso;
import java.sql.ResultSet;
import java.util.ArrayList;


public class AcessoDAO extends GenericDAO {
  
    
    public AcessoDAO(){
        super();//a classe mãe pega a conexão
    }
    
        public boolean inserir(Acesso acesso){
        String sql = "INSERT INTO tblacesso(descricao) VALUES(?)";
        try{
            this.prepareStmte(sql);            
            this.stmte.setString(1, acesso.getDescricao());            
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public Acesso getAcessoById(int idtblacesso){
        Acesso u = new Acesso();
        String sql = "SELECT * FROM tblacesso WHERE idtblacesso = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, idtblacesso);//parametro
            ResultSet rs = this.stmte.executeQuery();//return um resultset
            rs.first();//ResultSet na primeira posição
            u.setIdtblacesso(rs.getInt("idtblacesso"));
            u.setDescricao(rs.getString("descricao"));
            return u;
        }
        catch(Exception e){
            return null;// não tem acesso para retornar retorna null
        }
    }
    
    public boolean excluir(Acesso u){
        String sql = "DELETE FROM tblacesso WHERE idtblacesso = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, u.getIdtblacesso());//1 significa o 1º que será visto no caso idtblacesso
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }   
    }
    
    public boolean editar(Acesso acesso){
        String sql = "UPDATE tblacesso SET descricao = ? WHERE idtblacesso = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(2, acesso.getIdtblacesso());
            this.stmte.setString(1, acesso.getDescricao());
            this.stmte.executeUpdate();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public ArrayList<Acesso> getAcessoByLista(String descricao){
       ArrayList<Acesso> acesso = new ArrayList<Acesso>();
        String sql = "SELECT * FROM tblacesso WHERE descricao LIKE ?";
        
        try
        {
            this.prepareStmte(sql);
            this.stmte.setString(1, "%"+descricao+"%");
            ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
           
            while(rs.next())
            {
                Acesso u = new Acesso();
                u.setIdtblacesso(rs.getInt("idtblacesso"));
                u.setDescricao(rs.getString("descricao"));                
                acesso.add(u);
            }
            return acesso;
            
        }
        catch(Exception e)
        {
            return null;
        }  
    }
    
}
