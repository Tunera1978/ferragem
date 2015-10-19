
package dao;


import beans.Estado;
import beans.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EstadoDAO extends GenericDAO {
    
    public EstadoDAO(){
        super();//a classe mãe pega a conexão
    }
    
        public boolean inserir(Estado estado){
        String sql = "INSERT INTO tblestado(nome, uf, idpais) VALUES(?, ?, ?)";
        try{
            this.prepareStmte(sql);
            //this.stmte.setInt(1, produto.getIdProduto());
            this.stmte.setString(1, estado.getNome());
            this.stmte.setString(2, estado.getUf());
            this.stmte.setInt(3, estado.getIdpais());
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public Estado getEstadoById(int idestado){
        Estado es = new Estado();
        String sql = "SELECT * FROM tblestado WHERE idestado = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, idestado);//parametro
            ResultSet rs = this.stmte.executeQuery();//return um resultset
            rs.first();//ResultSet na primeira posição
            es.setIdestado(rs.getInt("idestado"));
            es.setNome(rs.getString("nome"));
            es.setUf(rs.getString("uf"));
            es.setIdpais(rs.getInt("idpais"));
            return es;
        }
        catch(Exception e){
            return null;// não tem produto para retornar retorna null
        }
    }
    
    public int getEstadoUltimo(){
        String sql = "SELECT (MAX(idestado) + 1) as id FROM tblestado";
        this.prepareStmte(sql);
        ResultSet rs;
        int retorno = 0;
        try{
            rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
            rs.first();
            retorno = rs.getInt("id");
        }
        catch(SQLException ex){
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
      
    
    public boolean excluir(Estado es){
        String sql = "DELETE FROM tblestado WHERE idestado = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, es.getIdestado());//1 significa o 1º que será visto no caso idproduto
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }   
    }
    
    public boolean editar(Estado estado){
        String sql = "UPDATE tblestado SET nome = ?, uf = ?, idpais = ? WHERE idestado = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setString(2, estado.getNome());
            this.stmte.setString(3, estado.getUf());
            this.stmte.setInt(4, estado.getIdpais());
            this.stmte.setInt(1, estado.getIdestado());
            this.stmte.executeUpdate();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public ArrayList<Estado> getEstadoByLista(String nome){
       ArrayList<Estado> estado = new ArrayList<Estado>();
        String sql = "SELECT * FROM tblestado WHERE nome LIKE ?";
        
        try
        {
            this.prepareStmte(sql);
            this.stmte.setString(1, "%"+nome+"%");
            ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
           
            while(rs.next())
            {
                Estado es = new Estado();
                es.setIdestado(rs.getInt("idestado"));
                es.setNome(rs.getString("nome"));
                es.setUf(rs.getString("uf"));
                es.setIdpais(rs.getInt("idpais"));
                estado.add(es);
            }
            return estado;
            
        }
        catch(Exception e)
        {
            return null;
        }  
    }
    
    public ArrayList<Estado> getEstados(){ //L I S T A
        
        ArrayList<Estado> estado = new ArrayList<>();

        String sql = "SELECT * FROM tblestado order by nome";
        
               
        try {
            this.prepareStmte(sql);
            ResultSet rs = this.stmte.executeQuery(sql); //sempre usar quando fazer uma consulta(SELECT)
            rs.beforeFirst();
            while (rs.next()) {
                Estado es = new Estado();
                es.setNome(rs.getString("nome"));
                estado.add(es);                //fazer no o mesmo no DAO Estado
            }
            return estado;
        } catch (Exception e) {
            return null;
        } 
    }
    
}
