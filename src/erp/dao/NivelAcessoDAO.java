/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.dao;

import erp.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class NivelAcessoDAO {
    public Connection con;
    
    public NivelAcessoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    public ResultSet ListarNivelAcesso(){
            
            
            try {
                String sql = "select * from niveldeacesso";
                PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs = stm.executeQuery();
                return rs;
                 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error no Listar Niveis de Acesso "+e);
            return null;
        }

    }
    
}
