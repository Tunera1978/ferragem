package calculodeferragem;

//import beans.Usuario;
//import dao.UsuarioDAO;
import interfaces.TelaPrincipal;
import interfaces.frmSenha;
import java.math.BigDecimal;
import javax.swing.UIManager;

public class CalculoDeFerragem
{

  public static void main(String[] args)
  {

    try
    {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch (Exception e)
    {
      System.out.println("Error setting native LAF: " + e);
    }

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
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
     }
        
        
        
     //---------------------------------------------------
     //Calculos
     //---------------------------------------------------
     public double calculoTotalEstribo() {
     double xx = ((this.estriboAltura * 2) + (this.estriboLargura * 2) + 10);
     BigDecimal yy = new BigDecimal(xx);
     yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
     this.estriboTotal = yy.doubleValue();
     return this.estriboTotal;
     }

     public double calculoQtdeEstribos() {
     double xx = ((this.comprimento / (this.espacoEstribo / 100)) * this.qtdeFerragem);
     BigDecimal yy = new BigDecimal(xx);
     yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
     this.qtdeEstribos = yy.doubleValue();
     return this.qtdeEstribos;
     }

     public double calculoQuantidadeBarrasColunas() {
     double xx = (this.qtdeFerragem * this.comprimento * this.qtdeFerro) / 12;
     BigDecimal yy = new BigDecimal(xx);
     yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
     this.quantidadeBarrasColunas = yy.doubleValue();
     return this.quantidadeBarrasColunas;
     }

     public double calculoQuantidadeBarrasEstribos() {
     double xx = ((this.comprimento / (this.espacoEstribo / 100) * this.qtdeFerragem) / (12 / (this.estriboTotal / 100)));
     BigDecimal yy = new BigDecimal(xx);
     yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
     this.quantidadeBarrasEstribos = yy.doubleValue();
     return this.quantidadeBarrasEstribos;
     }

     public double calculoQuantidadeArames() {
     double xx = ((this.comprimento / (this.espacoEstribo / 100) * this.qtdeFerragem) * (this.qtdeFerro / 200));
     BigDecimal yy = new BigDecimal(xx);
     yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
     this.quantidadeArames = yy.doubleValue();
     return this.quantidadeArames;

     } */
  }

}
