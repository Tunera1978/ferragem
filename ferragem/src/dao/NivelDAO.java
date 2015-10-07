
package dao;

import beans.Nivel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//import javax.swing.JOptionPane;

public class NivelDAO extends GenericDAO {
    
    public NivelDAO(){
        super();//a classe mãe pega a conexão
    }
    
    public boolean inserir(Nivel nivel){
       
        String sql = "INSERT INTO tblnivel(descricao) VALUES(?)";
        try{
            this.prepareStmte(sql);            
            this.stmte.setString(2, nivel.getDescricao());
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }      
        
    }
    
    public Nivel getNivelById(int idnivelacesso){
        Nivel u = new Nivel();
        String sql = "SELECT * FROM tblnivel WHERE idnivelacesso = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, idnivelacesso);//parametro
            ResultSet rs = this.stmte.executeQuery();//return um resultset
            rs.first();//ResultSet na primeira posição
            u.setIdnivelacesso(rs.getInt("idnivelacesso"));
            u.setDescricao(rs.getString("descricao"));
            
            return u;
        }
        catch(Exception e){
            return null;// não tem nivel para retornar retorna null
        }
    }
    
    public boolean excluir(Nivel u){
        String sql = "DELETE FROM tblnivel WHERE idnivelacesso = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, u.getIdnivelacesso());//1 significa o 1º que será visto no caso idtblnivelacesso
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }   
    }
    
    public boolean editar(Nivel nivel){
        String sql = "UPDATE tblnivel SET descricao = ?, senha = ? WHERE idnivelacesso = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, nivel.getIdnivelacesso());
            this.stmte.setString(2,nivel.getDescricao());
            this.stmte.executeUpdate();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public Nivel getNivelByNome(String descricao){
        Nivel u = new Nivel();
        String sql = "SELECT * FROM tblnivel WHERE descricao = ?";
        
        try{
            this.prepareStmte(sql);
            this.stmte.setString(1, descricao);
            ResultSet rs = this.stmte.executeQuery();
            rs.first();
            u.setIdnivelacesso(rs.getInt("idnivelacesso"));
            u.setDescricao(rs.getString("descricao"));
            
            return u;
            
        }catch(Exception e){
            return null;
        }  
    }
    
    
           
    public ArrayList<Nivel> getNivelByLista(String descricao){
       ArrayList<Nivel> nivel = new ArrayList<Nivel>();
        String sql = "SELECT * FROM tblnivel WHERE descricao LIKE ?";
        
        try
        {
            this.prepareStmte(sql);
            this.stmte.setString(1, "%"+descricao+"%");
            ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
           
            while(rs.next())
            {
                Nivel u = new Nivel();
                //u.setIdtblnivelacesso(rs.getInt("idtblnivelacesso"));
                u.setDescricao(rs.getString("descricao"));                
                nivel.add(u);
            }
            return nivel;
            
        }
        catch(Exception e)
        {
            return null;
        }  
    }
    
    
    
    public ArrayList<Nivel> getNivel() //L I S T A
    {
        ArrayList<Nivel> nivel = new ArrayList<>();

        String sql = "SELECT * FROM tblnivel order by descricao";
        
               
        try {
            this.prepareStmte(sql);
            ResultSet rs = this.stmte.executeQuery(sql); //sempre usar quando fazer uma consulta(SELECT)
            rs.beforeFirst();
            while (rs.next()) {
                Nivel nv = new Nivel();
                nv.setDescricao(rs.getString("descricao"));
                nivel.add(nv);                //fazer no o mesmo no DAO Estado
            }
            return nivel;
        } catch (Exception e) {
            return null;
        } 
    }  
    
    
    public ArrayList<Nivel> getNivelInt(int parametro) //L I S T A
    {
        ArrayList<Nivel> idioma = new ArrayList<>();

        String sql = "";
        if(parametro == 1){
            //ORDENA PELO ID DO IDIOMA
           sql = "SELECT * FROM tblNivel ORDER BY idNivel ASC";
        }else if(parametro == 2){
            //ORDENA PELO NOME DO IDIOMA
            sql = "SELECT * FROM tblNivel ORDER BY nome ASC";
        }
               
        try {
            this.prepareStmte(sql);
            ResultSet rs = this.stmte.executeQuery(sql); //sempre usar quando fazer uma consulta(SELECT)
            rs.beforeFirst();
            while (rs.next()) {
                Nivel i = new Nivel();
                i.setIdnivelacesso(rs.getInt("idtlbnivel"));
                i.setDescricao(rs.getString("descricao"));
                idioma.add(i);
                //x++;
            }
            return idioma;
        } catch (Exception e) {
            return null;
        } 
    } 
    
    public List<Nivel> listarNivel() {

        try {
                String sql = "SELECT * FROM tblNivel";
                this.prepareStmte(sql);                          

            ResultSet rs = this.stmte.executeQuery();
            //monta o array 
            List<Nivel> listaNivel = new ArrayList<Nivel>();
            while (rs.next()) {
                Nivel iVO = new Nivel();
                iVO.setDescricao(rs.getString("descricao"));
                listaNivel.add(iVO);
            }
            rs.close();
            //stmte.close();
            this.closeAll();
            return listaNivel;
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Ocorreu um erro no metodo listaEditora, classe Editora" + ex);
            return null;
        }
    }
    
    public Nivel getNivelInt(String descricao){
        Nivel u = new Nivel();
        String sql = "SELECT idnivel FROM tblnivel WHERE descricao = ?";
        
        try{
            this.prepareStmte(sql);
            this.stmte.setString(1, descricao);
            ResultSet rs = this.stmte.executeQuery();
            rs.first();
            u.setIdnivelacesso(rs.getInt("idnivelacesso")); 
            return u;
            
        }catch(Exception e){
            return null;
        }  
    }
    
    
}
