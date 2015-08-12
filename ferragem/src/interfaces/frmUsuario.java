package interfaces;

import beans.Usuario;
import beans.Nivel;
import dao.UsuarioDAO;
import dao.NivelDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import utils.AceitaNumeros;
import utils.AceitaStrings;
import utils.LimitarLetras;
import utils.LimitarNumeros;

public class frmUsuario extends javax.swing.JInternalFrame {

    private boolean status;
    private UsuarioDAO usuarioDAO;
    private ArrayList<Nivel> listarNivel;

    public frmUsuario() {
        initComponents();
        this.usuarioDAO = new UsuarioDAO();

        txtNome.setDocument(new LimitarLetras(45));
        // txtSenha.setDocument(new LimitarLetras(10));
        //comboNivel.

        estadoInicial();

    }

    private void estadoInicial() {
        txtIdUsuario.setText("");
        txtNome.setText("");
        txtSenha.setText("");
        txtSenha1.setText("");

        txtNome.setEditable(false);
        txtSenha.setEditable(false);
        txtSenha1.setEditable(false);
        comboNivel.setEditable(false);

        btnAlterar.setEnabled(false);
        btnBuscar.setEnabled(true);
        btnDeletar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);

        status = false;
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    txtIdUsuario = new javax.swing.JTextField();
    txtNome = new javax.swing.JTextField();
    filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
    jPanel1 = new javax.swing.JPanel();
    btnSalvar = new javax.swing.JButton();
    btnAlterar = new javax.swing.JButton();
    btnDeletar = new javax.swing.JButton();
    btnNovo = new javax.swing.JButton();
    btnBuscar = new javax.swing.JButton();
    btnCancelar = new javax.swing.JButton();
    txtMensagem = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtSenha = new javax.swing.JPasswordField();
    jLabel5 = new javax.swing.JLabel();
    txtSenha1 = new javax.swing.JPasswordField();
    jLabel6 = new javax.swing.JLabel();
    comboNivel = new javax.swing.JComboBox();

    setClosable(true);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel1.setText("Cadastro de Usuario");

    jLabel2.setText("Codigo :");

    jLabel3.setText("Nome :");

    txtIdUsuario.setEditable(false);

    txtNome.setEditable(false);

    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    jPanel1.setForeground(new java.awt.Color(102, 102, 102));

    btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/7171_16x16.png"))); // NOI18N
    btnSalvar.setText("Salvar");
    btnSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnSalvar.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btnSalvarActionPerformed(evt);
      }
    });

    btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8412_16x16.png"))); // NOI18N
    btnAlterar.setText("Alterar");
    btnAlterar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnAlterar.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btnAlterarActionPerformed(evt);
      }
    });

    btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8408_16x16.png"))); // NOI18N
    btnDeletar.setText("Deletar");
    btnDeletar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnDeletar.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btnDeletarActionPerformed(evt);
      }
    });

    btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/838_16x16.png"))); // NOI18N
    btnNovo.setText("Novo");
    btnNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnNovo.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btnNovoActionPerformed(evt);
      }
    });

    btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8428_16x16.png"))); // NOI18N
    btnBuscar.setText("Buscar");
    btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnBuscar.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btnBuscarActionPerformed(evt);
      }
    });

    btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8398_16x16.png"))); // NOI18N
    btnCancelar.setText("Cancelar");
    btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnCancelar.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btnCancelarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnDeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(btnNovo)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnSalvar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnBuscar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnAlterar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnCancelar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnDeletar)
        .addContainerGap(32, Short.MAX_VALUE))
    );

    txtMensagem.setEditable(false);
    txtMensagem.setForeground(new java.awt.Color(204, 0, 0));
    txtMensagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txtMensagem.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        txtMensagemActionPerformed(evt);
      }
    });

    jLabel4.setText("Digite a Senha:");

    txtSenha.setEditable(false);

    jLabel5.setText("Confirme a senha: ");

    txtSenha1.setEditable(false);

    jLabel6.setText("Nivel de Acesso :");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel1)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdUsuario))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel5)
                  .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtSenha)
                  .addComponent(txtSenha1)))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(comboNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        .addGap(18, 18, 18)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(txtMensagem)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2)
              .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel3)
              .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel6)
              .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4)
              .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel5)
              .addComponent(txtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(txtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:

        Usuario u = new Usuario();
        Nivel n = new Nivel();

        if (txtSenha.getText().equals(txtSenha1.getText())) {

            if (status == (true)) {

                u.setNome(txtNome.getText());
                char[] pass = txtSenha.getPassword();
                u.setSenha(String.valueOf(pass));
                

                if (this.usuarioDAO.inserir(u) == true) {

                    txtMensagem.setText("Usuario Adicionado");
                    estadoInicial();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao Adicionar");
                    txtMensagem.setText("Erro ao Adicionar");
                }
            } else {

                u.setIdusuario(Integer.parseInt(txtIdUsuario.getText()));
                u.setNome(txtNome.getText());
                char[] pass = txtSenha.getPassword();
                u.setSenha(String.valueOf(pass));
                
                //String DescricaoNivel = comboNivel.getText();
                //n.
                
               // u.setNivelacesso(WIDTH);

                if (this.usuarioDAO.editar(u) == true) {
                    txtMensagem.setText("Usuario Editado");
                    txtIdUsuario.setText("");
                    txtNome.setText("");
                } else {
                    txtMensagem.setText("Erro ao Editar");
                }

            }
            estadoInicial();
        } else {

            txtMensagem.setText("Senha esta diferente !!!");
            txtSenha.grabFocus();
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        txtMensagem.setText("");
        Usuario u = new Usuario();
        u.setIdusuario(Integer.parseInt(txtIdUsuario.getText()));

        if (this.usuarioDAO.excluir(u) == true) {
            txtMensagem.setText("Usuario Excluido com sucesso !");
            estadoInicial();
        } else {
            txtMensagem.setText("Erro ao Excluir");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:

        txtMensagem.setText("");
        status = false;
        txtNome.setEditable(true);
        txtSenha.setEditable(true);
        txtSenha1.setEditable(false);
        btnBuscar.setEnabled(false);
        btnNovo.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnAlterar.setEnabled(false);

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        txtMensagem.setText("");

        int idusuario = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da busca!"));
        Usuario u = this.usuarioDAO.getUsuarioById(idusuario);

        if (u == null) {
            //JOptionPane.showMessageDialog(null, "Usuario não encontrado");
            txtMensagem.setText("Usuario não encontrado !");

        } else {
            txtIdUsuario.setText(String.valueOf(u.getIdusuario()));
            txtNome.setText(u.getNome());
            txtSenha.setEditable(false);
            txtSenha1.setEditable(false);
            btnCancelar.setEnabled(true);
            btnNovo.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnDeletar.setEnabled(true);

        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        txtMensagem.setText("");
        estadoInicial();
        btnSalvar.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnNovo.setEnabled(false);
        btnCancelar.setEnabled(true);
        txtNome.setEditable(true);
        txtSenha.setEditable(true);
        txtSenha1.setEditable(true);
        status = true;

        //SELECT MAX(ID) FROM Tabela 

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        estadoInicial();
        txtMensagem.setText("");

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void CarregandoCmboxNivel() {
        NivelDAO dAO = new NivelDAO();
        listarNivel = dAO.getNivel(1);
        if (listarNivel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cadastre pelo menos um idioma em:"
                    + "\nMenu - Cadastrar - Nivels");
            this.dispose();
        } else {
            for (int i = 0; i < listarNivel.size(); i++) {
                comboNivel.addItem(listarNivel.get(i).getDescricao());
            }
        }
    }
    
    
    private void txtMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensagemActionPerformed

    

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAlterar;
  private javax.swing.JButton btnBuscar;
  private javax.swing.JButton btnCancelar;
  private javax.swing.JButton btnDeletar;
  private javax.swing.JButton btnNovo;
  private javax.swing.JButton btnSalvar;
  private javax.swing.JComboBox comboNivel;
  private javax.swing.Box.Filler filler1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JTextField txtIdUsuario;
  private javax.swing.JTextField txtMensagem;
  private javax.swing.JTextField txtNome;
  private javax.swing.JPasswordField txtSenha;
  private javax.swing.JPasswordField txtSenha1;
  // End of variables declaration//GEN-END:variables
}
