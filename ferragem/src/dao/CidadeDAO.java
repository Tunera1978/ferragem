
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import beans.Cidade;

public class CidadeDAO extends GenericDAO {

    public CidadeDAO() {
        super(); //chama o contrutor da classe mãe extendida(GenericDAO)
    }

    public int AutoIncID() {
        String sql = "SELECT (MAX(idCidade) + 1) as id FROM tblCidade";
        this.prepareStmte(sql);
        ResultSet rs;
        int retorno = 0;
        try {
            rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)
            rs.first();
            retorno = rs.getInt("id");
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return retorno;

    }

    public boolean inserir(Cidade idioma) {
        String sql = "INSERT INTO tblCidade (idCidade, nome,idestado) VALUES (?, ?, ?)";

        try {
            this.prepareStmte(sql);
            this.stmte.setInt(1, idioma.getIdcidade());
            this.stmte.setString(2, idioma.getNome());
            this.stmte.setInt(3, idioma.getIdestado());
            this.stmte.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean excluir(Cidade idioma) {
        String sql = "DELETE FROM tblCidade WHERE idCidade = ?";

        try {
            this.prepareStmte(sql);
            this.stmte.setInt(1, idioma.getIdcidade());
            //this.stmte.execute();

            int exec = this.stmte.executeUpdate();

            if (exec > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean editar(Cidade idioma) {
        String sql = "UPDATE tblCidade SET nome = ?, idestado = ? WHERE idCidade = ?";

        try {
            this.prepareStmte(sql);
            //this.stmte.setInt(1, idioma.getIdcidade());
            this.stmte.setInt(1, idioma.getIdcidade());
            this.stmte.setString(2, idioma.getNome());
            this.stmte.setInt(3, idioma.getIdestado());
            this.stmte.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    /*
    PARAMENTRO = 1 ORDENA PELO ID
    PARAMENTRO = 2 ORDENA PELO NOME DO IDIOMA
    */
    public ArrayList<Cidade> getCidades() //L I S T A
    {
        ArrayList<Cidade> cidade = new ArrayList<>();

        String sql = "SELECT * FROM tblCidade order by nome";
        
               
        try {
            this.prepareStmte(sql);
            ResultSet rs = this.stmte.executeQuery(sql); //sempre usar quando fazer uma consulta(SELECT)
            rs.beforeFirst();
            while (rs.next()) {
                Cidade i = new Cidade();
                i.setNome(rs.getString("nome"));
                cidade.add(i);                
            }
            return cidade;
        } catch (Exception e) {
            return null;
        } 
    }        

    public ArrayList getCidadesByID(int idCidade) 
    {
        ArrayList idioma = new ArrayList<>();
        String sql = "SELECT * FROM tblrelacionamento inner join tblCidade "
                + " on (tblrelacionamento.ididioma = tblidioma.idCidade) "
                + " where prontuario = ? group by tblCidade.idCidade;";
        try {
            this.prepareStmte(sql);
            this.stmte.setInt(1, idCidade);
            ResultSet rs = this.stmte.executeQuery();
            rs.beforeFirst();
            while (rs.next()) {
                Cidade i = new Cidade();
                i.setIdcidade(rs.getInt("idCidade"));
                i.setNome(rs.getString("Descricao"));
                idioma.add(i);
            }
            return idioma;
        } catch (SQLException e) {
            return null;
        }        
    }
    
    public Cidade getCidade(String nome) {

        Cidade iVO = new Cidade();
        String sql = "SELECT * FROM tblCidade WHERE descricao = ?";
        try {
            
            this.prepareStmte(sql);
            this.stmte.setString(1, nome);
            ResultSet rs = this.stmte.executeQuery();

            rs.first();
            iVO.setIdcidade(rs.getInt("idCidade"));

            stmte.close();
            this.closeAll();
            rs.close();
            return iVO;

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Ocorreu um erro no metodo getCategoria, classe CategoriaDAO" + ex);
            return null;
        }
    }
    
    public List<Cidade> listarCidades() {
        
        try {
                String sql = "SELECT * FROM tblCidade";
                this.prepareStmte(sql);                          

            ResultSet rs = this.stmte.executeQuery();
            //monta o array 
            ArrayList<Cidade> listaCidades = new ArrayList<>();
           // List<Cidade> listaCidades = new ArrayList<Cidade>;
            while (rs.next()) {
                Cidade iVO = new Cidade();
                iVO.setNome(rs.getString("nome"));
                listaCidades.add(iVO);
            }
            rs.close();
            //stmte.close();
            this.closeAll();
            return listaCidades;
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Ocorreu um erro no metodo listaEditora, classe Editora" + ex);
            return null;
        }
    }
}
