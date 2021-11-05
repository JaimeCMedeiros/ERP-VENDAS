/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.dao;
import java.sql.Connection;
import erp.jdbc.ConnectionFactory;
import erp.objects.Vendas;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class VendasDAO {
    
    private Connection con;
    
    public VendasDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    
    public void cadastrarVenda(Vendas obj){
        try {
            String sql = "insert into vendas (cliente_id, data_venda, total_venda, observacoes) "
                    + "value (?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, obj.getCliente().getId());
            stm.setString(2, obj.getData_venda());
            stm.setDouble(3, obj.getTotal_venda());
            stm.setString(4, obj.getObs());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao cadastrar:" + " " +e);
        }
    }
}
