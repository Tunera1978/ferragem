package interfaces;

//import java.awt.Rectangle;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import java.util.Date;
//import utils.ControleForms;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import javax.swing.JDesktopPane;
//import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static utils.ControleForms.mcliente;
import static utils.ControleForms.mnivel;
import static utils.ControleForms.mproduto;
import static utils.ControleForms.musuario;

public class TelaPrincipal extends javax.swing.JFrame
{

  //ControleForms cf = new ControleForms();
  public TelaPrincipal()
  {
    initComponents();
    txtDataHora.setText(getDateTime());
    txtLogin.setText(frmSenha.UsuarioLogado);

  }

  private String getDateTime()
  {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    return dateFormat.format(date);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jMenuBar2 = new javax.swing.JMenuBar();
    jMenu6 = new javax.swing.JMenu();
    jMenu7 = new javax.swing.JMenu();
    jMenuBar3 = new javax.swing.JMenuBar();
    jMenu8 = new javax.swing.JMenu();
    jMenu9 = new javax.swing.JMenu();
    jMenu10 = new javax.swing.JMenu();
    DesktopPane = new javax.swing.JDesktopPane();
    jToolBar1 = new javax.swing.JToolBar();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();
    jButton6 = new javax.swing.JButton();
    jButton7 = new javax.swing.JButton();
    txtDataHora = new javax.swing.JFormattedTextField();
    txtLogin = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jMenuBar1 = new javax.swing.JMenuBar();
    menuCadastro = new javax.swing.JMenu();
    menuUsuario = new javax.swing.JMenuItem();
    menuProduto = new javax.swing.JMenuItem();
    menuCliente = new javax.swing.JMenuItem();
    menuNivel = new javax.swing.JMenuItem();
    menuCidade = new javax.swing.JMenuItem();
    menuCalculo = new javax.swing.JMenu();
    jMenuItem3 = new javax.swing.JMenuItem();
    menuPedFerragem = new javax.swing.JMenuItem();
    menuPedSapata = new javax.swing.JMenuItem();
    jMenu3 = new javax.swing.JMenu();
    jMenuItem4 = new javax.swing.JMenuItem();
    jMenuItem5 = new javax.swing.JMenuItem();
    jMenuItem6 = new javax.swing.JMenuItem();
    jMenuItem13 = new javax.swing.JMenuItem();
    jMenu11 = new javax.swing.JMenu();
    jMenuItem12 = new javax.swing.JMenuItem();
    jMenuItem16 = new javax.swing.JMenuItem();
    jMenuItem17 = new javax.swing.JMenuItem();
    jMenuItem18 = new javax.swing.JMenuItem();
    jMenuItem19 = new javax.swing.JMenuItem();
    jMenu4 = new javax.swing.JMenu();
    jMenu5 = new javax.swing.JMenu();

    jMenu6.setText("File");
    jMenuBar2.add(jMenu6);

    jMenu7.setText("Edit");
    jMenuBar2.add(jMenu7);

    jMenu8.setText("File");
    jMenuBar3.add(jMenu8);

    jMenu9.setText("Edit");
    jMenuBar3.add(jMenu9);

    jMenu10.setText("jMenu10");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Calculo de Ferragens");
    setExtendedState(6);
    setMinimumSize(new java.awt.Dimension(800, 600));
    setModalExclusionType(null);
    setUndecorated(true);

    DesktopPane.setBackground(new java.awt.Color(153, 153, 153));
    DesktopPane.setForeground(new java.awt.Color(153, 153, 153));

    javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
    DesktopPane.setLayout(DesktopPaneLayout);
    DesktopPaneLayout.setHorizontalGroup(
      DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    DesktopPaneLayout.setVerticalGroup(
      DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 1060, Short.MAX_VALUE)
    );

    jToolBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jToolBar1.setRollover(true);

    jButton1.setFocusable(false);
    jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton1);

    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/7837_32x32.png"))); // NOI18N
    jButton2.setToolTipText("Usuários");
    jButton2.setFocusable(false);
    jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton2.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton2ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton2);

    jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2866_32x32.png"))); // NOI18N
    jButton5.setToolTipText("Produtos");
    jButton5.setFocusable(false);
    jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton5.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton5ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton5);

    jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2153_32x32.png"))); // NOI18N
    jButton6.setToolTipText("Ferragens");
    jButton6.setFocusable(false);
    jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton6.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton6ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton6);

    jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/6947_32x32.png"))); // NOI18N
    jButton7.setToolTipText("Sair");
    jButton7.setFocusable(false);
    jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton7.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton7ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton7);

    txtDataHora.setEditable(false);
    txtDataHora.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        txtDataHoraActionPerformed(evt);
      }
    });

    txtLogin.setEditable(false);

    jLabel2.setText("Data : ");

    jLabel3.setText("User:");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 406, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );

    menuCadastro.setText("Cadastros");

    menuUsuario.setText("Usuarios");
    menuUsuario.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        menuUsuarioActionPerformed(evt);
      }
    });
    menuCadastro.add(menuUsuario);

    menuProduto.setText("Produtos");
    menuProduto.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        menuProdutoActionPerformed(evt);
      }
    });
    menuCadastro.add(menuProduto);

    menuCliente.setText("Clientes");
    menuCliente.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        menuClienteActionPerformed(evt);
      }
    });
    menuCadastro.add(menuCliente);

    menuNivel.setText("Nivel");
    menuNivel.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        menuNivelActionPerformed(evt);
      }
    });
    menuCadastro.add(menuNivel);

    menuCidade.setText("Cidade");
    menuCidade.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        menuCidadeActionPerformed(evt);
      }
    });
    menuCadastro.add(menuCidade);

    jMenuBar1.add(menuCadastro);

    menuCalculo.setText("Calculos");

    jMenuItem3.setText("Ferragem Simples");
    jMenuItem3.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jMenuItem3ActionPerformed(evt);
      }
    });
    menuCalculo.add(jMenuItem3);

    menuPedFerragem.setText("Pedido Ferragem");
    menuPedFerragem.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        menuPedFerragemActionPerformed(evt);
      }
    });
    menuCalculo.add(menuPedFerragem);

    menuPedSapata.setText("Pedido Sapata");
    menuCalculo.add(menuPedSapata);

    jMenuBar1.add(menuCalculo);

    jMenu3.setText("Consultas");

    jMenuItem4.setText("Usuário");
    jMenuItem4.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jMenuItem4ActionPerformed(evt);
      }
    });
    jMenu3.add(jMenuItem4);

    jMenuItem5.setText("Produto");
    jMenuItem5.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jMenuItem5ActionPerformed(evt);
      }
    });
    jMenu3.add(jMenuItem5);

    jMenuItem6.setText("Ferragem");
    jMenuItem6.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jMenuItem6ActionPerformed(evt);
      }
    });
    jMenu3.add(jMenuItem6);

    jMenuItem13.setText("Logs");
    jMenu3.add(jMenuItem13);

    jMenuBar1.add(jMenu3);

    jMenu11.setText("Relatórios");

    jMenuItem12.setText("Clientes");
    jMenu11.add(jMenuItem12);

    jMenuItem16.setText("Usuários");
    jMenu11.add(jMenuItem16);

    jMenuItem17.setText("Produtos");
    jMenu11.add(jMenuItem17);

    jMenuItem18.setText("Pedidos");
    jMenu11.add(jMenuItem18);

    jMenuItem19.setText("Logs de Acesso");
    jMenu11.add(jMenuItem19);

    jMenuBar1.add(jMenu11);

    jMenu4.setText("Sobre");
    jMenuBar1.add(jMenu4);

    jMenu5.setText("Sair");
    jMenu5.addMouseListener(new java.awt.event.MouseAdapter()
    {
      public void mouseClicked(java.awt.event.MouseEvent evt)
      {
        jMenu5MouseClicked(evt);
      }
    });
    jMenu5.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jMenu5ActionPerformed(evt);
      }
    });
    jMenuBar1.add(jMenu5);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(DesktopPane)
            .addContainerGap())
          .addGroup(layout.createSequentialGroup()
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin)
                .addContainerGap())
              .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(5, 5, 5)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2)
              .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3)
              .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(DesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    setSize(new java.awt.Dimension(1016, 741));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents


    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      // TODO add your handling code here:
      JInternalFrame frmFerragem = new frmFerragem();
      this.DesktopPane.add(frmFerragem);
      frmFerragem.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
      // TODO add your handling code here:

      System.exit(0);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      // TODO add your handling code here:
      JInternalFrame frmConsultaUsuario = new frmConsultaUsuario();
      this.DesktopPane.add(frmConsultaUsuario);
      frmConsultaUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      // TODO add your handling code here:
      JInternalFrame frmConsultaFerragem = new frmConsultaFerragem();
      this.DesktopPane.add(frmConsultaFerragem);
      frmConsultaFerragem.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      // TODO add your handling code here:
      JInternalFrame frmConsultaProduto = new frmConsultaProduto();
      this.DesktopPane.add(frmConsultaProduto);
      frmConsultaProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void txtDataHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataHoraActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_txtDataHoraActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      // TODO add your handling code here:

      System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      // TODO add your handling code here:
      JInternalFrame frmUsuario = new frmUsuario();
      this.DesktopPane.add(frmUsuario);
      frmUsuario.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      // TODO add your handling code here:
      /* JInternalFrame frmProduto = new frmProduto();
       this.DesktopPane.add(frmProduto);
       frmProduto.setVisible(true); 
       if (cf.isMproduto() == false)
       {
       cf.setMproduto(true);
       JInternalFrame frmProduto = new frmProduto();
       this.DesktopPane.add(frmProduto);
       frmProduto.setVisible(true);
       }
       */

      JInternalFrame frmProduto = new frmProduto();
      this.DesktopPane.add(frmProduto);
      frmProduto.setVisible(true);
      try
      {
        if (frmProduto.isVisible())
        {
          DesktopPane.remove(frmProduto);
          DesktopPane.add(frmProduto);
          frmProduto.setLocation(DesktopPane.getWidth() / 2 - frmProduto.getWidth() / 2, DesktopPane.getHeight() / 2 - frmProduto.getHeight() / 2);
          frmProduto.moveToFront();
          frmProduto.setSelected(true);
          frmProduto.show();
          DesktopPane.repaint();
        }
        else
        {
          DesktopPane.add(frmProduto);
          frmProduto.setLocation(DesktopPane.getWidth() / 2 - frmProduto.getWidth() / 2, DesktopPane.getHeight() / 2 - frmProduto.getHeight() / 2);
          frmProduto.show();
        }
      }
      catch (Exception e)
      {
        JOptionPane.showMessageDialog(null, e);
      }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      // TODO add your handling code here:
      JInternalFrame frmFerragem = new frmFerragem();
      this.DesktopPane.add(frmFerragem);
      frmFerragem.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void menuPedFerragemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPedFerragemActionPerformed
      // TODO add your handling code here:
      JInternalFrame frmPedido = new frmPedido();
      this.DesktopPane.add(frmPedido);
      frmPedido.setVisible(true);
      // TelaPrincipal.set
    }//GEN-LAST:event_menuPedFerragemActionPerformed

    private void menuCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCidadeActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_menuCidadeActionPerformed

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
      // TODO add your handling code here:
      if (mcliente == 0)
      {
        mcliente = 1;
        JInternalFrame frmCliente = new frmCliente();
        this.DesktopPane.add(frmCliente);
        frmCliente.setLocation(DesktopPane.getWidth() / 2 - frmCliente.getWidth() / 2, DesktopPane.getHeight() / 4 - frmCliente.getHeight() / 4);
        frmCliente.setVisible(true);
      }
      else
      {
        JOptionPane.showMessageDialog(null, "Tela de Clientes já esta aberta !!!");
      }


    }//GEN-LAST:event_menuClienteActionPerformed


    private void menuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutoActionPerformed
      // TODO add your handling code here:      

     /* 
      try
      {
        JInternalFrame frmProduto = new frmProduto();
        if (frmProduto.isVisible())
        {
          DesktopPane.remove(frmProduto);
          DesktopPane.add(frmProduto);
          frmProduto.setLocation(DesktopPane.getWidth() / 2 - frmProduto.getWidth() / 2, DesktopPane.getHeight() / 4 - frmProduto.getHeight() / 4);
          frmProduto.moveToFront();
          frmProduto.setSelected(true);
          frmProduto.show();
          DesktopPane.repaint();
        }
        else
        {
          DesktopPane.add(frmProduto);
          frmProduto.setLocation(DesktopPane.getWidth() / 2 - frmProduto.getWidth() / 2, DesktopPane.getHeight() / 4 - frmProduto.getHeight() / 4);
          frmProduto.show();
        }
      }
      catch (Exception e)
      {
        JOptionPane.showMessageDialog(null, e);
      }

      */
      
      
      
       if (mproduto == 0)
       {
       mproduto = 1;
       JInternalFrame frmProduto = new frmProduto();
       this.DesktopPane.add(frmProduto);
       frmProduto.setLocation(DesktopPane.getWidth() / 2 - frmProduto.getWidth() / 2, DesktopPane.getHeight() / 4 - frmProduto.getHeight() / 4);
       frmProduto.setVisible(true);
        
       }
       else
       {
       JOptionPane.showMessageDialog(null, "Tela Produtos já esta aberta !!!");
        //frmProduto.moveToFront();
        
       }
      
      /* JInternalFrame frmProduto = new frmProduto();
       JDialog dia = new JDialog();
       dia.setModal(true);         
       dia.setContentPane(frmProduto.getContentPane());
       dia.setBounds(frmProduto.getBounds());
       dia.setUndecorated(true);
       dia.findComponentAt(200, 200);
       dia.setVisible(true); */

    }//GEN-LAST:event_menuProdutoActionPerformed

    private void menuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuarioActionPerformed
      // TODO add your handling code here:
      if (musuario == 0)
      {
        musuario = 1;
        JInternalFrame frmUsuario = new frmUsuario();
        this.DesktopPane.add(frmUsuario);
        frmUsuario.setLocation(DesktopPane.getWidth() / 2 - frmUsuario.getWidth() / 2, DesktopPane.getHeight() / 4 - frmUsuario.getHeight() / 4);
        frmUsuario.setVisible(true);
      }
      else
      {
        JOptionPane.showMessageDialog(null, "Tela Usuario já esta aberta !!!");
      }

    }//GEN-LAST:event_menuUsuarioActionPerformed

  private void menuNivelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuNivelActionPerformed
  {//GEN-HEADEREND:event_menuNivelActionPerformed
    // TODO add your handling code here:
    if (mnivel == 0)
    {
      mnivel = 1;
      JInternalFrame frmNivel = new frmNivel();
      this.DesktopPane.add(frmNivel);
      frmNivel.setLocation(DesktopPane.getWidth() / 2 - frmNivel.getWidth() / 2, DesktopPane.getHeight() / 4 - frmNivel.getHeight() / 4);
      frmNivel.setVisible(true);
    }
    else
    {
      JOptionPane.showMessageDialog(null, "Tela Nivel já esta aberta !!!");
    }
  }//GEN-LAST:event_menuNivelActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

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
        new TelaPrincipal().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JDesktopPane DesktopPane;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton5;
  private javax.swing.JButton jButton6;
  private javax.swing.JButton jButton7;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JMenu jMenu10;
  private javax.swing.JMenu jMenu11;
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenu jMenu4;
  private javax.swing.JMenu jMenu5;
  private javax.swing.JMenu jMenu6;
  private javax.swing.JMenu jMenu7;
  private javax.swing.JMenu jMenu8;
  private javax.swing.JMenu jMenu9;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuBar jMenuBar2;
  private javax.swing.JMenuBar jMenuBar3;
  private javax.swing.JMenuItem jMenuItem12;
  private javax.swing.JMenuItem jMenuItem13;
  private javax.swing.JMenuItem jMenuItem16;
  private javax.swing.JMenuItem jMenuItem17;
  private javax.swing.JMenuItem jMenuItem18;
  private javax.swing.JMenuItem jMenuItem19;
  private javax.swing.JMenuItem jMenuItem3;
  private javax.swing.JMenuItem jMenuItem4;
  private javax.swing.JMenuItem jMenuItem5;
  private javax.swing.JMenuItem jMenuItem6;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JToolBar jToolBar1;
  private javax.swing.JMenu menuCadastro;
  private javax.swing.JMenu menuCalculo;
  private javax.swing.JMenuItem menuCidade;
  private javax.swing.JMenuItem menuCliente;
  private javax.swing.JMenuItem menuNivel;
  private javax.swing.JMenuItem menuPedFerragem;
  private javax.swing.JMenuItem menuPedSapata;
  private javax.swing.JMenuItem menuProduto;
  private javax.swing.JMenuItem menuUsuario;
  private javax.swing.JFormattedTextField txtDataHora;
  private javax.swing.JTextField txtLogin;
  // End of variables declaration//GEN-END:variables
}
