/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.dao;

import erp.jdbc.ConnectionFactory;
import erp.objects.NivelAcesso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
    
    public NivelAcesso nivelAcessoIdSearch(int id){
        try {
            
            String sql ="select * from niveldeacesso where id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            NivelAcesso  obj = new NivelAcesso();
            
            while(rs.next()){
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
            }
            return obj;
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Buscar nivel de acesso dao :"+e);
                return null;
        }
    }
    
    public List<NivelAcesso> listarNivAcesso(){
        try {
                List<NivelAcesso> lista = new ArrayList<>();
                
                String sql = "select * from niveldeacesso";
                
                PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs = stm.executeQuery();
                
                while (rs.next()){
                    NivelAcesso obj = new NivelAcesso();
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
                    lista.add(obj);
                }
                return lista;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Listar no DAO nivel: "+e);
                return null;
            }
    }
}
