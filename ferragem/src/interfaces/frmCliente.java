package interfaces;

import beans.Cidade;
import beans.Cliente;
import beans.Contato;
import dao.ClienteDAO;
import dao.ContatoDAO;
import java.util.ArrayList;
//import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static utils.ControleForms.mcliente;

public class frmCliente extends javax.swing.JInternalFrame
{

    DefaultTableModel tCidade;
    private ArrayList<Cidade> list;
    private ClienteDAO clienteDAO;

    public frmCliente()
    {

        initComponents();
        //ComboCidade(); 
        //preencheTabelaContato(1);
    }

    @SuppressWarnings("unchecked")

    /*public void ComboCidade() {

     CidadeDAO dAO = new CidadeDAO();
     list = dAO.getCidades();
     if (list.isEmpty()) {
     JOptionPane.showMessageDialog(null, "Cadastre pelo menos um idioma em:"
     + "\nMenu - Cadastrar - Cidades");
     this.dispose();
     } else {
     for (int i = 0; i < list.size(); i++) {
     cbCidade.addItem(list.get(i).getNome());
     }
     }
     }*/
    private void preencheTabelaContato(int VarId)
    {
        DefaultTableModel tabelaContato = (DefaultTableModel) tbContato.getModel();
        tabelaContato.setNumRows(0);
        ContatoDAO r = new ContatoDAO();
        ArrayList<Contato> contato = new ArrayList<Contato>();
        //contato = r.getClientesContatos(Integer.parseInt(txtId.getText()));
        contato = r.getClientesContatos(VarId);

        for (Contato contato1 : contato)
        {
            Object[] obj = new Object[]
            {
                contato1.getNome(), contato1.getTelefone(), contato1.getCelular(), contato1.getEmail()
            };
            tabelaContato.addRow(obj);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtInscricao = new javax.swing.JTextField();
        txtMensagem = new javax.swing.JTextField();
        txtId = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        btnNovo1 = new javax.swing.JButton();
        btnAlterar1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        btnDeletar1 = new javax.swing.JButton();
        btnSalvar2 = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        btnCalcular1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtDiametroEstribo1 = new javax.swing.JTextField();
        txtUsuarioLogado1 = new javax.swing.JTextField();
        txtIdProduto1 = new javax.swing.JTextField();
        txtDescricaoProduto1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtQtdeColunas1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtComprimentoColuna1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtEstriboAltura1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtEspacoEstribo1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtMensagem1 = new javax.swing.JTextField();
        txtQtdeFerroColuna1 = new javax.swing.JTextField();
        txtOrcamento1 = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        txtEstriboLargura1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        rdbVergalhao1 = new javax.swing.JRadioButton();
        rdbEstribo1 = new javax.swing.JRadioButton();
        rdbArame1 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btnSalvar3 = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        btnNovo2 = new javax.swing.JButton();
        btnAlterar2 = new javax.swing.JButton();
        btnCancelar2 = new javax.swing.JButton();
        btnDeletar2 = new javax.swing.JButton();
        btnSalvar4 = new javax.swing.JButton();
        btnBuscar2 = new javax.swing.JButton();
        btnCalcular2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtDiametroEstribo2 = new javax.swing.JTextField();
        txtUsuarioLogado2 = new javax.swing.JTextField();
        txtIdProduto2 = new javax.swing.JTextField();
        txtDescricaoProduto2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtQtdeColunas2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtComprimentoColuna2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtEstriboAltura2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtEspacoEstribo2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtMensagem2 = new javax.swing.JTextField();
        txtQtdeFerroColuna2 = new javax.swing.JTextField();
        txtOrcamento2 = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        txtEstriboLargura2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        rdbVergalhao2 = new javax.swing.JRadioButton();
        rdbEstribo2 = new javax.swing.JRadioButton();
        rdbArame2 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        btnSalvar5 = new javax.swing.JButton();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        btnNovo3 = new javax.swing.JButton();
        btnAlterar3 = new javax.swing.JButton();
        btnCancelar3 = new javax.swing.JButton();
        btnDeletar3 = new javax.swing.JButton();
        btnSalvar6 = new javax.swing.JButton();
        btnBuscar3 = new javax.swing.JButton();
        btnCalcular3 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        txtDiametroEstribo3 = new javax.swing.JTextField();
        txtUsuarioLogado3 = new javax.swing.JTextField();
        txtIdProduto3 = new javax.swing.JTextField();
        txtDescricaoProduto3 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtQtdeColunas3 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtComprimentoColuna3 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtEstriboAltura3 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtEspacoEstribo3 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtMensagem3 = new javax.swing.JTextField();
        txtQtdeFerroColuna3 = new javax.swing.JTextField();
        txtOrcamento3 = new javax.swing.JFormattedTextField();
        jLabel38 = new javax.swing.JLabel();
        txtEstriboLargura3 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        rdbVergalhao3 = new javax.swing.JRadioButton();
        rdbEstribo3 = new javax.swing.JRadioButton();
        rdbArame3 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        btnSalvar7 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        pnEndereco = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEndereco = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbContato = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtCliObservacao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        rdbFisico = new javax.swing.JRadioButton();
        rdbJuridico = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setName("Cadastro de Clientes"); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
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

        txtNome.setEditable(false);

        jLabel4.setText("Cnpj:");

        txtCnpj.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel5.setText("Inscrição :");

        txtInscricao.setPreferredSize(new java.awt.Dimension(80, 20));

        txtMensagem.setEditable(false);
        txtMensagem.setForeground(new java.awt.Color(204, 0, 0));
        txtMensagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensagemActionPerformed(evt);
            }
        });

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        btnNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/838_32x32.png"))); // NOI18N
        btnNovo1.setText("Novo");
        btnNovo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        btnAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8412_32x32.png"))); // NOI18N
        btnAlterar1.setText("Alterar");
        btnAlterar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar1ActionPerformed(evt);
            }
        });

        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8398_32x32.png"))); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnDeletar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8408_32x32.png"))); // NOI18N
        btnDeletar1.setText("Deletar");
        btnDeletar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnSalvar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/7171_32x32.png"))); // NOI18N
        btnSalvar2.setText("Salvar");
        btnSalvar2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar2ActionPerformed(evt);
            }
        });

        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8428_32x32.png"))); // NOI18N
        btnBuscar1.setText("Buscar");
        btnBuscar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        btnCalcular1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/11540_32x32.png"))); // NOI18N
        btnCalcular1.setText("Calcular");
        btnCalcular1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Produto :");

        txtUsuarioLogado1.setEditable(false);

        txtIdProduto1.setPreferredSize(new java.awt.Dimension(80, 20));
        txtIdProduto1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdProduto1FocusLost(evt);
            }
        });

        txtDescricaoProduto1.setEditable(false);
        txtDescricaoProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoProduto1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Quantidade Colunas :");

        txtQtdeColunas1.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel13.setText("Comprimento Coluna (Mts) :");

        txtComprimentoColuna1.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel14.setText("Estribo Altura (cm):");

        txtEstriboAltura1.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel15.setText("Estribo Largura (cm):");

        jLabel16.setText("Espaçamento entre os estribos (cm):");

        txtEspacoEstribo1.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel17.setText("Quantidade Ferros na Coluna :");

        txtMensagem1.setEditable(false);
        txtMensagem1.setForeground(new java.awt.Color(204, 0, 0));
        txtMensagem1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMensagem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensagem1ActionPerformed(evt);
            }
        });

        txtQtdeFerroColuna1.setPreferredSize(new java.awt.Dimension(80, 20));

        txtOrcamento1.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Pedido");

        txtEstriboLargura1.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel19.setText("Usuário :");

        jLabel20.setText("Diametro do Estribo :");

        rdbVergalhao1.setText("Vergalhao");
        rdbVergalhao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbVergalhao1ActionPerformed(evt);
            }
        });

        rdbEstribo1.setText("Estribo");

        rdbArame1.setText("Arame");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        btnSalvar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2153_32x32.png"))); // NOI18N
        btnSalvar3.setText("Adicionar");
        btnSalvar3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalvar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMensagem1)
                    .addComponent(jScrollPane2)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdeColunas1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComprimentoColuna1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiametroEstribo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstriboAltura1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstriboLargura1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(txtEspacoEstribo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQtdeFerroColuna1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuarioLogado1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescricaoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbVergalhao1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbEstribo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbArame1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeletar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnSalvar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcular1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar1)
                        .addGap(11, 11, 11)
                        .addComponent(btnCancelar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeletar1))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(txtUsuarioLogado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtIdProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricaoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbVergalhao1)
                            .addComponent(rdbEstribo1)
                            .addComponent(rdbArame1))
                        .addGap(7, 7, 7)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtQtdeColunas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtComprimentoColuna1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtEstriboAltura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtEstriboLargura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtDiametroEstribo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(txtEspacoEstribo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txtQtdeFerroColuna1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMensagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        btnNovo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/838_32x32.png"))); // NOI18N
        btnNovo2.setText("Novo");
        btnNovo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNovo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo2ActionPerformed(evt);
            }
        });

        btnAlterar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8412_32x32.png"))); // NOI18N
        btnAlterar2.setText("Alterar");
        btnAlterar2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlterar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar2ActionPerformed(evt);
            }
        });

        btnCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8398_32x32.png"))); // NOI18N
        btnCancelar2.setText("Cancelar");
        btnCancelar2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        btnDeletar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8408_32x32.png"))); // NOI18N
        btnDeletar2.setText("Deletar");
        btnDeletar2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnSalvar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/7171_32x32.png"))); // NOI18N
        btnSalvar4.setText("Salvar");
        btnSalvar4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalvar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar4ActionPerformed(evt);
            }
        });

        btnBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8428_32x32.png"))); // NOI18N
        btnBuscar2.setText("Buscar");
        btnBuscar2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });

        btnCalcular2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/11540_32x32.png"))); // NOI18N
        btnCalcular2.setText("Calcular");
        btnCalcular2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular2ActionPerformed(evt);
            }
        });

        jLabel21.setText("Produto :");

        txtUsuarioLogado2.setEditable(false);

        txtIdProduto2.setPreferredSize(new java.awt.Dimension(80, 20));
        txtIdProduto2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdProduto2FocusLost(evt);
            }
        });

        txtDescricaoProduto2.setEditable(false);
        txtDescricaoProduto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoProduto2ActionPerformed(evt);
            }
        });

        jLabel22.setText("Quantidade Colunas :");

        txtQtdeColunas2.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel23.setText("Comprimento Coluna (Mts) :");

        txtComprimentoColuna2.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel24.setText("Estribo Altura (cm):");

        txtEstriboAltura2.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel25.setText("Estribo Largura (cm):");

        jLabel26.setText("Espaçamento entre os estribos (cm):");

        txtEspacoEstribo2.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel27.setText("Quantidade Ferros na Coluna :");

        txtMensagem2.setEditable(false);
        txtMensagem2.setForeground(new java.awt.Color(204, 0, 0));
        txtMensagem2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMensagem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensagem2ActionPerformed(evt);
            }
        });

        txtQtdeFerroColuna2.setPreferredSize(new java.awt.Dimension(80, 20));

        txtOrcamento2.setEditable(false);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Pedido");

        txtEstriboLargura2.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel29.setText("Usuário :");

        jLabel30.setText("Diametro do Estribo :");

        rdbVergalhao2.setText("Vergalhao");
        rdbVergalhao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbVergalhao2ActionPerformed(evt);
            }
        });

        rdbEstribo2.setText("Estribo");

        rdbArame2.setText("Arame");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        btnSalvar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2153_32x32.png"))); // NOI18N
        btnSalvar5.setText("Adicionar");
        btnSalvar5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalvar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar5ActionPerformed(evt);
            }
        });

        btnNovo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/838_32x32.png"))); // NOI18N
        btnNovo3.setText("Novo");
        btnNovo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNovo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo3ActionPerformed(evt);
            }
        });

        btnAlterar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8412_32x32.png"))); // NOI18N
        btnAlterar3.setText("Alterar");
        btnAlterar3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlterar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar3ActionPerformed(evt);
            }
        });

        btnCancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8398_32x32.png"))); // NOI18N
        btnCancelar3.setText("Cancelar");
        btnCancelar3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar3ActionPerformed(evt);
            }
        });

        btnDeletar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8408_32x32.png"))); // NOI18N
        btnDeletar3.setText("Deletar");
        btnDeletar3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnSalvar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/7171_32x32.png"))); // NOI18N
        btnSalvar6.setText("Salvar");
        btnSalvar6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalvar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar6ActionPerformed(evt);
            }
        });

        btnBuscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8428_32x32.png"))); // NOI18N
        btnBuscar3.setText("Buscar");
        btnBuscar3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar3ActionPerformed(evt);
            }
        });

        btnCalcular3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/11540_32x32.png"))); // NOI18N
        btnCalcular3.setText("Calcular");
        btnCalcular3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalcular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular3ActionPerformed(evt);
            }
        });

        jLabel31.setText("Produto :");

        txtUsuarioLogado3.setEditable(false);

        txtIdProduto3.setPreferredSize(new java.awt.Dimension(80, 20));
        txtIdProduto3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdProduto3FocusLost(evt);
            }
        });

        txtDescricaoProduto3.setEditable(false);
        txtDescricaoProduto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoProduto3ActionPerformed(evt);
            }
        });

        jLabel32.setText("Quantidade Colunas :");

        txtQtdeColunas3.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel33.setText("Comprimento Coluna (Mts) :");

        txtComprimentoColuna3.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel34.setText("Estribo Altura (cm):");

        txtEstriboAltura3.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel35.setText("Estribo Largura (cm):");

        jLabel36.setText("Espaçamento entre os estribos (cm):");

        txtEspacoEstribo3.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel37.setText("Quantidade Ferros na Coluna :");

        txtMensagem3.setEditable(false);
        txtMensagem3.setForeground(new java.awt.Color(204, 0, 0));
        txtMensagem3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMensagem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensagem3ActionPerformed(evt);
            }
        });

        txtQtdeFerroColuna3.setPreferredSize(new java.awt.Dimension(80, 20));

        txtOrcamento3.setEditable(false);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText("Pedido");

        txtEstriboLargura3.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel39.setText("Usuário :");

        jLabel40.setText("Diametro do Estribo :");

        rdbVergalhao3.setText("Vergalhao");
        rdbVergalhao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbVergalhao3ActionPerformed(evt);
            }
        });

        rdbEstribo3.setText("Estribo");

        rdbArame3.setText("Arame");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        btnSalvar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2153_32x32.png"))); // NOI18N
        btnSalvar7.setText("Adicionar");
        btnSalvar7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalvar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMensagem3)
                    .addComponent(jScrollPane4)
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdeColunas3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComprimentoColuna3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiametroEstribo3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel36)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstriboAltura3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstriboLargura3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                .addComponent(txtEspacoEstribo3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQtdeFerroColuna3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame3Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOrcamento3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuarioLogado3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescricaoProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbVergalhao3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbEstribo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbArame3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCancelar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeletar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnNovo3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnSalvar7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcular3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar3)
                        .addGap(11, 11, 11)
                        .addComponent(btnCancelar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeletar3))
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrcamento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)
                            .addComponent(txtUsuarioLogado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txtIdProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricaoProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbVergalhao3)
                            .addComponent(rdbEstribo3)
                            .addComponent(rdbArame3))
                        .addGap(7, 7, 7)
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtQtdeColunas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(txtComprimentoColuna3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(txtEstriboAltura3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(txtEstriboLargura3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(txtDiametroEstribo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(txtEspacoEstribo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)
                            .addComponent(txtQtdeFerroColuna3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMensagem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMensagem2)
                    .addComponent(jScrollPane3)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdeColunas2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComprimentoColuna2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiametroEstribo2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstriboAltura2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstriboLargura2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(txtEspacoEstribo2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQtdeFerroColuna2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOrcamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuarioLogado2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescricaoProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbVergalhao2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbEstribo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbArame2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCancelar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeletar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnNovo2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnSalvar5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcular2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar2)
                        .addGap(11, 11, 11)
                        .addComponent(btnCancelar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeletar2))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrcamento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(txtUsuarioLogado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtIdProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricaoProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbVergalhao2)
                            .addComponent(rdbEstribo2)
                            .addComponent(rdbArame2))
                        .addGap(7, 7, 7)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtQtdeColunas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(txtComprimentoColuna2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(txtEstriboAltura2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(txtEstriboLargura2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtDiametroEstribo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(txtEspacoEstribo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(txtQtdeFerroColuna2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMensagem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
            .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable3);

        jLabel42.setText("Id:");

        jLabel43.setText("Cpf :");

        txtCPF.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel44.setText("Rg :");

        txtRG.setPreferredSize(new java.awt.Dimension(80, 20));

        tbEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo", "Endereço", "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbEndereco);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnEndereco.addTab("Endereços", jPanel1);

        tbContato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Telefone", "Celular", "Email"
            }
        ));
        jScrollPane9.setViewportView(tbContato);

        jLabel45.setText("Observação :");

        txtCliObservacao.setColumns(20);
        txtCliObservacao.setRows(5);
        jScrollPane5.setViewportView(txtCliObservacao);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnEndereco.addTab("Contatos", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel41.setText("Selecione o tipo :");

        rdbFisico.setText("Fisico");

        rdbJuridico.setText("Juridico");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addGap(36, 36, 36)
                .addComponent(rdbFisico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbJuridico)
                .addGap(58, 58, 58))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(rdbFisico)
                    .addComponent(rdbJuridico))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMensagem)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(40, 40, 40)
                                                        .addComponent(jLabel4)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(txtCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                                .addGap(4, 4, 4))
                            .addComponent(pnEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 428, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 428, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 428, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 428, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane6)
                    .addGap(111, 111, 111)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jScrollPane7)
                    .addGap(101, 101, 101)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel42)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtInscricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44)
                            .addComponent(txtRG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeletar)))
                .addGap(18, 18, 18)
                .addComponent(txtMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 246, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 246, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 246, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 246, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(233, 233, 233)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(259, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(301, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(191, 191, 191)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNovoActionPerformed
    {//GEN-HEADEREND:event_btnNovoActionPerformed
        // TODO add your handling code here:
        txtMensagem.setText("");

        txtNome.setText(frmSenha.UsuarioLogado);

        txtCnpj.setEditable(true);
        txtInscricao.setEditable(true);

        btnNovo.setEnabled(false);
        // btnCalcular.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnCancelar.setEnabled(true);

     //   status = true;
        //   txtIdFerragem.setText(String.valueOf(this.ferragemDAO.getFerragemByMaxId()));

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        txtMensagem.setText("");

        txtCnpj.setEditable(true);
        txtInscricao.setEditable(true);

        btnNovo.setEnabled(false);
        // btnCalcular.setEnabled(false);
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

        txtCnpj.setText("");
        txtInscricao.setText("");

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
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da busca!"));
        preencheTabelaContato(id);
        Cliente u = this.clienteDAO.getClienteById(id);
        
       
        
        if (u == null)
        {
            //JOptionPane.showMessageDialog(null, "Usuario não encontrado");
            txtMensagem.setText("Cliente não encontrado !");
            
        }
        else
        {
            txtNome.setText(u.getNome());
            // tipo radio buttom
            txtInscricao.setText(u.getInscricao());
            txtCnpj.setText(u.getCnpj());
            txtRG.setText(u.getRg());
            txtCPF.setText(u.getCpf());
            
            
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
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    /*
     private void preencherTblContato(int id) {
    
     DefaultTableModel jtblContato = (DefaultTableModel) tblContato.getModel();
     jtblContato.setNumRows(0);
    
    
     ContatoDAO dDao = new ContatoDAO();
     ArrayList<RelatorioDisciplina> relatorio = new ArrayList<RelatorioDisciplina>();
     relatorio = dDao.getDisciplinaRelatorio(id);
    
     if (relatorio.size()== 0){
     JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado");
     return;
     }

     for (int i = 0; i < relatorio.size(); i++)
     {
     Object[] obj = new Object[]
     {
     relatorio.get(i).getProntuaio(),
     relatorio.get(i).getNome(),
     relatorio.get(i).getNomeDisciplina()        
     };
     jtblRelatorio.addRow(obj);
     }
     }
     */
    private void txtMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensagemActionPerformed

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovo1ActionPerformed

    private void btnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterar1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar2ActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcular1ActionPerformed

    private void txtIdProduto1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdProduto1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProduto1FocusLost

    private void txtDescricaoProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoProduto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoProduto1ActionPerformed

    private void txtMensagem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensagem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensagem1ActionPerformed

    private void rdbVergalhao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbVergalhao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbVergalhao1ActionPerformed

    private void btnSalvar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar3ActionPerformed

    private void btnNovo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovo2ActionPerformed

    private void btnAlterar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterar2ActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void btnSalvar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar4ActionPerformed

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void btnCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcular2ActionPerformed

    private void txtIdProduto2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdProduto2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProduto2FocusLost

    private void txtDescricaoProduto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoProduto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoProduto2ActionPerformed

    private void txtMensagem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensagem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensagem2ActionPerformed

    private void rdbVergalhao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbVergalhao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbVergalhao2ActionPerformed

    private void btnSalvar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar5ActionPerformed

    private void btnNovo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovo3ActionPerformed

    private void btnAlterar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterar3ActionPerformed

    private void btnCancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar3ActionPerformed

    private void btnSalvar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar6ActionPerformed

    private void btnBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar3ActionPerformed

    private void btnCalcular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcular3ActionPerformed

    private void txtIdProduto3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdProduto3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProduto3FocusLost

    private void txtDescricaoProduto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoProduto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoProduto3ActionPerformed

    private void txtMensagem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensagem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensagem3ActionPerformed

    private void rdbVergalhao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbVergalhao3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbVergalhao3ActionPerformed

    private void btnSalvar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar7ActionPerformed

  private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_formInternalFrameClosing
  {//GEN-HEADEREND:event_formInternalFrameClosing
      // TODO add your handling code here:
      mcliente = 0;
  }//GEN-LAST:event_formInternalFrameClosing

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAlterar1;
    private javax.swing.JButton btnAlterar2;
    private javax.swing.JButton btnAlterar3;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JButton btnCalcular1;
    private javax.swing.JButton btnCalcular2;
    private javax.swing.JButton btnCalcular3;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnCancelar3;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDeletar1;
    private javax.swing.JButton btnDeletar2;
    private javax.swing.JButton btnDeletar3;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JButton btnNovo2;
    private javax.swing.JButton btnNovo3;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar2;
    private javax.swing.JButton btnSalvar3;
    private javax.swing.JButton btnSalvar4;
    private javax.swing.JButton btnSalvar5;
    private javax.swing.JButton btnSalvar6;
    private javax.swing.JButton btnSalvar7;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTabbedPane pnEndereco;
    private javax.swing.JRadioButton rdbArame1;
    private javax.swing.JRadioButton rdbArame2;
    private javax.swing.JRadioButton rdbArame3;
    private javax.swing.JRadioButton rdbEstribo1;
    private javax.swing.JRadioButton rdbEstribo2;
    private javax.swing.JRadioButton rdbEstribo3;
    private javax.swing.JRadioButton rdbFisico;
    private javax.swing.JRadioButton rdbJuridico;
    private javax.swing.JRadioButton rdbVergalhao1;
    private javax.swing.JRadioButton rdbVergalhao2;
    private javax.swing.JRadioButton rdbVergalhao3;
    private javax.swing.JTable tbContato;
    private javax.swing.JTable tbEndereco;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextArea txtCliObservacao;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtComprimentoColuna1;
    private javax.swing.JTextField txtComprimentoColuna2;
    private javax.swing.JTextField txtComprimentoColuna3;
    private javax.swing.JTextField txtDescricaoProduto1;
    private javax.swing.JTextField txtDescricaoProduto2;
    private javax.swing.JTextField txtDescricaoProduto3;
    private javax.swing.JTextField txtDiametroEstribo1;
    private javax.swing.JTextField txtDiametroEstribo2;
    private javax.swing.JTextField txtDiametroEstribo3;
    private javax.swing.JTextField txtEspacoEstribo1;
    private javax.swing.JTextField txtEspacoEstribo2;
    private javax.swing.JTextField txtEspacoEstribo3;
    private javax.swing.JTextField txtEstriboAltura1;
    private javax.swing.JTextField txtEstriboAltura2;
    private javax.swing.JTextField txtEstriboAltura3;
    private javax.swing.JTextField txtEstriboLargura1;
    private javax.swing.JTextField txtEstriboLargura2;
    private javax.swing.JTextField txtEstriboLargura3;
    private javax.swing.JFormattedTextField txtId;
    private javax.swing.JTextField txtIdProduto1;
    private javax.swing.JTextField txtIdProduto2;
    private javax.swing.JTextField txtIdProduto3;
    private javax.swing.JTextField txtInscricao;
    private javax.swing.JTextField txtMensagem;
    private javax.swing.JTextField txtMensagem1;
    private javax.swing.JTextField txtMensagem2;
    private javax.swing.JTextField txtMensagem3;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtOrcamento1;
    private javax.swing.JFormattedTextField txtOrcamento2;
    private javax.swing.JFormattedTextField txtOrcamento3;
    private javax.swing.JTextField txtQtdeColunas1;
    private javax.swing.JTextField txtQtdeColunas2;
    private javax.swing.JTextField txtQtdeColunas3;
    private javax.swing.JTextField txtQtdeFerroColuna1;
    private javax.swing.JTextField txtQtdeFerroColuna2;
    private javax.swing.JTextField txtQtdeFerroColuna3;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtUsuarioLogado1;
    private javax.swing.JTextField txtUsuarioLogado2;
    private javax.swing.JTextField txtUsuarioLogado3;
    // End of variables declaration//GEN-END:variables
}
