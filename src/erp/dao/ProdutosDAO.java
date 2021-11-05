/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.dao;

import java.sql.Connection;
import erp.jdbc.ConnectionFactory;
import erp.objects.Produtos;
import erp.objects.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import erp.view.frmProdutos;

/**
 *
 * @author Jaime
 */
public class ProdutosDAO {
    
    public Connection con;
    
    public ProdutosDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    

    public void adicionarProdutos(Produtos obj){
        try {
            String sql = "insert into produtos (nome, unidade, precoDeCompra, precoDeVenda, fornecedor, estoque, lucro)"
                    + "value(?,?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNome());     
            stm.setString(2, obj.getUnidade());
            stm.setInt(3, obj.getPrecoDeCompra());
            stm.setDouble(4, obj.getPrecoDeVenda());
            //stm.setInt(5, obj.getFornecedor().getId());
            stm.setInt(5, obj.getFornecedorr());
            stm.setString(6, obj.getEstoque());
            stm.setDouble(7,obj.getLucro());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro de produto feito com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao efetuar cadastro de produto"+" "+e);
        }
    }
    
    public void updateProdutos(Produtos obj){
        try {
            String sql = "update produtos set nome=?, unidade=?, precoDeCompra=?, "
                    + "precoDeVenda=?, fornecedor=?, estoque=?, lucro=? where idProd=?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNome());     
            stm.setString(2, obj.getUnidade());
            stm.setInt(3, obj.getPrecoDeCompra());
            stm.setDouble(4, obj.getPrecoDeVenda());
            //stm.setInt(5, obj.getFornecedor().getId());
            stm.setInt(5, obj.getFornecedorr());
            stm.setString(6, obj.getEstoque());
            stm.setDouble(7, obj.getLucro());
            stm.setInt(8, obj.getIdProd());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto: "+e);
        }
    }
    
   public void deleteProdutos(Produtos obj){
        try {
            String sql = "delete from produtos where idProd=?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, obj.getIdProd());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir produto"+" "+e);
        }
    }
    public List<Produtos> listarProdutosNomes(String nome){
        try {
            List<Produtos> lista = new ArrayList<>();
            
            String sql = "select * from produtos where nome like ?";
            
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1,nome);
            ResultSet rs = stm.executeQuery();
            
           while (rs.next()){
               Produtos obj = new Produtos();
               
               obj.setIdProd(rs.getInt("idProd"));
               obj.setNome(rs.getString("nome"));
               obj.setUnidade(rs.getString("unidade"));
               obj.setPrecoDeCompra(rs.getInt("precoDeCompra"));
               obj.setPrecoDeVenda(rs.getDouble("precoDeVenda"));
               obj.setFornecedorr(rs.getInt("fornecedor"));
               //obj.getFornecedor().setId(rs.getInt("fornecedor")); // erro em get
               obj.setEstoque(rs.getString("estoque"));
               obj.setLucro(rs.getDouble("lucro"));
               
               
               lista.add(obj);
                
           }
           return lista;
        } catch (Exception e) {
            return null;
        }
    }
    public List<Produtos> listarProdutos(){
        try {
            List<Produtos> lista = new ArrayList<>();
            
            String sql = "select * from produtos";
            
            
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
           while (rs.next()){
               Produtos obj = new Produtos();
               
               obj.setIdProd(rs.getInt("idProd"));
               obj.setNome(rs.getString("nome"));
               obj.setUnidade(rs.getString("unidade"));
               obj.setPrecoDeCompra(rs.getInt("precoDeCompra"));
               obj.setPrecoDeVenda(rs.getDouble("precoDeVenda"));
               obj.setFornecedorr(rs.getInt("fornecedor"));
               //obj.getFornecedor().setId(rs.getInt("fornecedor"));
               obj.setEstoque(rs.getString("estoque"));
               obj.setLucro(rs.getDouble("lucro"));
               
               
               lista.add(obj);
                
           }
           return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Produtos: "+e);
            return null;
        }
    }
    
    public List<Produtos> buscarProdutosPorNome(String nome){
        try {
            List<Produtos> lista = new ArrayList();
            
            String sql ="select * from produtos where nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Produtos obj = new Produtos();
                
               obj.setIdProd(rs.getInt("idProd"));
               obj.setNome(rs.getString("nome"));
               obj.setUnidade(rs.getString("unidade"));
               obj.setPrecoDeCompra(rs.getInt("precoDeCompra"));
               obj.setPrecoDeVenda(rs.getDouble("precoDeVenda"));
               //obj.setFornecedorr(rs.getInt("fornecedor"));
               obj.getFornecedor().setId(rs.getInt("fornecedor"));
               obj.setEstoque(rs.getString("estoque"));
               obj.setLucro(rs.getDouble("lucro"));
                    
                    lista.add(obj);           
            }
            return lista;
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Buscar Produtos:"+" "+e);
                return null;
        }
    }
    public Produtos buscarPorCodigo(int idProd){
        try {
            
            String sql = "select * from produtos where idProd = ?";
            
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1,idProd);
            ResultSet rs = stm.executeQuery();
            Produtos obj = new Produtos();
            
           while (rs.next()){
               
               obj.setIdProd(rs.getInt("idProd"));
               obj.setNome(rs.getString("nome"));
               obj.setUnidade(rs.getString("unidade"));
               obj.setPrecoDeCompra(rs.getInt("precoDeCompra"));
               obj.setPrecoDeVenda(rs.getDouble("precoDeVenda"));
               obj.setFornecedorr(rs.getInt("fornecedor"));
               //obj.getFornecedor().setId(rs.getInt("fornecedor"));
               obj.setEstoque(rs.getString("estoque"));
               obj.setLucro(rs.getDouble("lucro"));
               
              
                
           }
           return obj;
        } catch (Exception e) {
            return null;
        }
    }
}
