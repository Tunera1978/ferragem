/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Aluno
 */
public class frmOrcamento extends javax.swing.JInternalFrame
{

    /**
     * Creates new form frmOrcamento
     */
    public frmOrcamento()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDiametroEstribo = new javax.swing.JTextField();
        txtUsuarioLogado = new javax.swing.JTextField();
        txtIdProduto = new javax.swing.JTextField();
        txtDescricaoProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQtdeColunas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtComprimentoColuna = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEstriboAltura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEspacoEstribo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMensagem = new javax.swing.JTextField();
        txtQtdeFerroColuna = new javax.swing.JTextField();
        txtOrcamento = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEstriboLargura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rdbVergalhao = new javax.swing.JRadioButton();
        rdbEstribo = new javax.swing.JRadioButton();
        rdbArame = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnSalvar1 = new javax.swing.JButton();

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/838_32x32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8412_32x32.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8398_32x32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8408_32x32.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/7171_32x32.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8428_32x32.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/11540_32x32.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel3.setText("Produto :");

        txtUsuarioLogado.setEditable(false);

        txtIdProduto.setPreferredSize(new java.awt.Dimension(80, 20));
        txtIdProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdProdutoFocusLost(evt);
            }
        });
        txtIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdutoActionPerformed(evt);
            }
        });

        txtDescricaoProduto.setEditable(false);
        txtDescricaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoProdutoActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantidade Colunas :");

        txtQtdeColunas.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel5.setText("Comprimento Coluna (Mts) :");

        txtComprimentoColuna.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel6.setText("Estribo Altura (cm):");

        txtEstriboAltura.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel7.setText("Estribo Largura (cm):");

        jLabel9.setText("Espaçamento entre os estribos (cm):");

        txtEspacoEstribo.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel10.setText("Quantidade Ferros na Coluna :");

        txtMensagem.setEditable(false);
        txtMensagem.setForeground(new java.awt.Color(204, 0, 0));
        txtMensagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensagemActionPerformed(evt);
            }
        });

        txtQtdeFerroColuna.setPreferredSize(new java.awt.Dimension(80, 20));

        txtOrcamento.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Orçamento");

        txtEstriboLargura.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel2.setText("Usuário :");

        jLabel12.setText("Diametro do Estribo :");

        rdbVergalhao.setText("Vergalhao");
        rdbVergalhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbVergalhaoActionPerformed(evt);
            }
        });

        rdbEstribo.setText("Estribo");

        rdbArame.setText("Arame");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2153_32x32.png"))); // NOI18N
        btnSalvar1.setText("Adicionar");
        btnSalvar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMensagem)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbVergalhao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbEstribo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbArame))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuarioLogado))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdeColunas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComprimentoColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiametroEstribo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstriboAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstriboLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEspacoEstribo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQtdeFerroColuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnSalvar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(11, 11, 11)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeletar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbVergalhao)
                            .addComponent(rdbEstribo)
                            .addComponent(rdbArame))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtQtdeColunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtComprimentoColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtEstriboAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtEstriboLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtDiametroEstribo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtEspacoEstribo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtQtdeFerroColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNovoActionPerformed
    {//GEN-HEADEREND:event_btnNovoActionPerformed
        // TODO add your handling code here:
        txtMensagem.setText("");

        txtUsuarioLogado.setText(frmSenha.UsuarioLogado);

        txtIdProduto.setEditable(true);
        txtQtdeColunas.setEditable(true);
        txtComprimentoColuna.setEditable(true);
        txtEstriboAltura.setEditable(true);
        txtEstriboLargura.setEditable(true);
        txtDiametroEstribo.setEditable(true);
        txtEspacoEstribo.setEditable(true);
        txtQtdeFerroColuna.setEditable(true);
        txtDiametroEstribo.setEditable(true);

        btnNovo.setEnabled(false);
        btnCalcular.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnCancelar.setEnabled(true);

     //   status = true;

        // txtIdFerragem.setText(String.valueOf(this.ferragemDAO.getFerragemByMaxId()));

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        txtMensagem.setText("");

        txtIdProduto.setEditable(true);
        txtQtdeColunas.setEditable(true);
        txtComprimentoColuna.setEditable(true);
        txtEstriboAltura.setEditable(true);
        txtEstriboLargura.setEditable(true);
        txtDiametroEstribo.setEditable(true);
        txtEspacoEstribo.setEditable(true);
        txtQtdeFerroColuna.setEditable(true);

        btnNovo.setEnabled(false);
        btnCalcular.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(false);

   //     status = false;
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        // TODO add your handling code here:
//
     //   estadoInicial();

        txtMensagem.setText("");
        txtMensagem.setText("Ferragem não sofreu alteração !");
        txtIdProduto.setText("");
        txtQtdeColunas.setText("");
        txtComprimentoColuna.setText("");
        txtEstriboAltura.setText("");
        txtEstriboLargura.setText("");
        txtDiametroEstribo.setText("");
        txtEspacoEstribo.setText("");
        txtQtdeFerroColuna.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalvarActionPerformed
    {//GEN-HEADEREND:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        txtMensagem.setText("");
        //Ferragem u = new Ferragem();
     //   u = new Ferragem();

    //    if (status == (true))
        //{

      //      u.setDiametro(txtDiametroEstribo.getText());
      //      u.setIdProduto(Integer.parseInt(txtIdProduto.getText()));
     //       u.setIdUsuario(frmSenha.IdUsuarioLogado);
      //      u.setComprimento(Double.parseDouble(txtComprimentoColuna.getText()));
      //      u.setEspacoEstribo(Double.parseDouble(txtEspacoEstribo.getText()));
      //      u.setEstriboAltura(Double.parseDouble(txtEstriboAltura.getText()));
      //     u.setEstriboLargura(Double.parseDouble(txtEstriboLargura.getText()));
       //     u.setQtdeFerragem(Integer.parseInt(txtQtdeColunas.getText()));
       //     u.setQtdeFerro(Double.parseDouble(txtQtdeFerroColuna.getText()));
      //      u.setData(String.valueOf(getDate()));

        //    txtTotalEstribo.setText(String.valueOf(u.calculoTotalEstribo()));
       //     txtTotalBarrasColuna.setText(String.valueOf(u.calculoQuantidadeBarrasColunas()));
        //    txtTotalBarrasEstribo.setText(String.valueOf(u.calculoQuantidadeBarrasEstribos()));
       //     txtTotalArame.setText(String.valueOf(u.calculoQuantidadeArames()));
     //       txtTotalQtdeEstribos.setText(String.valueOf(u.calculoQtdeEstribos()));

       //     if (this.ferragemDAO.inserir(u) == true)
        //    {

          //      txtMensagem.setText("Ferragem Adicionado com sucesso !");

            //} else
            //{
                //JOptionPane.showMessageDialog(null, "Erro ao Adicionar");
              //  txtMensagem.setText("Erro ao Adicionar");
           // }
        //} else
        //{

          //  u.setDiametro(txtDiametroEstribo.getText());
            //u.setIdProduto(Integer.parseInt(txtIdProduto.getText()));
          //  u.setIdUsuario(frmSenha.IdUsuarioLogado);
      //      u.setComprimento(Double.parseDouble(txtComprimentoColuna.getText()));
        //    u.setEspacoEstribo(Double.parseDouble(txtEspacoEstribo.getText()));
      //      u.setEstriboAltura(Double.parseDouble(txtEstriboAltura.getText()));
       //     u.setEstriboLargura(Double.parseDouble(txtEstriboLargura.getText()));
     //       u.setQtdeFerragem(Integer.parseInt(txtQtdeColunas.getText()));
     //       u.setQtdeFerro(Double.parseDouble(txtQtdeFerroColuna.getText()));
       //     u.setIdFerragem(Integer.parseInt(txtIdFerragem.getText()));
       ///     u.setData(getDate());

     //       txtTotalEstribo.setText(String.valueOf(u.calculoTotalEstribo()));
      //      txtTotalBarrasColuna.setText(String.valueOf(u.calculoQuantidadeBarrasColunas()));
     //       txtTotalBarrasEstribo.setText(String.valueOf(u.calculoQuantidadeBarrasEstribos()));
     //       txtTotalArame.setText(String.valueOf(u.calculoQuantidadeArames()));
     //       txtTotalQtdeEstribos.setText(String.valueOf(u.calculoQtdeEstribos()));

       //     if (this.ferragemDAO.editar(u) == true)
     //       {
       //         txtMensagem.setText("Ferragem Editada");

     //       } else
     //       {
     //           txtMensagem.setText("Erro ao Editar");
    //        }
    //    }

   //     estadoInicial();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarActionPerformed
    {//GEN-HEADEREND:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        txtMensagem.setText("");
    //    int idferragem = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da busca!"));
        // Ferragem u = this.ferragemDAO.getFerragemById(idferragem);
    //    u = this.ferragemDAO.getFerragemById(idferragem);

     //   if (u == null)
     //   {
            //JOptionPane.showMessageDialog(null, "Usuario não encontrado");
            txtMensagem.setText("Ferragem não encontrado !");

  //      } else
   //     {
    //        txtIdFerragem.setText(String.valueOf(u.getIdFerragem()));
       //     txtQtdeColunas.setText(String.valueOf(u.getQtdeFerragem()));
    //        txtComprimentoColuna.setText(String.valueOf(u.getComprimento()));
  //          txtDiametroEstribo.setText(u.getDiametro());   // já esta em string
   //         txtEspacoEstribo.setText(String.valueOf(u.getEspacoEstribo()));
   //         txtEstriboAltura.setText(String.valueOf(u.getEstriboAltura()));
   //         txtEstriboLargura.setText(String.valueOf(u.getEstriboLargura()));
     //       txtIdFerragem.setText(String.valueOf(u.getIdFerragem()));
     //       txtIdProduto.setText(String.valueOf(u.getIdProduto()));
    //        txtUsuarioLogado.setText(String.valueOf(u.getIdUsuario()));
   //         txtQtdeColunas.setText(String.valueOf(u.getQtdeFerragem()));
   //         txtQtdeFerroColuna.setText(String.valueOf(u.getQtdeFerro()));

     //       txtTotalEstribo.setText(String.valueOf(u.calculoTotalEstribo()));
      //      txtTotalBarrasColuna.setText(String.valueOf(u.calculoQuantidadeBarrasColunas()));
     //       txtTotalBarrasEstribo.setText(String.valueOf(u.calculoQuantidadeBarrasEstribos()));
     //       txtTotalArame.setText(String.valueOf(u.calculoQuantidadeArames()));
   //         txtTotalQtdeEstribos.setText(String.valueOf(u.calculoQtdeEstribos()));

     //       btnCancelar.setEnabled(true);
     //       btnNovo.setEnabled(false);
   //         btnAlterar.setEnabled(true);
   //         btnDeletar.setEnabled(true);

            // Produto p = new Produto();
      //      int idproduto = Integer.parseInt(txtIdProduto.getText());
   //         Produto p = this.produtoDAO.getProdutoById(idproduto);

    //        if (p == null)
    //        {

   //             txtMensagem.setText("Produto não encontrado !");

    //        } else
   //         {
    //            txtDescricaoProduto.setText(p.getDescricao());

    //        }

       // }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCalcularActionPerformed
    {//GEN-HEADEREND:event_btnCalcularActionPerformed
        // TODO add your handling code here:
       
        txtMensagem.setText("");

        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtIdProdutoFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtIdProdutoFocusLost
    {//GEN-HEADEREND:event_txtIdProdutoFocusLost
        // TODO add your handling code here:
        int idproduto = Integer.parseInt(txtIdProduto.getText());
     //   Produto p = this.produtoDAO.getProdutoById(idproduto);

    

    }//GEN-LAST:event_txtIdProdutoFocusLost

    private void txtDescricaoProdutoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtDescricaoProdutoActionPerformed
    {//GEN-HEADEREND:event_txtDescricaoProdutoActionPerformed
        // TODO add your handling code here:
        txtMensagem.setText("");
    }//GEN-LAST:event_txtDescricaoProdutoActionPerformed

    private void rdbVergalhaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rdbVergalhaoActionPerformed
    {//GEN-HEADEREND:event_rdbVergalhaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbVergalhaoActionPerformed

    private void txtMensagemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtMensagemActionPerformed
    {//GEN-HEADEREND:event_txtMensagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensagemActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalvar1ActionPerformed
    {//GEN-HEADEREND:event_btnSalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void txtIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rdbArame;
    private javax.swing.JRadioButton rdbEstribo;
    private javax.swing.JRadioButton rdbVergalhao;
    private javax.swing.JTextField txtComprimentoColuna;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtDiametroEstribo;
    private javax.swing.JTextField txtEspacoEstribo;
    private javax.swing.JTextField txtEstriboAltura;
    private javax.swing.JTextField txtEstriboLargura;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtMensagem;
    private javax.swing.JFormattedTextField txtOrcamento;
    private javax.swing.JTextField txtQtdeColunas;
    private javax.swing.JTextField txtQtdeFerroColuna;
    private javax.swing.JTextField txtUsuarioLogado;
    // End of variables declaration//GEN-END:variables
}
