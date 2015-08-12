
package dao;


import beans.Produto;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutoDAO extends GenericDAO {
    
    public ProdutoDAO(){
        super();//a classe mãe pega a conexão
    }
    
        public boolean inserir(Produto produto){
        String sql = "INSERT INTO tblproduto(descricao, pesoBarra) VALUES(?, ?)";
        try{
            this.prepareStmte(sql);
            //this.stmte.setInt(1, produto.getIdProduto());
            this.stmte.setString(1, produto.getDescricao());
            this.stmte.setFloat(2, produto.getPeso() );
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public Produto getProdutoById(int idproduto){
        Produto u = new Produto();
        String sql = "SELECT * FROM tblproduto WHERE idproduto = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, idproduto);//parametro
            ResultSet rs = this.stmte.executeQuery();//return um resultset
            rs.first();//ResultSet na primeira posição
            u.setIdProduto(rs.getInt("idProduto"));
            u.setDescricao(rs.getString("descricao"));
            return u;
        }
        catch(Exception e){
            return null;// não tem produto para retornar retorna null
        }
    }
    
    public boolean excluir(Produto u){
        String sql = "DELETE FROM tblproduto WHERE idproduto = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(1, u.getIdProduto());//1 significa o 1º que será visto no caso idproduto
            this.stmte.execute();
            return true;
        }
        catch(Exception e){
            return false;
        }   
    }
    
    public boolean editar(Produto produto){
        String sql = "UPDATE tblproduto SET descricao = ? WHERE idproduto = ?";
        try{
            this.prepareStmte(sql);
            this.stmte.setInt(2, produto.getIdProduto());
            this.stmte.setString(1, produto.getDescricao());
            this.stmte.executeUpdate();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public ArrayList<Produto> getProdutoByLista(String descricao){
       ArrayList<Produto> produto = new ArrayList<Produto>();
        String sql = "SELECT * FROM tblproduto WHERE descricao LIKE ?";
        
        try
        {
            this.prepareStmte(sql);
            this.stmte.setString(1, "%"+descricao+"%");
            ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
           
            while(rs.next())
            {
                Produto u = new Produto();
                u.setIdProduto(rs.getInt("idproduto"));
                u.setDescricao(rs.getString("descricao"));                
                produto.add(u);
            }
            return produto;
            
        }
        catch(Exception e)
        {
            return null;
        }  
    }
    
}
