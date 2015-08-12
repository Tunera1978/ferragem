/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.ConsultaFerragem;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tune
 */
public class ConsultaFerragemDAO extends GenericDAO{
    public ConsultaFerragemDAO() {
        super();//a classe mãe pega a conexão
    }
    
    
    
    public ArrayList<ConsultaFerragem> getFerragemByLista() {
        ArrayList<ConsultaFerragem> ferragem = new ArrayList<ConsultaFerragem>();
        String sql = "select tblferragem.idferragem, tblferragem.idproduto, tblproduto.descricao, tblusuario.nome, tblferragem.data from tblferragem, tblproduto, tblusuario where tblproduto.idproduto = tblferragem.idproduto and tblusuario.idusuario = tblferragem.idusuario;";

        try {
            this.prepareStmte(sql);
           
            ResultSet rs = this.stmte.executeQuery(); //sempre usar quando fazer uma consulta(SELECT)

            while (rs.next()) {
                ConsultaFerragem f = new ConsultaFerragem();                
                f.setIdferragem(rs.getInt("idFerragem"));
                f.setIdproduto(rs.getInt("idProduto"));
                f.setDescricao(rs.getString("descricao"));
                f.setNome(rs.getString("nome"));
                f.setData(rs.getDate("data"));

                ferragem.add(f);
            }
            return ferragem;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
