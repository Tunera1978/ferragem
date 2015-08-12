package dao;

import beans.ConsultaFerragem;
import beans.Ferragem;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FerragemDAO extends GenericDAO {

    public FerragemDAO() {
        super();//a classe mãe pega a conexão
    }

    public boolean inserir(Ferragem ferragem) {
        String sql = "INSERT INTO tblferragem(qtdeFerragem, estriboLargura, estriboAltura, comprimento, qtdeFerro, idUsuario, idProduto, espacoEstribo, diametro, data) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            this.prepareStmte(sql);

            this.stmte.setInt(1, ferragem.getQtdeFerragem());
            this.stmte.setDouble(2, ferragem.getEstriboLargura());
            this.stmte.setDouble(3, ferragem.getEstriboAltura());
            this.stmte.setDouble(4, ferragem.getComprimento());
            this.stmte.setDouble(5, ferragem.getQtdeFerro());
            this.stmte.setInt(6, ferragem.getIdUsuario());
            this.stmte.setInt(7, ferragem.getIdProduto());
            this.stmte.setDouble(8, ferragem.getEspacoEstribo());
            this.stmte.setString(9, ferragem.getDiametro());
            this.stmte.setString(10, ferragem.getData());

            this.stmte.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean excluir(Ferragem u) {
        String sql = "DELETE FROM tblferragem WHERE idferragem = ?";
        try {
            this.prepareStmte(sql);
            this.stmte.setInt(1, u.getIdFerragem());//1 significa o 1º que será visto no caso idferragem
            this.stmte.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean editar(Ferragem ferragem) {
        String sql = "UPDATE tblferragem SET qtdeFerragem = ?, estriboLargura = ?, estriboAltura = ?, comprimento = ?, qtdeFerro = ?, idUsuario = ?, idProduto = ?, espacoEstribo = ?, diametro = ? WHERE idferragem = ?";
        try {
            this.prepareStmte(sql);
            this.stmte.setInt(10, ferragem.getIdFerragem());

            this.stmte.setInt(1, ferragem.getQtdeFerragem());
            this.stmte.setDouble(2, ferragem.getEstriboLargura());
            this.stmte.setDouble(3, ferragem.getEstriboAltura());
            this.stmte.setDouble(4, ferragem.getComprimento());
            this.stmte.setDouble(5, ferragem.getQtdeFerro());
            this.stmte.setInt(6, ferragem.getIdUsuario());
            this.stmte.setInt(7, ferragem.getIdProduto());
            this.stmte.setDouble(8, ferragem.getEspacoEstribo());
            this.stmte.setString(9, ferragem.getDiametro());

            this.stmte.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Ferragem getFerragemById(int idferragem) {
        Ferragem u = new Ferragem();
        String sql = "SELECT * FROM tblferragem WHERE idferragem = ?";
        try {
            this.prepareStmte(sql);
            this.stmte.setInt(1, idferragem);//parametro
            ResultSet rs = this.stmte.executeQuery();//return um resultset
            rs.first();//ResultSet na primeira posição
            u.setIdFerragem(rs.getInt("idFerragem"));
            u.setQtdeFerragem(rs.getInt("qtdeFerragem"));
            u.setEstriboLargura(rs.getDouble("estriboLargura"));
            u.setEstriboAltura(rs.getDouble("estriboAltura"));
            u.setComprimento(rs.getDouble("comprimento"));
            u.setQtdeFerro(rs.getDouble("qtdeFerro"));
            u.setIdUsuario(rs.getInt("idUsuario"));
            u.setIdProduto(rs.getInt("idProduto"));
            u.setEspacoEstribo(rs.getDouble("espacoEstribo"));
            u.setDiametro(rs.getString("diametro"));
            return u;
        } catch (Exception e) {
            return null;// não tem ferragem para retornar retorna null
        }
    }

    public Ferragem getFerragemByMax() {
        Ferragem u = new Ferragem();
        String sql = "select max(tblferragem.idferragem) FROM tblferragem;";
        try {
            this.prepareStmte(sql);
            ResultSet rs = this.stmte.executeQuery();//return um resultset
            System.out.println(u);
            while (rs.next()) {
                System.out.println(u);
                // u = new Ferragem();
                u.setIdFerragem(rs.getInt("idferragem"));
                System.out.println(u);
            }
            System.out.println(u);
            return u;
        } catch (Exception e) {
            return null;// não tem ferragem para retornar retorna null
        }
    }

    public ArrayList<Ferragem> getFerragemByMaxId() {
        ArrayList<Ferragem> ferragem = new ArrayList<Ferragem>();
        String sql = "select max(tblferragem.idferragem) FROM tblferragem;";

        try {
            this.prepareStmte(sql);

            ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)

            while (rs.next()) {
                Ferragem f = new Ferragem();
                f.setIdFerragem(rs.getInt("idferragem"));
                ferragem.add(f);
            }
            return ferragem;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

}
