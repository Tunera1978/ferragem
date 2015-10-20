
package dao;

import beans.Pais;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaisDAO extends GenericDAO {
    
    public PaisDAO(){
        super();//a classe mãe pega a conexão
    }
    
        public boolean inserir(Pais pais){
        String sql = "INSERT INTO tblpais(idpais, nome, sigla) VALUES(?, ?, ?)";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, pais.getIdPais());
            this.stmte.setString(2, pais.getNome());
            this.stmte.setString(3, pais.getSigla());            
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public Pais getProdutoById(int idpais){
        Pais pa = new Pais();
        String sql = "SELECT * FROM tblpais WHERE idpais = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, idpais);//parametro
            ResultSet rs = this.stmte.executeQuery();//return um resultset
            rs.first();//ResultSet na primeira posição
            pa.setIdPais(rs.getInt("idpais"));
            pa.setNome(rs.getString("nome"));
            pa.setSigla(rs.getString("sigla"));
            return pa;
        }
        catch(Exception e){
            return null;// não tem produto para retornar retorna null
        }
    }
    
    public int getPaisUltimo(){
        String sql ="SELECT (MAX(idpais) + 1 ) as id FROM tblpais";
        this.prepareStmte(sql);
        ResultSet rs;
        int retorno = 0;
        try{
            rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
            rs.first();
            retorno = rs.getInt("id");
        }
        catch(SQLException ex){
            Logger.getLogger(PaisDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
      
    
    public boolean excluir(Pais pa){
        String sql = "DELETE FROM tblpais WHERE idpais = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, pa.getIdPais());//1 significa o 1º que será visto no caso idproduto
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }   
    }
    
    public boolean editar(Pais pais){
        String sql = "UPDATE tblpais SET nome = ?, sigla = ? WHERE idpais = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setString(1, pais.getNome());
            this.stmte.setString(2, pais.getSigla());
            this.stmte.setInt(3, pais.getIdPais());
            this.stmte.executeUpdate();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public ArrayList<Pais> getEstadoByLista(String nome){
       ArrayList<Pais> pais = new ArrayList<Pais>();
        String sql = "SELECT * FROM tblpais WHERE nome LIKE ?";
        
        try
        {
            this.prepareStmte(sql);
            this.stmte.setString(1, "%"+nome+"%");
            ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
           
            while(rs.next())
            {
                Pais pa = new Pais();
                pa.setIdPais(rs.getInt("idpais"));
                pa.setNome(rs.getString("nome"));
                pa.setSigla(rs.getString("sigla"));
                pais.add(pa);
            }
            return pais;
            
        }
        catch(Exception e)
        {
            return null;
        }  
    }
    
    public ArrayList<Pais> getPais(){ //L I S T A
        
        ArrayList<Pais> pais = new ArrayList<>();

        String sql = "SELECT nome FROM tblpais order by nome";
        
               
        try {
            this.prepareStmte(sql);
            ResultSet rs = this.stmte.executeQuery(sql); 
            rs.beforeFirst();
            while (rs.next()) {
                Pais pa = new Pais();
                pa.setNome(rs.getString("nome"));
                pais.add(pa);                
            }
            return pais;
        } catch (Exception e) {
            return null;
        } 
    }
    
}
