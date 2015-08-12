package calculodeferragem;

//import beans.Usuario;
//import dao.UsuarioDAO;
import interfaces.TelaPrincipal;
import interfaces.frmSenha;
import javax.swing.UIManager;

public class CalculoDeFerragem {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSenha().setVisible(true);
            }
        });
        
        frmSenha senha = new frmSenha();
        senha.setVisible(true);

        //TelaPrincipal principal = new TelaPrincipal();
        //principal.setVisible(true);
        
        /*Usuario u = new Usuario();
         u.setIdusuario(7);
         u.setNome("Teste");
    
         UsuarioDAO usuarioDAO = new UsuarioDAO();
    
         if(usuarioDAO.inserir(u) == true){
         System.out.println("Usuario Adicionado");
         }
         else{
         System.out.println("Erro ao Adicionar");
         }*/
    }

}
