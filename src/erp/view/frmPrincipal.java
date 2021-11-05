/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.view;
import erp.view.frmCliente;
/**
 *
 * @author home
 */
public class frmPrincipal extends javax.swing.JFrame {


    public frmPrincipal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btCliente = new javax.swing.JButton();
        btProdutos = new javax.swing.JButton();
        btFornecedor = new javax.swing.JButton();
        btFuncionario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        btCliente.setBackground(new java.awt.Color(0, 0, 0));
        btCliente.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        btCliente.setForeground(new java.awt.Color(255, 153, 0));
        btCliente.setText("Cliente");
        btCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btClienteMouseClicked(evt);
            }
        });
        jPanel2.add(btCliente);
        btCliente.setBounds(10, 170, 100, 30);

        btProdutos.setBackground(new java.awt.Color(0, 0, 0));
        btProdutos.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        btProdutos.setForeground(new java.awt.Color(255, 153, 0));
        btProdutos.setText("Produtos");
        btProdutos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btProdutosMouseClicked(evt);
            }
        });
        jPanel2.add(btProdutos);
        btProdutos.setBounds(10, 290, 100, 30);

        btFornecedor.setBackground(new java.awt.Color(0, 0, 0));
        btFornecedor.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        btFornecedor.setForeground(new java.awt.Color(255, 153, 0));
        btFornecedor.setText("Fornecedor");
        btFornecedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFornecedorMouseClicked(evt);
            }
        });
        jPanel2.add(btFornecedor);
        btFornecedor.setBounds(10, 250, 100, 30);

        btFuncionario.setBackground(new java.awt.Color(0, 0, 0));
        btFuncionario.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        btFuncionario.setForeground(new java.awt.Color(255, 153, 0));
        btFuncionario.setText("Funcionario");
        btFuncionario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFuncionarioMouseClicked(evt);
            }
        });
        jPanel2.add(btFuncionario);
        btFuncionario.setBounds(10, 210, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedor/Screenshot_71.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteMouseClicked
        
        frmCliente tela = new frmCliente();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btClienteMouseClicked

    private void btFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFuncionarioMouseClicked
        
        frmFuncionario telaFunc = new frmFuncionario();
        telaFunc.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btFuncionarioMouseClicked

    private void btFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFornecedorMouseClicked
        
        frmFornecedor telaFor = new frmFornecedor();
        telaFor.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btFornecedorMouseClicked

    private void btProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProdutosMouseClicked
        
        frmProdutos telaProd = new frmProdutos();
        telaProd.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btProdutosMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btFuncionario;
    private javax.swing.JButton btProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
