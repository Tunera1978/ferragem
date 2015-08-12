package interfaces;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import beans.Ferragem;
import beans.Produto;
import dao.FerragemDAO;
import dao.ProdutoDAO;
import javax.swing.JOptionPane;
import utils.AceitaNumeros;
import utils.AceitaStrings;
import utils.LimitarLetras;
import utils.LimitarNumeros;

public class frmFerragem extends javax.swing.JInternalFrame {

    private boolean status;
    static Ferragem u;
    private FerragemDAO ferragemDAO;
    private ProdutoDAO produtoDAO;

    public frmFerragem() {
        initComponents();
        this.ferragemDAO = new FerragemDAO();
        this.produtoDAO = new ProdutoDAO();

        txtIdProduto.setDocument(
                new AceitaNumeros());
        txtIdProduto.setDocument(
                new LimitarNumeros(6));
        txtQtdeColunas.setDocument(
                new AceitaNumeros());
        txtQtdeColunas.setDocument(
                new LimitarNumeros(6));
       txtData.setText(getDateTime());

        estadoInicial();
    }

    private String getDateTime() {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private String getDate() {
        DateFormat dateFormat = new SimpleDateFormat();
        Date date = new Date();
        return dateFormat.format(date);
    }

    private void estadoInicial() {

        txtIdProduto.setEditable(false);
        txtQtdeColunas.setEditable(false);
        txtComprimentoColuna.setEditable(false);
        txtEstriboAltura.setEditable(false);
        txtEstriboLargura.setEditable(false);
        txtEspacoEstribo.setEditable(false);
        txtQtdeFerroColuna.setEditable(false);
        txtDiametroEstribo.setEditable(false);

        btnNovo.setEnabled(true);
        btnCalcular.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnBuscar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnDeletar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        jLabel8 = new javax.swing.JLabel();
        txtTotalEstribo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEspacoEstribo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQtdeFerroColuna = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtTotalBarrasColuna = new javax.swing.JTextField();
        txtEstriboLargura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDiametroEstribo = new javax.swing.JTextField();
        txtTotalBarrasEstribo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTotalArame = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTotalQtdeEstribos = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        txtMensagem = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtIdFerragem = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro e Calculo da Coluna");

        jLabel2.setText("Usuário :");

        jLabel3.setText("Produto :");

        txtUsuarioLogado.setEditable(false);

        txtIdProduto.setPreferredSize(new java.awt.Dimension(80, 20));
        txtIdProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdProdutoFocusLost(evt);
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

        jLabel8.setText("Total Estribo A+ L  (cm) :");

        txtTotalEstribo.setEditable(false);
        txtTotalEstribo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalEstribo.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel9.setText("Espaçamento entre os estribos (cm):");

        txtEspacoEstribo.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel10.setText("Quantidade Ferros na Coluna :");

        txtQtdeFerroColuna.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel11.setText("Quantidade de Barras que serão usadas na coluna :");

        txtTotalBarrasColuna.setEditable(false);
        txtTotalBarrasColuna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalBarrasColuna.setPreferredSize(new java.awt.Dimension(80, 20));

        txtEstriboLargura.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel12.setText("Diametro do Estribo :");

        txtTotalBarrasEstribo.setEditable(false);
        txtTotalBarrasEstribo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalBarrasEstribo.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel13.setText("Quantidade de Barras que serão usadas nos Estribos :");

        jLabel14.setText("Quantidade de arame usado na amarração :");

        txtTotalArame.setEditable(false);
        txtTotalArame.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalArame.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel15.setText("Qtde de Estribos :");

        txtTotalQtdeEstribos.setEditable(false);
        txtTotalQtdeEstribos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtMensagem.setEditable(false);
        txtMensagem.setForeground(new java.awt.Color(204, 0, 0));
        txtMensagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel16.setText("Codigo Ferragem :");

        txtIdFerragem.setEditable(false);

        txtData.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEspacoEstribo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQtdeFerroColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQtdeColunas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtComprimentoColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotalEstribo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotalQtdeEstribos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTotalBarrasColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotalArame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotalBarrasEstribo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEstriboAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstriboLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDiametroEstribo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdFerragem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtMensagem)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtComprimentoColuna, txtDiametroEstribo, txtEspacoEstribo, txtEstriboAltura, txtEstriboLargura, txtIdProduto, txtQtdeFerroColuna});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(txtIdFerragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtQtdeColunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtComprimentoColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEstriboAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtEstriboLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtDiametroEstribo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtEspacoEstribo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtQtdeFerroColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTotalEstribo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtTotalQtdeEstribos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtTotalBarrasColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtTotalBarrasEstribo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtTotalArame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)))
                .addComponent(txtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
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

        status = true;
              
       // txtIdFerragem.setText(String.valueOf(this.ferragemDAO.getFerragemByMaxId()));
                
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:

        estadoInicial();

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

    private void txtDescricaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoProdutoActionPerformed
        // TODO add your handling code here:
        txtMensagem.setText("");
    }//GEN-LAST:event_txtDescricaoProdutoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        u = new Ferragem();
        u.setDiametro(txtDiametroEstribo.getText());
        u.setIdProduto(Integer.parseInt(txtIdProduto.getText()));
        u.setIdUsuario(1);
        u.setComprimento(Double.parseDouble(txtComprimentoColuna.getText()));
        u.setEspacoEstribo(Double.parseDouble(txtEspacoEstribo.getText()));
        u.setEstriboAltura(Double.parseDouble(txtEstriboAltura.getText()));
        u.setEstriboLargura(Double.parseDouble(txtEstriboLargura.getText()));
        u.setQtdeFerragem(Integer.parseInt(txtQtdeColunas.getText()));
        u.setQtdeFerro(Double.parseDouble(txtQtdeFerroColuna.getText()));

        txtTotalEstribo.setText(String.valueOf(u.calculoTotalEstribo()));
        txtTotalBarrasColuna.setText(String.valueOf(u.calculoQuantidadeBarrasColunas()));
        txtTotalBarrasEstribo.setText(String.valueOf(u.calculoQuantidadeBarrasEstribos()));
        txtTotalArame.setText(String.valueOf(u.calculoQuantidadeArames()));
        txtTotalQtdeEstribos.setText(String.valueOf(u.calculoQtdeEstribos()));

        estadoInicial();
        txtMensagem.setText("");

        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        txtMensagem.setText("");
        //Ferragem u = new Ferragem();
        u = new Ferragem();

        if (status == (true)) {

            u.setDiametro(txtDiametroEstribo.getText());
            u.setIdProduto(Integer.parseInt(txtIdProduto.getText()));
            u.setIdUsuario(frmSenha.IdUsuarioLogado);
            u.setComprimento(Double.parseDouble(txtComprimentoColuna.getText()));
            u.setEspacoEstribo(Double.parseDouble(txtEspacoEstribo.getText()));
            u.setEstriboAltura(Double.parseDouble(txtEstriboAltura.getText()));
            u.setEstriboLargura(Double.parseDouble(txtEstriboLargura.getText()));
            u.setQtdeFerragem(Integer.parseInt(txtQtdeColunas.getText()));
            u.setQtdeFerro(Double.parseDouble(txtQtdeFerroColuna.getText()));
            u.setData(String.valueOf(getDate()));

            txtTotalEstribo.setText(String.valueOf(u.calculoTotalEstribo()));
            txtTotalBarrasColuna.setText(String.valueOf(u.calculoQuantidadeBarrasColunas()));
            txtTotalBarrasEstribo.setText(String.valueOf(u.calculoQuantidadeBarrasEstribos()));
            txtTotalArame.setText(String.valueOf(u.calculoQuantidadeArames()));
            txtTotalQtdeEstribos.setText(String.valueOf(u.calculoQtdeEstribos()));

            if (this.ferragemDAO.inserir(u) == true) {

                txtMensagem.setText("Ferragem Adicionado com sucesso !");

            } else {
                //JOptionPane.showMessageDialog(null, "Erro ao Adicionar");
                txtMensagem.setText("Erro ao Adicionar");
            }
        } else {

            u.setDiametro(txtDiametroEstribo.getText());
            u.setIdProduto(Integer.parseInt(txtIdProduto.getText()));
            u.setIdUsuario(frmSenha.IdUsuarioLogado);
            u.setComprimento(Double.parseDouble(txtComprimentoColuna.getText()));
            u.setEspacoEstribo(Double.parseDouble(txtEspacoEstribo.getText()));
            u.setEstriboAltura(Double.parseDouble(txtEstriboAltura.getText()));
            u.setEstriboLargura(Double.parseDouble(txtEstriboLargura.getText()));
            u.setQtdeFerragem(Integer.parseInt(txtQtdeColunas.getText()));
            u.setQtdeFerro(Double.parseDouble(txtQtdeFerroColuna.getText()));
            u.setIdFerragem(Integer.parseInt(txtIdFerragem.getText()));
            u.setData(getDate());

            txtTotalEstribo.setText(String.valueOf(u.calculoTotalEstribo()));
            txtTotalBarrasColuna.setText(String.valueOf(u.calculoQuantidadeBarrasColunas()));
            txtTotalBarrasEstribo.setText(String.valueOf(u.calculoQuantidadeBarrasEstribos()));
            txtTotalArame.setText(String.valueOf(u.calculoQuantidadeArames()));
            txtTotalQtdeEstribos.setText(String.valueOf(u.calculoQtdeEstribos()));

            if (this.ferragemDAO.editar(u) == true) {
                txtMensagem.setText("Ferragem Editada");

            } else {
                txtMensagem.setText("Erro ao Editar");
            }
        }

        estadoInicial();

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        txtMensagem.setText("");
        int idferragem = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da busca!"));
        // Ferragem u = this.ferragemDAO.getFerragemById(idferragem);
        u = this.ferragemDAO.getFerragemById(idferragem);

        if (u == null) {
            //JOptionPane.showMessageDialog(null, "Usuario não encontrado");
            txtMensagem.setText("Ferragem não encontrado !");

        } else {
            txtIdFerragem.setText(String.valueOf(u.getIdFerragem()));
            txtQtdeColunas.setText(String.valueOf(u.getQtdeFerragem()));
            txtComprimentoColuna.setText(String.valueOf(u.getComprimento()));
            txtDiametroEstribo.setText(u.getDiametro());   // já esta em string
            txtEspacoEstribo.setText(String.valueOf(u.getEspacoEstribo()));
            txtEstriboAltura.setText(String.valueOf(u.getEstriboAltura()));
            txtEstriboLargura.setText(String.valueOf(u.getEstriboLargura()));
            txtIdFerragem.setText(String.valueOf(u.getIdFerragem()));
            txtIdProduto.setText(String.valueOf(u.getIdProduto()));
            txtUsuarioLogado.setText(String.valueOf(u.getIdUsuario()));
            txtQtdeColunas.setText(String.valueOf(u.getQtdeFerragem()));
            txtQtdeFerroColuna.setText(String.valueOf(u.getQtdeFerro()));

            txtTotalEstribo.setText(String.valueOf(u.calculoTotalEstribo()));
            txtTotalBarrasColuna.setText(String.valueOf(u.calculoQuantidadeBarrasColunas()));
            txtTotalBarrasEstribo.setText(String.valueOf(u.calculoQuantidadeBarrasEstribos()));
            txtTotalArame.setText(String.valueOf(u.calculoQuantidadeArames()));
            txtTotalQtdeEstribos.setText(String.valueOf(u.calculoQtdeEstribos()));

            btnCancelar.setEnabled(true);
            btnNovo.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnDeletar.setEnabled(true);

            // Produto p = new Produto();
            int idproduto = Integer.parseInt(txtIdProduto.getText());
            Produto p = this.produtoDAO.getProdutoById(idproduto);

            if (p == null) {

                txtMensagem.setText("Produto não encontrado !");
                txtIdProduto.grabFocus();

            } else {
                txtDescricaoProduto.setText(p.getDescricao());

            }

        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
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

        status = false;
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtIdProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdProdutoFocusLost
        // TODO add your handling code here:
        int idproduto = Integer.parseInt(txtIdProduto.getText());
            Produto p = this.produtoDAO.getProdutoById(idproduto);

            if (p == null) {

                txtMensagem.setText("Produto não encontrado !");

            } else {
                txtDescricaoProduto.setText(p.getDescricao());

            }
        
        
    }//GEN-LAST:event_txtIdProdutoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtComprimentoColuna;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtDiametroEstribo;
    private javax.swing.JTextField txtEspacoEstribo;
    private javax.swing.JTextField txtEstriboAltura;
    private javax.swing.JTextField txtEstriboLargura;
    private javax.swing.JTextField txtIdFerragem;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtMensagem;
    private javax.swing.JTextField txtQtdeColunas;
    private javax.swing.JTextField txtQtdeFerroColuna;
    private javax.swing.JTextField txtTotalArame;
    private javax.swing.JTextField txtTotalBarrasColuna;
    private javax.swing.JTextField txtTotalBarrasEstribo;
    private javax.swing.JTextField txtTotalEstribo;
    private javax.swing.JTextField txtTotalQtdeEstribos;
    private javax.swing.JTextField txtUsuarioLogado;
    // End of variables declaration//GEN-END:variables
}
