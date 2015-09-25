
package dao;

import beans.Log;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LogDAO extends GenericDAO {
    
    public LogDAO(){
        super();//a classe mãe pega a conexão
    }
    
        public boolean inserir(Log log){
        String sql = "INSERT INTO tbllog (data, time, idusuario, idacesso) VALUES(?, ?, ?, ?)";
        try{
            this.prepareStmte(sql);            
            this.stmte.setString(1,log.getData());
            this.stmte.setString(2, log.getHora());
            this.stmte.setInt(3, log.getIdusuario());
            this.stmte.setInt(4, log.getIdacesso());
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public Log getLogById(int idlog){
        Log u = new Log();
        String sql = "SELECT data, hora, idusuario, idacesso FROM tbllog WHERE idlog = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, idlog);//parametro
            ResultSet rs = this.stmte.executeQuery();//return um resultset
            rs.first();//ResultSet na primeira posição
            u.setData(rs.getString("data"));
            u.setHora(rs.getString("hora"));
            u.setIdusuario(rs.getInt("idusuario"));
            u.setIdacesso(rs.getInt("idacesso"));
            
            return u;
        }
        catch(Exception e){
            return null;// não tem log para retornar retorna null
        }
    }
    
    public boolean excluir(Log u){
        String sql = "DELETE FROM tbllog WHERE idlog = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, u.getIdlog());//1 significa o 1º que será visto no caso idlog
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }   
    }
    
    public boolean editar(Log log){
        String sql = "UPDATE tbllog SET descricao = ? WHERE idlog = ?";
        try{
            this.prepareStmte(sql);            
            this.stmte.setString(1, log.getData());
            this.stmte.setString(2, log.getHora());
            this.stmte.setInt(3, log.getIdusuario());
            this.stmte.setInt(4, log.getIdacesso());
            this.stmte.executeUpdate();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public ArrayList<Log> getLogByLista(String descricao){
       ArrayList<Log> log = new ArrayList<Log>();
        String sql = "SELECT * FROM tbllog WHERE descricao LIKE ?";
        
        try
        {
            this.prepareStmte(sql);
            this.stmte.setString(1, "%"+descricao+"%");
            ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
           
            while(rs.next())
            {
                Log u = new Log();
                u.setIdlog(rs.getInt("idlog"));
                u.setData(rs.getString("data"));                
                u.setHora(rs.getString("hora"));
                u.setIdusuario(rs.getInt("idusuario"));
                u.setIdacesso(rs.getInt("idacesso"));
                log.add(u);
            }
            return log;
            
        }
        catch(Exception e)
        {
            return null;
        }  
    }
    
}
