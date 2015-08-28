package interfaces;

import beans.Usuario;
import dao.GenericDAO;
import dao.UsuarioDAO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class frmSenha extends javax.swing.JFrame {
    
    private UsuarioDAO usuarioDAO;
    public static String UsuarioLogado;
    public static int IdUsuarioLogado;

    public frmSenha() {
        initComponents();
        this.usuarioDAO = new UsuarioDAO();
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    txtNome = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtSenha = new javax.swing.JPasswordField();
    btnEntrar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter()
    {
      public void windowActivated(java.awt.event.WindowEvent evt)
      {
        formWindowActivated(evt);
      }
    });

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gerdal.jpg"))); // NOI18N

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel2.setText("Calculo de Ferragem");

    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

    jLabel3.setText("Usuário");

    jLabel4.setText("Senha");

    txtSenha.addKeyListener(new java.awt.event.KeyAdapter()
    {
      public void keyPressed(java.awt.event.KeyEvent evt)
      {
        txtSenhaKeyPressed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel4)
          .addComponent(jLabel3)
          .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
          .addComponent(txtSenha))
        .addContainerGap(29, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(22, Short.MAX_VALUE))
    );

    btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/11503_32x32.png"))); // NOI18N
    btnEntrar.setText("Entrar");
    btnEntrar.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btnEntrarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2))
              .addGroup(layout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(21, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(62, 62, 62))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addGap(42, 42, 42)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(33, 33, 33)
            .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(19, 19, 19)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    setSize(new java.awt.Dimension(437, 349));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
       
        Usuario u = new Usuario();
        String nome = txtNome.getText();
        char[] pass = txtSenha.getPassword();
        String senha = String.valueOf(pass);
        u = this.usuarioDAO.getUsuarioBySenha(nome, senha);

        if (u == null) {

            JOptionPane.showMessageDialog(null, "Usuario ou senha não conferem !");

        } else {
            
            UsuarioLogado = txtNome.getText();
            IdUsuarioLogado = u.getIdusuario();
            TelaPrincipal principal = new TelaPrincipal();
            principal.setVisible(true);
            this.setVisible(false);

        }

    }//GEN-LAST:event_btnEntrarActionPerformed

  private void formWindowActivated(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowActivated
  {//GEN-HEADEREND:event_formWindowActivated
    // TODO add your handling code here:
    GenericDAO g = new GenericDAO();
    g.inicializaBanco();
  }//GEN-LAST:event_formWindowActivated

  private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtSenhaKeyPressed
  {//GEN-HEADEREND:event_txtSenhaKeyPressed
    // TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER){     
       Usuario u = new Usuario();
        String nome = txtNome.getText();
        char[] pass = txtSenha.getPassword();
        String senha = String.valueOf(pass);
        u = this.usuarioDAO.getUsuarioBySenha(nome, senha);

        if (u == null) {

            JOptionPane.showMessageDialog(null, "Usuario ou senha não conferem !");

        } else {
            
            UsuarioLogado = txtNome.getText();
            IdUsuarioLogado = u.getIdusuario();
            TelaPrincipal principal = new TelaPrincipal();
            principal.setVisible(true);
            this.setVisible(false);
            

        }
      
      
    }  
  }//GEN-LAST:event_txtSenhaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSenha().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnEntrar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField txtNome;
  private javax.swing.JPasswordField txtSenha;
  // End of variables declaration//GEN-END:variables
}
