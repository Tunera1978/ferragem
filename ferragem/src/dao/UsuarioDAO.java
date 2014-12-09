
package dao;

import beans.Usuario;
import java.sql.ResultSet;
import java.util.ArrayList;
//import javax.swing.JOptionPane;

public class UsuarioDAO extends GenericDAO {
    
    public UsuarioDAO(){
        super();//a classe mãe pega a conexão
    }
    
    public boolean inserir(Usuario usuario){
       
        String sql = "INSERT INTO tblusuario(nome, senha) VALUES(?, ?)";
        try{
            this.prepareStmte(sql);
            //this.stmte.setInt(1, usuario.getIdusuario());
            this.stmte.setString(1, usuario.getNome());
            this.stmte.setString(2, usuario.getSenha());
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }      
        
    }
    
    public Usuario getUsuarioById(int idusuario){
        Usuario u = new Usuario();
        String sql = "SELECT * FROM tblusuario WHERE idusuario = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, idusuario);//parametro
            ResultSet rs = this.stmte.executeQuery();//return um resultset
            rs.first();//ResultSet na primeira posição
            u.setIdusuario(rs.getInt("idusuario"));
            u.setNome(rs.getString("nome"));
            return u;
        }
        catch(Exception e){
            return null;// não tem usuario para retornar retorna null
        }
    }
    
    public boolean excluir(Usuario u){
        String sql = "DELETE FROM tblusuario WHERE idusuario = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, u.getIdusuario());//1 significa o 1º que será visto no caso idusuario
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }   
    }
    
    public boolean editar(Usuario usuario){
        String sql = "UPDATE tblusuario SET nome = ?, senha = ? WHERE idusuario = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(3, usuario.getIdusuario());
            this.stmte.setString(1, usuario.getNome());
            this.stmte.setString(2,usuario.getSenha());
            this.stmte.executeUpdate();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public Usuario getUsuarioByNome(String nome){
        Usuario u = new Usuario();
        String sql = "SELECT * FROM tblusuario WHERE nome = ?";
        
        try{
            this.prepareStmte(sql);
            this.stmte.setString(1, nome);
            ResultSet rs = this.stmte.executeQuery();
            rs.first();
            u.setIdusuario(rs.getInt("idusuario"));
            u.setNome(rs.getString("nome"));
            u.setSenha(rs.getString("Senha"));
            return u;
            
        }catch(Exception e){
            return null;
        }  
    }
    
    public Usuario getUsuarioBySenha(String nome, String senha){
        Usuario u = new Usuario();
        String sql = "SELECT * FROM tblusuario WHERE nome = ? and senha = ?";
        
        try{
            this.prepareStmte(sql);
            this.stmte.setString(1, nome);
            this.stmte.setString(2, senha);
            ResultSet rs = this.stmte.executeQuery();
            rs.first();
            u.setIdusuario(rs.getInt("idusuario"));
            u.setNome(rs.getString("nome"));
            u.setSenha(rs.getString("Senha"));
            return u;
            
        }catch(Exception e){
            return null;
        }  
    }
           
    public ArrayList<Usuario> getUsuarioByLista(String nome){
       ArrayList<Usuario> usuario = new ArrayList<Usuario>();
        String sql = "SELECT * FROM tblusuario WHERE nome LIKE ?";
        
        try
        {
            this.prepareStmte(sql);
            this.stmte.setString(1, "%"+nome+"%");
            ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
           
            while(rs.next())
            {
                Usuario u = new Usuario();
                u.setIdusuario(rs.getInt("idusuario"));
                u.setNome(rs.getString("nome"));                
                usuario.add(u);
            }
            return usuario;
            
        }
        catch(Exception e)
        {
            return null;
        }  
    }
}
