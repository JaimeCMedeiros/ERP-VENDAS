/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.view;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import erp.dao.FornecedorDAO;
import erp.dao.ProdutosDAO;
import erp.objects.Fornecedor;
import erp.objects.Produtos;
import erp.services.ProdutoService;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author home
 */
public class frmProdutos extends javax.swing.JFrame {

    public void limparPorBtnNovo(){
    tfCodigo.setText("");
    tfNome.setText("");
    tfPercentualDeLucro.setText("");
    tfCodigoFornecedor.setText("");
    tfPrecoDeVenda.setText("");
    tfPrecoDeCompra.setText("");
    tfEstoque.setText("");
    tfUnidade.setText("");
    }
    
    public void listar(){
        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listarProdutos();
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);
        
        for (Produtos c : lista){
            dados.addRow(new Object[]{
            c.getIdProd(),
            c.getNome(),
            c.getUnidade(),
            c.getPrecoDeCompra(),
            c.getPrecoDeVenda(),
            //c.getFornecedor().getId(), //c.getFornecedor().getId() //c.setFornecedor().getId() 
            c.getFornecedorr(),
            c.getEstoque(),
            c.getLucro()
                    
            });
        }
    }
    
    Vector<Integer> idFornecedor = new Vector<Integer>();
    public void PreencherComboBoxForne(){
        try {
            FornecedorDAO fDAO = new FornecedorDAO();
            ResultSet rs = fDAO.ListarFornece();
            
            while (rs.next()) {
                idFornecedor.addElement(rs.getInt(1));
                cbxForneListar.addItem(rs.getString(2));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error no PreencherComboBoForne: "+ e);
        }
    }
    
    public frmProdutos() {
       initComponents();
       PreencherComboBoxForne();
       //PreencherId();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfUnidade = new javax.swing.JTextField();
        tfPrecoDeCompra = new JtextFieldSomenteNumeros();
        tfPercentualDeLucro = new JtextFieldSomenteNumeros();
        tfPrecoDeVenda = new JtextFieldSomenteNumeros();
        tfEstoque = new javax.swing.JTextField();
        tfCodigoFornecedor = new javax.swing.JTextField();
        cbxForneListar = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btTelaP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel2.setText("Nome");

        jLabel3.setText("Unidades");

        jLabel4.setText("Preço de Compra");

        jLabel5.setText("Percentual de Lucro");

        jLabel6.setText("Preço de Venda");

        jLabel7.setText("Fornecedor");

        jLabel8.setText("Quant. Estoque");

        jLabel10.setText("Codigo Fornecedor");

        tfCodigo.setEditable(false);

        tfPercentualDeLucro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPercentualDeLucroFocusLost(evt);
            }
        });

        tfCodigoFornecedor.setEditable(false);
        tfCodigoFornecedor.setToolTipText("Obs: Somente para observa qual é o codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfPrecoDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfPercentualDeLucro))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tfPrecoDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxForneListar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(tfCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrecoDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPercentualDeLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrecoDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxForneListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Produtos", jPanel1);

        jLabel9.setText("Nome");

        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyPressed(evt);
            }
        });

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Uni.", "Preç.Compra", "Preç.venda", "Cod.Fornecedor", "Quant.Estoque", "Lucro %"
            }
        ));
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar", jPanel2);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btNovo.setText("Novo");
        btNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNovoMouseClicked(evt);
            }
        });
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarMouseClicked(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditarMouseClicked(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExcluirMouseClicked(evt);
            }
        });

        btTelaP.setText("Tela P");
        btTelaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTelaPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(btNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTelaP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btNovo)
                .addGap(18, 18, 18)
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btEditar)
                .addGap(18, 18, 18)
                .addComponent(btExcluir)
                .addGap(18, 18, 18)
                .addComponent(btTelaP)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoMouseClicked
        
        limparPorBtnNovo();
        
    }//GEN-LAST:event_btNovoMouseClicked

    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseClicked
        try {
            
       
        int CodigoFornecedor;
        Produtos obj = new Produtos();
        
        obj.setNome(tfNome.getText());
        obj.setUnidade(tfUnidade.getText());
        obj.setPrecoDeCompra(Integer.parseInt(tfPrecoDeCompra.getText()));
        obj.setPrecoDeVenda(Double.parseDouble(tfPrecoDeVenda.getText()));
        CodigoFornecedor = idFornecedor.get(cbxForneListar.getSelectedIndex()); 
        obj.setFornecedor(CodigoFornecedor);
        obj.setEstoque(tfEstoque.getText());
        obj.setLucro(Double.parseDouble(tfPercentualDeLucro.getText()));
        
        ProdutoService ps = new ProdutoService();
        ps.adicionarProdutos(obj);
        
        //ProdutosDAO dao= new ProdutosDAO();
        //dao.adicionarProdutos(obj);
        //obj.getFornecedor().setId(CodigoFornecedor);
         } catch (Exception e) {
        }
    }//GEN-LAST:event_btSalvarMouseClicked

    private void btEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseClicked
        try {
            
        int CodigoFornecedor;
        Produtos obj = new Produtos();
        
        obj.setNome(tfNome.getText());
        obj.setUnidade(tfUnidade.getText());
        obj.setPrecoDeCompra(Integer.parseInt(tfPrecoDeCompra.getText()));
        obj.setPrecoDeVenda(Double.parseDouble(tfPrecoDeVenda.getText()));
        CodigoFornecedor = idFornecedor.get(cbxForneListar.getSelectedIndex());
        obj.setFornecedor(CodigoFornecedor);
        obj.setEstoque(tfEstoque.getText());
        obj.setLucro(Double.parseDouble(tfPercentualDeLucro.getText()));
        obj.setIdProd(Integer.parseInt(tfCodigo.getText()));
        
        ProdutoService ps = new ProdutoService();
        ps.updateProdutos(obj);
        
        //obj.getFornecedor().setId(CodigoFornecedor);
        //ProdutosDAO dao= new ProdutosDAO();
        //dao.updateProdutos(obj);
                } catch (Exception e) {
        }
    }//GEN-LAST:event_btEditarMouseClicked

    private void btExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseClicked
        try {
            
        Produtos obj = new Produtos();
        obj.setIdProd(Integer.parseInt(tfCodigo.getText()));
        ProdutoService ps = new ProdutoService();
        ps.deleteProdutos(obj);
        
        //ProdutosDAO dao = new ProdutosDAO();
        //dao.deleteProdutos(obj);
            } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btExcluirMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        listar();
        
    }//GEN-LAST:event_formWindowActivated

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        
        jTabbedPane1.setSelectedIndex(0);
        tfCodigo.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),0).toString());
        tfNome.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),1).toString());
        tfUnidade.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),2).toString());
        tfPrecoDeCompra.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),3).toString());
        tfPrecoDeVenda.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),4).toString());
        tfCodigoFornecedor.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),5).toString());
        tfEstoque.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),6).toString());
        tfPercentualDeLucro.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),7).toString());
        
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void tfPercentualDeLucroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPercentualDeLucroFocusLost
        
        double porcentagem;
        porcentagem = ((Double.parseDouble(tfPrecoDeCompra.getText()) *
                Double.parseDouble(tfPercentualDeLucro.getText())) / 100) +
                Double.parseDouble(tfPrecoDeCompra.getText());
        tfPrecoDeVenda.setText(String.valueOf(porcentagem));
        
    }//GEN-LAST:event_tfPercentualDeLucroFocusLost

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed

        //limparPorBtnNovo();
        
    }//GEN-LAST:event_btNovoActionPerformed

    private void tfPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyPressed
        
        String nome = "%"+tfPesquisar.getText()+"%";
        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listarProdutosNomes(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);
        
        for (Produtos c : lista){
            dados.addRow(new Object[]{
            c.getIdProd(),
            c.getNome(),
            c.getUnidade(),
            c.getPrecoDeCompra(),
            c.getPrecoDeVenda(),
            c.getFornecedor().getId(),
            c.getEstoque(),
            c.getLucro()
                    
            });
        }
        
    }//GEN-LAST:event_tfPesquisarKeyPressed

    private void btTelaPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTelaPMouseClicked
        
        frmPrincipal telaPri = new frmPrincipal();
        telaPri.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btTelaPMouseClicked


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
            java.util.logging.Logger.getLogger(frmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btTelaP;
    private javax.swing.JComboBox<String> cbxForneListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCodigoFornecedor;
    private javax.swing.JTextField tfEstoque;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPercentualDeLucro;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextField tfPrecoDeCompra;
    private javax.swing.JTextField tfPrecoDeVenda;
    private javax.swing.JTextField tfUnidade;
    // End of variables declaration//GEN-END:variables
}
