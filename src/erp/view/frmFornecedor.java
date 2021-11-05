/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.view;

import erp.dao.FornecedorDAO;
import erp.objects.Fornecedor;
import erp.services.FornecedorService;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author home
 */
public class frmFornecedor extends javax.swing.JFrame {

    public void LimparCamp(){
        tfCidadeFor.setText("");
        tfCodigoFor.setText("");
        tfEmailFor.setText("");
        tfEnderecoFor.setText("");
        tfNomeFor.setText("");
        ftCepFor.setText("");
        ftCnpjFor.setText("");
        ftFoneFor.setText("");
        ftIeFor.setText("");
        
    }
 
    public void listar(){
        FornecedorDAO dao = new FornecedorDAO();
        List<Fornecedor> lista = dao.listarFornecedor();
        DefaultTableModel dados = (DefaultTableModel) tabelaFornecedor.getModel();
        dados.setNumRows(0);
        for (Fornecedor f : lista){
            dados.addRow (new Object[]{
                f.getId(),
                f.getNome(),
                f.getCnpj(),
                f.getFone(),
                f.getEmail(),
                f.getIe(),
                f.getCep(),
                f.getCidade(),
                f.getUf(),
                f.getEndereco()
              
            });
        }
    }
    
    public frmFornecedor() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfCodigoFor = new javax.swing.JTextField();
        tfNomeFor = new javax.swing.JTextField();
        ftCnpjFor = new javax.swing.JFormattedTextField();
        ftFoneFor = new javax.swing.JFormattedTextField();
        tfEmailFor = new javax.swing.JTextField();
        ftIeFor = new javax.swing.JFormattedTextField();
        ftCepFor = new javax.swing.JFormattedTextField();
        tfCidadeFor = new javax.swing.JTextField();
        cbUfFor = new javax.swing.JComboBox<>();
        tfEnderecoFor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tfPesquisarFor = new javax.swing.JTextField();
        btnPesquisarFor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btSalvarFor = new javax.swing.JButton();
        btEditarFor = new javax.swing.JButton();
        btExcluirFor = new javax.swing.JButton();
        btNovoFor = new javax.swing.JButton();
        btTelaP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel2.setText("Nome");

        jLabel3.setText("CNPJ");

        jLabel4.setText("Fone");

        jLabel5.setText("Email");

        jLabel6.setText("IE");

        jLabel7.setText("CEP");

        jLabel8.setText("Cidade");

        jLabel9.setText("UF");

        jLabel10.setText("Endereco");

        tfCodigoFor.setEditable(false);

