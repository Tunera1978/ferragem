
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import javax.swing.JOptionPane;



public class ConnectionFactory {
    
    public Connection getConnection() {
        try {
            //JOptionPane.showMessageDialogadmin    
           return DriverManager.getConnection("jdbc:mysql://127.0.0.1/ferragem", "root", "ifsp");//banco, "usuario", "ifsp"
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //JOptionPane.showMessageDialog(null, "Erro ao Conectar!"+e);
        }
       
    }
    
}
