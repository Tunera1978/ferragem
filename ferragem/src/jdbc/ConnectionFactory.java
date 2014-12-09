
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import javax.swing.JOptionPane;


public class ConnectionFactory {
    
    public Connection getConnection() {
        try {
            //JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");
            return DriverManager.getConnection("jdbc:mysql://localhost/ferragem", "root", "ifsp");//banco, "usuario", "ifsp"
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //JOptionPane.showMessageDialog(null, "Erro ao Conectar!"+e);
        }
    }
    
}
