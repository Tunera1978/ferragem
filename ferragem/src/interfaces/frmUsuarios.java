package interfaces;

import beans.Nivel;
import beans.Usuario;
import dao.UsuarioDAO;
import dao.NivelDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static utils.ControleForms.musuario;

public class frmUsuarios extends javax.swing.JInternalFrame
{

  private boolean status;
  private UsuarioDAO usuarioDAO;
  private ArrayList<Nivel> list;

  public frmUsuarios()
  {
    initComponents();
    ComboNacesso();
    estadoInicial();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jTextField2 = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    btnDeletar = new javax.swing.JButton();
    btnNovo = new javax.swing.JButton();
    btnBuscar = new javax.swing.JButton();
    btnAlterar = new javax.swing.JButton();
    btnSalvar = new javax.swing.JButton();
    btnCancelar = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    txtCodigo = new javax.swing.JTextField();
    txtNome = new javax.swing.JTextField();
    passSenha1 = new javax.swing.JPasswordField();
    passSenha2 = new javax.swing.JPasswordField();
    cbNivel = new javax.swing.JComboBox();
    txtMensagem = new javax.swing.JTextField();
    jSeparator1 = new javax.swing.JSeparator();

    jTextField2.setText("jTextField2");

    setClosable(true);
    addInternalFrameListener(new javax.swing.event.InternalFrameListener()
    {
      public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt)
      {
      }
      public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt)
      {
      }
      public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt)
      {
        formInternalFrameClosing(evt);
      }
      public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt)
      {
      }
      public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt)
      {
      }
      public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt)
      {
      }
      public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt)
      {
      }
    });

    jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

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

    btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/7938_16x16.png"))); // NOI18N
    btnBuscar.setText("Buscar");
    btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    btnBuscar.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btnBuscarActionPerformed(evt);
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

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
          .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(btnNovo)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnSalvar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnAlterar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnBuscar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnCancelar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnDeletar)
        .addContainerGap(19, Short.MAX_VALUE))
    );

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel1.setText("Cadastro de Usuario");

    jLabel2.setText("Codigo :");

    jLabel3.setText("Nome :");

    jLabel6.setText("Nivel de Acesso :");

    jLabel4.setText("Digite a Senha:");

    jLabel5.setText("Confirme a senha: ");

    txtCodigo.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        txtCodigoActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(120, 120, 120)
            .addComponent(jLabel1))
          .addGroup(layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(passSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addComponent(passSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(10, 10, 10)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(txtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addComponent(jSeparator1)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addComponent(jLabel1)
        .addGap(4, 4, 4)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(7, 7, 7)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2)
              .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel3)
              .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel6)
              .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(23, 23, 23)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel4)
              .addComponent(passSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(passSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(txtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  public void ComboNacesso()
  {

    NivelDAO dAO = new NivelDAO();
    list = dAO.getNivel();
    if (list.isEmpty())
    {
      JOptionPane.showMessageDialog(null, "Cadastre pelo menos um :"
              + "\nMenu - Cadastrar - Cidades");
      this.dispose();
    }
    else
    {
      for (int i = 0; i < list.size(); i++)
      {
        cbNivel.addItem(list.get(i).getDescricao());
      }
    }
  }

  private void estadoInicial()
  {

    txtCodigo.setEditable(false);
    txtNome.setEditable(false);
    txtMensagem.setEditable(false);
    passSenha1.setEditable(false);
    passSenha2.setEditable(false);

    btnAlterar.setEnabled(false);
    btnBuscar.setEnabled(true);
    btnDeletar.setEnabled(false);
    btnNovo.setEnabled(true);
    btnSalvar.setEnabled(false);
    btnCancelar.setEnabled(false);

    limpacampo();

  }

  private void limpacampo()
  {

    txtCodigo.setText("");
    txtNome.setText("");
    txtMensagem.setText("");
    passSenha1.setText("");
    passSenha2.setText("");

  }


  private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeletarActionPerformed
  {//GEN-HEADEREND:event_btnDeletarActionPerformed

    txtMensagem.setText("");

    Usuario u = new Usuario();
    u.setIdusuario(Integer.parseInt(txtCodigo.getText()));
    // u.setNome(txtNome.getText());

    if (this.usuarioDAO.excluir(u) == true)
    {
      txtMensagem.setText("Usuario Excluido com sucesso !");
      estadoInicial();
    }
    else
    {
      txtMensagem.setText("Erro ao Excluir");
    }

    limpacampo();

  }//GEN-LAST:event_btnDeletarActionPerformed

  private void btnNovoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNovoActionPerformed
  {//GEN-HEADEREND:event_btnNovoActionPerformed
    // TODO add your handling code here:
    estadoInicial();
    limpacampo();

    btnSalvar.setEnabled(true);
    btnBuscar.setEnabled(false);
    btnNovo.setEnabled(false);
    btnCancelar.setEnabled(true);

    txtCodigo.setEditable(true);
    status = true;
  }//GEN-LAST:event_btnNovoActionPerformed

  private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarActionPerformed
  {//GEN-HEADEREND:event_btnBuscarActionPerformed
    limpacampo();
    int idusuario = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do usuario!"));
    Usuario u = this.usuarioDAO.getUsuarioById(idusuario);

    if (u == null)
    {
      //JOptionPane.showMessageDialog(null, "Usuario não encontrado");
      txtMensagem.setText("Produto não encontrado !");

    }
    else
    {
      txtCodigo.setText(String.valueOf(u.getIdusuario()));
      txtNome.setText(u.getNome());
      txtMensagem.setText("");
      passSenha1.setText(u.getSenha());
      passSenha2.setText("");

      btnCancelar.setEnabled(true);
      btnNovo.setEnabled(false);
      btnAlterar.setEnabled(true);
      btnDeletar.setEnabled(true);

    }
  }//GEN-LAST:event_btnBuscarActionPerformed

  private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
  {//GEN-HEADEREND:event_btnAlterarActionPerformed
    
    limpacampo();

    txtCodigo.setEditable(false);
    txtNome.setEditable(true);
    passSenha1.setEditable(true);
    passSenha2.setEditable(true);

    btnSalvar.setEnabled(true);
    btnBuscar.setEnabled(false);
    btnNovo.setEnabled(false);
    btnCancelar.setEnabled(true);
    btnDeletar.setEnabled(false);
    btnAlterar.setEnabled(false);

    status = false;

  }//GEN-LAST:event_btnAlterarActionPerformed

  private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalvarActionPerformed
  {//GEN-HEADEREND:event_btnSalvarActionPerformed
   
     Usuario u = new Usuario();

     if (status == (true))
     {
     u.setNome(txtNome.getText());     
     u.setSenha(passSenha1.getText());
     
     if (this.usuarioDAO.inserir(u) == true)
     {

     txtMensagem.setText("Usuario Adicionado com sucesso !");

     } else
     {
     //JOptionPane.showMessageDialog(null, "Erro ao Adicionar");
     txtMensagem.setText("Erro ao Adicionar");
     }
     } else
     {
     //u.setIdusuario(Integer.parseInt(txtIdProduto.getText()));
     u.setNome(txtNome.getText());
     //u.setNivelacesso(cbNivel);
     u.setSenha(passSenha1.getText());
     
     

     if (this.usuarioDAO.editar(u) == true)
     {
     txtMensagem.setText("Usuario Editado");

     } else
     {
     txtMensagem.setText("Erro ao Editar");
     }
     }
     estadoInicial();
  }//GEN-LAST:event_btnSalvarActionPerformed

  private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
  {//GEN-HEADEREND:event_btnCancelarActionPerformed
    // TODO add your handling code here:
    // estadoInicial();
    //txtMensagem.setText("");
    //txtMensagem.setText("Produto não sofreu alteração !");

  }//GEN-LAST:event_btnCancelarActionPerformed

  private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtCodigoActionPerformed
  {//GEN-HEADEREND:event_txtCodigoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtCodigoActionPerformed

  private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_formInternalFrameClosing
  {//GEN-HEADEREND:event_formInternalFrameClosing
    // TODO add your handling code here:
    musuario = 0;
  }//GEN-LAST:event_formInternalFrameClosing


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAlterar;
  private javax.swing.JButton btnBuscar;
  private javax.swing.JButton btnCancelar;
  private javax.swing.JButton btnDeletar;
  private javax.swing.JButton btnNovo;
  private javax.swing.JButton btnSalvar;
  private javax.swing.JComboBox cbNivel;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JTextField jTextField2;
  private javax.swing.JPasswordField passSenha1;
  private javax.swing.JPasswordField passSenha2;
  private javax.swing.JTextField txtCodigo;
  private javax.swing.JTextField txtMensagem;
  private javax.swing.JTextField txtNome;
  // End of variables declaration//GEN-END:variables
}
