
package dao;


import beans.Contato;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ContatoDAO extends GenericDAO {
    
    public ContatoDAO(){
        super();//a classe mãe pega a conexão
    }
    
        public boolean inserir(Contato contato){
        String sql = "INSERT INTO tblContato(descricao, pesoBarra) VALUES(?, ?)";
        try{
            this.prepareStmte(sql);           
            this.stmte.setInt(2, contato.getIdcliente();
            this.stmte.setString(3, contato.getNome();
            this.stmte.setFloat(4, contato.getPeso() );
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public Contato getContatoById(int idcontato){
        Contato u = new Contato();
        String sql = "SELECT * FROM tblcontato WHERE idcontato = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, idcontato);//parametro
            ResultSet rs = this.stmte.executeQuery();//return um resultset
            rs.first();//ResultSet na primeira posição
            u.setIdContato(rs.getInt("idContato"));
            u.setDescricao(rs.getString("descricao"));
            return u;
        }
        catch(Exception e){
            return null;// não tem contato para retornar retorna null
        }
    }
    
    public boolean excluir(Contato u){
        String sql = "DELETE FROM tblcontato WHERE idcontato = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, u.getIdContato());//1 significa o 1º que será visto no caso idcontato
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }   
    }
    
    public boolean editar(Contato contato){
        String sql = "UPDATE tblcontato SET descricao = ? WHERE idcontato = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(2, contato.getIdContato());
            this.stmte.setString(1, contato.getDescricao());
            this.stmte.executeUpdate();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public ArrayList<Contato> getContatoByLista(String descricao){
       ArrayList<Contato> contato = new ArrayList<Contato>();
        String sql = "SELECT * FROM tblcontato WHERE descricao LIKE ?";
        
        try
        {
            this.prepareStmte(sql);
            this.stmte.setString(1, "%"+descricao+"%");
            ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
           
            while(rs.next())
            {
                Contato u = new Contato();
                u.setIdContato(rs.getInt("idcontato"));
                u.setDescricao(rs.getString("descricao"));                
                contato.add(u);
            }
            return contato;
            
        }
        catch(Exception e)
        {
            return null;
        }  
    }
    
}
