
package erp.dao;

import java.sql.Connection;
import erp.jdbc.ConnectionFactory;
import erp.objects.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Jaime
 */
public class FornecedorDAO {
    
    private Connection con;
    
    public FornecedorDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void adicionarFornecedor(Fornecedor obj){
        try {
            String sql = "insert into fornecedor (nome, cnpj, fone, email, ie, cep, cidade, uf, endereco) "
                    + "value (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getCnpj());
            stm.setString(3, obj.getFone());
            stm.setString(4, obj.getEmail());
            stm.setString(5, obj.getIe());
            stm.setString(6, obj.getCep());
            stm.setString(7, obj.getCidade());
            stm.setString(8, obj.getUf());
            stm.setString(9, obj.getEndereco());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao cadastrar:" + " " +e);
        }
    }
    
    public void updateFornecedor(Fornecedor obj){
        try {
            String sql = "update fornecedor set nome=?, cnpj=?, fone=?, email=?, ie=?,"
                    + " cep=?, cidade=?, uf=?, endereco=? where id=?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getCnpj());
            stm.setString(3, obj.getFone());
            stm.setString(4, obj.getEmail());
            stm.setString(5, obj.getIe());
            stm.setString(6, obj.getCep());
            stm.setString(7, obj.getCidade());
            stm.setString(8, obj.getUf());
            stm.setString(9, obj.getEndereco());
            stm.setInt(10, obj.getId());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado alterado com sucesso");
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro:"+" "+e);
        }
    }
    
    public void deleteFornecedor(Fornecedor obj){
        try {
            String sql ="delete from fornecedor where id=?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1,obj.getId());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado excluido com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cadastro:"+" "+e);
        }
    }
    public List<Fornecedor> listarIdNomeFornecedorParaProd(){
        try {
            List<Fornecedor> listaIdProd = new ArrayList<>();
            
            String sql = "select id,Nome from fornecedor";
            
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                Fornecedor obj = new Fornecedor();
                
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                listaIdProd.add(obj);
                
            }
            return listaIdProd;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar id: "+" "+e);
            return null;
        }
    }
    public ResultSet ListarFornece(){
            
            try {
                String sql = "select * from fornecedor";
                PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs = stm.executeQuery();
                return rs;
                 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error no ListarFornece"+e);
            return null;
        }

    }
    
    public List<Fornecedor> listarFornecedor(){
            try {
                List<Fornecedor> lista = new ArrayList<>();
                
                String sql = "select * from fornecedor";
                
                PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs = stm.executeQuery();
                
                while (rs.next()){
                    Fornecedor obj = new Fornecedor();
                    
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
                    obj.setCnpj(rs.getString("cnpj"));
                    obj.setFone(rs.getString("fone"));
                    obj.setEmail(rs.getString("email"));
                    obj.setIe(rs.getString("ie"));
                    obj.setCep(rs.getString("cep"));
                    obj.setCidade(rs.getString("cidade"));
                    obj.setUf(rs.getString("uf"));
                    obj.setEndereco(rs.getString("endereco"));
                    
                    lista.add(obj);
                }
                return lista;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Listar:"+" "+e);
                return null;
            }
}
    
        public List<Fornecedor> buscarFornecedorPorNome(String nome){
        try {
            List<Fornecedor> lista = new ArrayList();
            
            String sql ="select * from fornecedor where nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor obj = new Fornecedor();
                
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
                    obj.setCnpj(rs.getString("cnpj"));
                    obj.setFone(rs.getString("fone"));
                    obj.setEmail(rs.getString("email"));
                    obj.setIe(rs.getString("ie"));
                    obj.setCep(rs.getString("cep"));
                    obj.setCidade(rs.getString("cidade"));
                    obj.setUf(rs.getString("uf"));
                    obj.setEndereco(rs.getString("endereco"));
                    
		     lista.add(obj);           
            }
            return lista;
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Buscar Fornecedor:"+" "+e);
                return null;
        }
    }
   public Fornecedor fornecedorIdSearch(int id){
        try {
            
            String sql ="select * from fornecedor where id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            Fornecedor  obj = new Fornecedor();
            
            while(rs.next()){
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
                    obj.setCnpj(rs.getString("cnpj"));
                    obj.setFone(rs.getString("fone"));
                    obj.setEmail(rs.getString("email"));
                    obj.setIe(rs.getString("ie"));
                    obj.setCep(rs.getString("cep"));
                    obj.setCidade(rs.getString("cidade"));
                    obj.setUf(rs.getString("uf"));
                    obj.setEndereco(rs.getString("endereco"));
            }
            return obj;
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Buscar Cliente:"+" "+e);
                return null;
        }
    }
}
