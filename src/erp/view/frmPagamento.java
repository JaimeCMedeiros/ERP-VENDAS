/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.view;

import erp.dao.ProdutosDAO;
import erp.dao.VendasDAO;
import erp.objects.Clientes;
import erp.objects.ItemVenda;
import erp.objects.Produtos;
import erp.objects.Vendas;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author home
 */
public class frmPagamento extends javax.swing.JFrame {

    Clientes clientes = new Clientes();
    DefaultTableModel carrinho;
    public frmPagamento() {
        initComponents();
        
        tfCartao.setText("0");
        tfDinheiro.setText("0");
        tfPix.setText("0");
        tfTroco.setText("0");
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfDinheiro = new javax.swing.JTextField();
        tfCartao = new javax.swing.JTextField();
        tfPix = new javax.swing.JTextField();
        tfTroco = new javax.swing.JTextField();
        tfTtotal = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Dinheiro:");

        jLabel2.setText("Cartão:");

        jLabel3.setText("Pix:");

        jLabel4.setText("Troco:");

        jLabel5.setText("Total:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(tfCartao)
                    .addComponent(tfPix)
                    .addComponent(tfTroco)
                    .addComponent(tfTtotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tfDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFinalizar.setText("Finalizar Venda");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnFinalizar)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFinalizar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        
        //cria 6 variaveis do tipo double
        //p na frente de pix, cartão, dinheiro representa pagamento (pagamento de pix, pagamento de cartao e por ai vai)
        double pcartao, ppix, pdinheiro, totalpago, totalvenda, troco; 

        
        // atribui os textos presentes nos tf a essas variaveis
        pcartao = Double.parseDouble(tfCartao.getText());
        ppix = Double.parseDouble(tfPix.getText());
        pdinheiro = Double.parseDouble(tfDinheiro.getText());
        totalvenda = Double.parseDouble(tfTtotal.getText());
        
        // dis quue o total pago é igual a soma de todos os meios de pagamento
        totalpago = pcartao + ppix  + pdinheiro;
        
        // fala que o troco é o total pago menos o total da venda(preço da venda completo)
        troco = totalpago - totalvenda;
        
        //seta o valor do troco calculado(troco = totalpago - venda) no tftroco, para provavelmente ser salvo no banco de dados
        //quando for setar algum valor de uma variavel calculada em um tf ou ft, ou coisas relacionadas
        //primeiro tem q declarar como valueOF para meio que tirar o valor e trasnforma em uma string
        //>confirma raciocinio a cima<
        tfTroco.setText(String.valueOf(troco));
        
        //instancia o objeto vendas e não sei dizer ao certo a linha 208
        Vendas objv = new Vendas();
        objv.setCliente(clientes);
        
        //instancia date para pegar a data do momento da operação
        Date agora = new Date();
        
        //formata a data para um modo que o banco de dados aceite
        SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd");
        
        //armazena essa data formatada em uma variavel do tipo string para uso posterior
        String databd = data.format(agora);
        
        //declara a data do objeto venda como a variavel string databd
        objv.setData_venda(databd);
        
        
        //instancia o dao de vendas para armazenar ou fazer alguma operação envolvendo banco de dados
        VendasDAO daov = new VendasDAO();
        
        //utilizando o metodo cadastrarVenda do VendasDAO ele cadastra/salva o objeto vendas 
        //ou oque foi armaezenado no objeto vendas
        daov.cadastrarVenda(objv);
        
        //esse for ele provavelmente ver/retorna as informações do carrinho
        //carrinho provavelmente é a tabela do frmVendas aonde está salvo as informações do id produto,nome(produto), qtde, preco(unitario) e subtotal(preco * quantidade)
        //>mais aonde conseguimos o id do cliente que vai comprar esses produtos ou fazer essa compra<
        //>necessito de ajuda nesse for<
        for(int i=0;i<carrinho.getRowCount(); i++){
            
            //cria variaveis qtd_estoque, qtd_comprado, qtd_atualizado do tipo int, para armazenar algumas informações
            int qtd_estoque, qtd_comprado, qtd_atualizado;
            
            //instancia o objeto produtos e declara ele como objp
            Produtos objp = new Produtos();
            
            //instancia o dao produtosDAO e declara ele como daop
            ProdutosDAO daop = new ProdutosDAO();
            
            //instancia o objeto itemVenda e declara ele como item
            ItemVenda item = new ItemVenda();
            
            //provavelmente questão de relacionamento, >preciso de ajuda aq tbm<
            item.setVenda(objv);
            
            //aq ele pega a informação IdProd do objeto Produto para setar ela no carrinho
            //>estou perdido entre a parte (carrinho.getValueAt(i,0)<
            //>como que descobre a ordem para ser 0 , 2 , 3<
            //>ou como descobre aonde consegue essas informações<
            //>oque é exatamente esse carrinho<
            objp.setIdProd(Integer.parseInt(carrinho.getValueAt(i,0).toString()));
            item.setProdutos(objp);
            //se o metodo quarda 1º o id da venda, 2º id produto, 3º qtde, 4º subtotal
            //pq tem (1º idprod, 2º produto), 3º qtde e 4º subtotal ( ordem desse for(262, 263, 269 e 273))
            
            // aq ele pega a informação qtd do objeto itemVenda para setar no carrinho
            //>mas estou com o mesmo problema de nao saber das coisas das linhas 243, 244, 245,246<
            item.setQtd(Integer.parseInt(carrinho.getValueAt(i, 2).toString()));
            
            // aq ele pega a informação subtotal do objeto itemVenda para setar no carrinho
            //>mas estou com o mesmo problema de nao saber das coisas das linhas 243, 244, 245,246< 
            item.setSubtotal(Double.parseDouble(carrinho.getValueAt(i, 4).toString()));
            
            //aq ele pega a variavel criada na linha 230 e atribui a ele oque está na linha 3 do carrinho
            // >oque é exatamento o carrinho, aonde está , como saber a ordem das informações contida neles, e como posso manipular os dados nele sem dar problema
            qtd_comprado = Integer.parseInt(carrinho.getValueAt(i, 2).toString());
            
            
            qtd_estoque = Integer.parseInt(objp.getEstoque());
            
            
            //>pq o qtd_atualizado, e para que serve<
            //> e qual é a logica por tras dessa qtd_atualizado <
            //> e como eu posso pegar as informações presente no<
            //> e se o metodo que eu criei na linha 196 até 214 na classe ProdutosDAO serve<<
            //> e como eu posso utilizar aq para passar as informações do estoque do produto especifico que eu quero<
            qtd_atualizado = qtd_estoque -  qtd_comprado;
            //resolver o comentario a cima
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed


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
            java.util.logging.Logger.getLogger(frmPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tfCartao;
    private javax.swing.JTextField tfDinheiro;
    private javax.swing.JTextField tfPix;
    private javax.swing.JTextField tfTroco;
    public javax.swing.JTextField tfTtotal;
    // End of variables declaration//GEN-END:variables
}
