/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.dao;

import erp.jdbc.ConnectionFactory;
import erp.objects.ItemVenda;
import erp.objects.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class ItemVendaDAO {
    
    private Connection con;
    
    public ItemVendaDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    
    public void addItemVenda(ItemVenda obj){
        try {
            String sql = "insert into itensvendas (venda_id, produto_id, qtd, sub_total) "
                    + "value (?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, obj.getVenda().getId());
            stm.setInt(2, obj.getProdutos().getIdProd());
            stm.setInt(3, obj.getQtd());
            stm.setDouble(4, obj.getSubtotal());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao cadastrar:" + " " +e);
        }
    }
    
}