        try {
            ftCnpjFor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftFoneFor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftIeFor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftCepFor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbUfFor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigoFor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(ftCnpjFor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(ftFoneFor, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tfNomeFor)
                    .addComponent(jLabel5)
                    .addComponent(tfEmailFor)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel7)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addComponent(ftIeFor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ftCepFor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfCidadeFor, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbUfFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(tfEnderecoFor)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCodigoFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNomeFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftCnpjFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftFoneFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfEmailFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftIeFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftCepFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCidadeFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUfFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEnderecoFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fornecedor", jPanel2);

        jLabel11.setText("Nome");

        tfPesquisarFor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarForKeyPressed(evt);
            }
        });

        btnPesquisarFor.setText("Pesquisar");
        btnPesquisarFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarForActionPerformed(evt);
            }
        });

        tabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "CNPJ", "Fone", "Email", "IE", "CEP", "Cidade", "UF", "Título 10"
            }
        ));
        tabelaFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedor);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPesquisarFor, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarFor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfPesquisarFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarFor))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar", jPanel3);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btSalvarFor.setText("Salvar");
        btSalvarFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarForActionPerformed(evt);
            }
        });

        btEditarFor.setText("Editar");
        btEditarFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarForActionPerformed(evt);
            }
        });

        btExcluirFor.setText("Excluir");
        btExcluirFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirForActionPerformed(evt);
            }
        });

        btNovoFor.setText("Novo");
        btNovoFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoForActionPerformed(evt);
            }
        });

        btTelaP.setText("Tela P");
        btTelaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTelaPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvarFor, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btNovoFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluirFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEditarFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTelaP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btSalvarFor)
                .addGap(18, 18, 18)
                .addComponent(btEditarFor)
                .addGap(18, 18, 18)
                .addComponent(btExcluirFor)
                .addGap(18, 18, 18)
                .addComponent(btNovoFor)
                .addGap(18, 18, 18)
                .addComponent(btTelaP)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarForActionPerformed
        
        try {
        Fornecedor obj = new Fornecedor();
        
        obj.setNome(tfNomeFor.getText());
        obj.setCnpj(ftCnpjFor.getText());
        obj.setFone(ftFoneFor.getText());
        obj.setEmail(tfEmailFor.getText());
        obj.setIe(ftIeFor.getText());
        obj.setCep(ftCepFor.getText());
        obj.setCidade(tfCidadeFor.getText());
        obj.setUf(cbUfFor.getSelectedItem().toString());
        obj.setEndereco(tfEnderecoFor.getText());
        
        FornecedorService foServ = new FornecedorService();
        foServ.adicionarFornecedor(obj);
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btSalvarForActionPerformed

    private void btEditarForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarForActionPerformed
        
        try {
            Fornecedor obj = new Fornecedor();
        
        obj.setNome(tfNomeFor.getText());
        obj.setCnpj(ftCnpjFor.getText());
        obj.setFone(ftFoneFor.getText());
        obj.setEmail(tfEmailFor.getText());
        obj.setIe(ftIeFor.getText());
        obj.setCep(ftCepFor.getText());
        obj.setCidade(tfCidadeFor.getText());
        obj.setUf(cbUfFor.getSelectedItem().toString());
        obj.setEndereco(tfEnderecoFor.getText());
        obj.setId(Integer.parseInt(tfCodigoFor.getText()));
        
        
        FornecedorService foServ = new FornecedorService();
        foServ.uptadeFornecedor(obj);
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btEditarForActionPerformed

    private void btExcluirForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirForActionPerformed
        
        try {
        Fornecedor obj = new Fornecedor();
        obj.setId(Integer.parseInt(tfCodigoFor.getText()));
        FornecedorService foServ = new FornecedorService();
        foServ.deleteFornecedor(obj);
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btExcluirForActionPerformed

    private void btNovoForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoForActionPerformed
        
        LimparCamp();
        
    }//GEN-LAST:event_btNovoForActionPerformed
     
    private void btnPesquisarForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarForActionPerformed
        
    }//GEN-LAST:event_btnPesquisarForActionPerformed

    private void tabelaFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedorMouseClicked
        
        jTabbedPane1.setSelectedIndex(0);
        tfCodigoFor.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(),0).toString());
        tfNomeFor.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(),1).toString());
        ftCnpjFor.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(),2).toString());
        ftFoneFor.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(),3).toString());
	tfEmailFor.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(),4).toString());
        ftIeFor.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(),5).toString());
        ftCepFor.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(),6).toString());
        tfCidadeFor.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(),6).toString());
        cbUfFor.setSelectedItem(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(),7).toString());
        tfEnderecoFor.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(),9).toString());
        
    }//GEN-LAST:event_tabelaFornecedorMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        listar();
        
    }//GEN-LAST:event_formWindowActivated

    private void tfPesquisarForKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarForKeyPressed

        try {
        String nome ="%"+tfPesquisarFor.getText()+"%";
        FornecedorDAO dao = new FornecedorDAO();
        List<Fornecedor> lista = dao.buscarFornecedorPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaFornecedor.getModel();
        dados.setNumRows(0);
        for (Fornecedor f : lista){
            dados.addRow (new Object[]{
                f.getId(),
                f.getNome(),
                f.getCnpj(),
                f.getFone(),
                f.getEmail(),
                f.getIe(),
                f.getCep(),
                f.getCidade(),
                f.getUf(),
                f.getEndereco()
              
            });
        }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_tfPesquisarForKeyPressed

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
            java.util.logging.Logger.getLogger(frmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarFor;
    private javax.swing.JButton btExcluirFor;
    private javax.swing.JButton btNovoFor;
    private javax.swing.JButton btSalvarFor;
    private javax.swing.JButton btTelaP;
    private javax.swing.JButton btnPesquisarFor;
    private javax.swing.JComboBox<String> cbUfFor;
    private javax.swing.JFormattedTextField ftCepFor;
    private javax.swing.JFormattedTextField ftCnpjFor;
    private javax.swing.JFormattedTextField ftFoneFor;
    private javax.swing.JFormattedTextField ftIeFor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTable tabelaFornecedor;
    private javax.swing.JTextField tfCidadeFor;
    private javax.swing.JTextField tfCodigoFor;
    private javax.swing.JTextField tfEmailFor;
    private javax.swing.JTextField tfEnderecoFor;
    private javax.swing.JTextField tfNomeFor;
    private javax.swing.JTextField tfPesquisarFor;
    // End of variables declaration//GEN-END:variables
}
