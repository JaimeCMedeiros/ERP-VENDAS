/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.view;

import erp.dao.FuncionarioDAO;
import erp.dao.NivelAcessoDAO;
import erp.objects.Funcionario;
import erp.objects.NivelAcesso;
import erp.services.FuncionarioService;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author home
 */
public class frmFuncionario extends javax.swing.JFrame {
 
    public void LimparCamp(){
        ftCep.setText("");
        ftCpf.setText("");
        tfBairro.setText("");
        tfCidade.setText("");
        tfCodigo.setText("");
        tfEndereco.setText("");
        tfLogin.setText("");
        tfNome.setText("");
        tfNumero.setText("");
        tfRg.setText("");
        tfSenha.setText("");
    }

    Vector<Integer> idNivelAcesso = new Vector<Integer>();
    public void PreencherComboBoxNivelAcesso(){
        try {
            NivelAcessoDAO nDAO = new NivelAcessoDAO();
            ResultSet rs = nDAO.ListarNivelAcesso();
            
            while (rs.next()) {
                idNivelAcesso.addElement(rs.getInt(1));
                cbNivelAcesso.addItem(rs.getString(2));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error no PreencherComboBoForne: "+ e);
        }
    }
    
    
    public void listar(){
        FuncionarioDAO dao = new FuncionarioDAO();
        List<Funcionario> lista = dao.listarFuncionario();
        DefaultTableModel dados = (DefaultTableModel) tabelaFuncionario.getModel();
        dados.setNumRows(0);
        
        for (Funcionario c : lista){
            dados.addRow(new Object[]{
            c.getId(),
            c.getLogin(),
            c.getSenha(),
            //c.getNivelAcessoo(),
            c.getNivelAcesso().getNome(),
            c.getNome(),
            c.getRg(),
            c.getCpf(),
            c.getEndereco(),
            c.getCidade(),
            c.getUf(),
            c.getCep(),
            c.getBairro(),
            c.getNumero()
            
            });
        }
    }
    
   
    public frmFuncionario() {
        initComponents();
        
        //PreencherComboBoxNivelAcesso();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfRg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ftCpf = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbUf = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        ftCep = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cbNivelAcesso = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btTelaP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel4.setText("Nome");

        jLabel5.setText("RG");

        jLabel6.setText("CPF");

        try {
            ftCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Endereço");

        jLabel8.setText("Cidade");

        jLabel9.setText("UF");

        cbUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel10.setText("CEP");

        jLabel11.setText("Bairro");

        jLabel12.setText("Numero");

        try {
            ftCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel14.setText("Codigo");

        tfCodigo.setEditable(false);

        jLabel15.setText("Login");

        jLabel16.setText("Senha");

        jLabel17.setText("Perfil de Acesso");

        cbNivelAcesso.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbNivelAcessoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbNivelAcesso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbNivelAcessoMouseClicked(evt);
            }
        });
        cbNivelAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNivelAcessoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel11)
                                    .addComponent(tfBairro))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftCep)
                                    .addComponent(tfNumero)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel10))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(tfNome)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(ftCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfEndereco))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbNivelAcesso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbNivelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfCodigo))
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funcionario", jPanel2);

        jLabel13.setText("Nome");

        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyPressed(evt);
            }
        });

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Login", "Senha", "Nvl Acesso", "Nome", "RG", "Cpf", "Endereço", "Cidade", "UF", "CEP", "Bairro", "Numero"
            }
        ));
        tabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFuncionario);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listar", jPanel3);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btNovo.setText("Novo");
        btNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNovoMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTelaP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btNovo)
                .addGap(18, 18, 18)
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btEditar)
                .addGap(18, 18, 18)
                .addComponent(btExcluir)
                .addGap(18, 18, 18)
                .addComponent(btTelaP)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoMouseClicked
        
        LimparCamp();
        
    }//GEN-LAST:event_btNovoMouseClicked

    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseClicked

        int CodigoNivelAcesso;
        Funcionario obj = new Funcionario();
        
	obj.setLogin(tfLogin.getText());
	obj.setSenha(tfSenha.getText());
        
        
        //CodigoNivelAcesso = idNivelAcesso.get(cbNivelAcesso.getSelectedIndex());
        //obj.setNivelAcesso(CodigoNivelAcesso);
        //obj.getNivelAcesso().setId(CodigoNivelAcesso); // dando problema no relacionamento (provavel solução seria o evento ancestor do combobox)
        obj.getNivelAcesso(cbNivelAcesso.getSelectedIndex());//combobox
        
        obj.setNome(tfNome.getText());
        obj.setRg(tfRg.getText());
        obj.setCpf(ftCpf.getText());
        obj.setEndereco(tfEndereco.getText());
        obj.setCidade(tfCidade.getText());
        obj.setUf(cbUf.getSelectedItem().toString());
        obj.setCep(ftCep.getText());
        obj.setBairro(tfBairro.getText());
        obj.setNumero(tfNumero.getText());
        
        FuncionarioDAO fuDAO = new FuncionarioDAO();
        fuDAO.adicionarFuncionario(obj);
        
        //FuncionarioService fuServ = new FuncionarioService();
        //fuServ.adicionarFuncionario(obj);
        
    }//GEN-LAST:event_btSalvarMouseClicked

    private void btEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseClicked
        //try {
        int CodigoNivelAcesso;
        Funcionario obj = new Funcionario();
        
	obj.setLogin(tfLogin.getText());
	obj.setSenha(tfSenha.getText());
	//CodigoNivelAcesso = idNivelAcesso.get(cbNivelAcesso.getSelectedIndex());
        //obj.setNivelAcesso(CodigoNivelAcesso);
        //obj.getNivelAcesso().setId(CodigoNivelAcesso);
        //obj.setNivelAcessoo(cbNivelAcesso.getSelectedItem().toString());
        obj.setNome(tfNome.getText());
        obj.setRg(tfRg.getText());
        obj.setCpf(ftCpf.getText());
        obj.setEndereco(tfEndereco.getText());
        obj.setCidade(tfCidade.getText());
        obj.setUf(cbUf.getSelectedItem().toString());
        obj.setCep(ftCep.getText());
        obj.setBairro(tfBairro.getText());
        obj.setNumero(tfNumero.getText());
        obj.setId(Integer.parseInt(tfCodigo.getText()));
        
        FuncionarioDAO fuDAO = new FuncionarioDAO();
        fuDAO.updateFuncionario(obj);
        
       // FuncionarioService fuServ = new FuncionarioService();
        //fuServ.updateFuncionario(obj);
       // } catch (Exception e) {
       //     JOptionPane.showMessageDialog(null, "Erro no Editar frm"+e);
       // }
    }//GEN-LAST:event_btEditarMouseClicked

    private void btExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseClicked
        
        try {
        Funcionario obj = new Funcionario();
        obj.setId(Integer.parseInt(tfCodigo.getText()));
        
        //FuncionarioDAO fuDAO = new FuncionarioDAO();
        //fuDAO.deleteFuncionario(obj);
        
        FuncionarioService fuServ = new FuncionarioService();
        fuServ.deleteFuncionario(obj);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro no Excluir frm"+e);
        }
       
    }//GEN-LAST:event_btExcluirMouseClicked

    private void tfPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyPressed
        
        String nome ="%"+tfPesquisar.getText()+"%";
        
        FuncionarioDAO dao = new FuncionarioDAO();
        List<Funcionario> lista = dao.buscarFuncionarioPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel)tabelaFuncionario.getModel();
        dados.setNumRows(0);
        
        for (Funcionario f : lista){
            dados.addRow(new Object[]{
            f.getId(),
            f.getLogin(),
            f.getSenha(),
            f.getNivelAcessoo(),
            f.getNome(),
            f.getRg(),
            f.getCpf(),
            f.getEndereco(),
            f.getCidade(),
            f.getUf(),
            f.getCep(),
            f.getBairro(),
            f.getNumero()
            
            });
        }
        
    }//GEN-LAST:event_tfPesquisarKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
       listar();
       
    }//GEN-LAST:event_formWindowActivated

    private void tabelaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFuncionarioMouseClicked
        
       jTabbedPane1.setSelectedIndex(0);
        tfCodigo.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(),0).toString());
	tfLogin.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(),1).toString());
	tfSenha.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(),2).toString());
	cbNivelAcesso.setSelectedItem(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(),3).toString());
        tfNome.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(),4).toString());
        tfRg.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(),5).toString());
        ftCpf.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(),6).toString());
        tfEndereco.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(),7).toString());
        tfCidade.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(),8).toString());
        cbUf.setSelectedItem(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(),9).toString());
        ftCep.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(),10).toString());
        tfBairro.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(),11).toString());
        tfNumero.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(),12).toString());
        
    }//GEN-LAST:event_tabelaFuncionarioMouseClicked

    private void btTelaPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTelaPMouseClicked
        
        frmPrincipal telaPri = new frmPrincipal();
        telaPri.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btTelaPMouseClicked

    private void cbNivelAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNivelAcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNivelAcessoActionPerformed

    private void cbNivelAcessoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbNivelAcessoAncestorAdded
        // TODO add your handling code here:
        //NivelAcessoDAO  ndao = new NivelAcessoDAO();
       // List<NivelAcesso> listFu = ndao.listarNivAcesso();
        //cbNivelAcesso.removeAll();
       // for(NivelAcesso f : listFu){ 
        //    cbNivelAcesso.addItem(f);
       // }
        
    }//GEN-LAST:event_cbNivelAcessoAncestorAdded

    private void cbNivelAcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbNivelAcessoMouseClicked
        // TODO add your handling code here:
        NivelAcessoDAO  ndao = new NivelAcessoDAO();
        List<NivelAcesso> listFu = ndao.listarNivAcesso();
        cbNivelAcesso.removeAll();
        for(NivelAcesso f : listFu){ 
            cbNivelAcesso.addItem(f);
        }
    }//GEN-LAST:event_cbNivelAcessoMouseClicked


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
            java.util.logging.Logger.getLogger(frmFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btTelaP;
    private javax.swing.JComboBox cbNivelAcesso;
    private javax.swing.JComboBox<String> cbUf;
    private javax.swing.JFormattedTextField ftCep;
    private javax.swing.JFormattedTextField ftCpf;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfSenha;
    // End of variables declaration//GEN-END:variables
}
