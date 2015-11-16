
package jdbc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import utils.ScriptRunner;
//import javax.swing.JOptionPane;



public class ConnectionFactory {
    
    public Connection getConnection() {
      
      Connection conn = null;
      
        try {
            //JOptionPane.showMessageDialogadmin    
           //return DriverManager.getConnection("jdbc:mysql://127.0.0.1/ferragem", "root", "ifsp");//banco, "usuario", "ifsp"
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/ferragem", "root", "ifsp");//banco, "usuario", "ifsp";
            
            ScriptRunner runner = new ScriptRunner(conn, true, true);
            runner.runScript(new BufferedReader(new FileReader("Dump20150811.sql")));
            
        } catch (SQLException e) {
            System.out.println("Erro com o BD");
            System.out.println(e.getMessage());
            //throw new Runtimexception(e);
            //JOptionPane.showMessageDialog(null, "Erro ao Conectar!"+e);
        } catch (IOException e) {
            System.out.println("Erro com o arquivo");
            System.out.println(e.getMessage());
        }
       
        return conn;
    }
    
    
    public Connection cria() {
      
      Connection conn = null;
      
        try {
            //JOptionPane.showMessageDialogadmin    
           //return DriverManager.getConnection("jdbc:mysql://127.0.0.1/ferragem", "root", "ifsp");//banco, "usuario", "ifsp"
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1", "root", "ifsp");//banco, "usuario", "ifsp";
            
            URL path = ScriptRunner.class.getResource("Dump20150811.sql");
            File f = new File(path.getFile());

            ScriptRunner runner = new ScriptRunner(conn, true, true);
            runner.runScript(new BufferedReader(new FileReader(f)));
            
            System.exit(0);
            
        } catch (SQLException e) {
            System.out.println("Erro com o BD");
            System.out.println(e.getMessage());
            //throw new Runtimexception(e);
            //JOptionPane.showMessageDialog(null, "Erro ao Conectar!"+e);
        } catch (FileNotFoundException e) {
            System.out.println("Não encontrou o arquivo");
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println("Erro com o arquivo");
            System.out.println(e.getMessage());
        }
       
        return conn;
    }
}
