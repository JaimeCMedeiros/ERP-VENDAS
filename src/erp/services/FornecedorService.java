/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.services;

import erp.dao.FornecedorDAO;
import erp.exceptions.ExceptionFornecedor;
import erp.interfaces.service.IFornecedorService;
import erp.objects.Fornecedor;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class FornecedorService implements IFornecedorService {
    FornecedorDAO fDAO = new FornecedorDAO();

    @Override
    public void adicionarFornecedor(Fornecedor obj) throws ExceptionFornecedor {
         try {
            if ("".equals(obj.getNome()) || "".equals(obj.getCnpj()) || 
                    "".equals(obj.getFone()) || "".equals(obj.getEmail()) || 
                    "".equals(obj.getIe()) || "".equals(obj.getCep()) ||
                    "".equals(obj.getCidade()) ||"".equals(obj.getUf()) ||
                    "".equals(obj.getEndereco())) {
                throw new ExceptionFornecedor("Não pode salvar faltando informações");
            }
            fDAO.addFornecedor(obj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    @Override
    public void uptadeFornecedor(Fornecedor obj) throws ExceptionFornecedor {
        try {
            if ("".equals(obj.getNome()) || "".equals(obj.getCnpj()) || 
                    "".equals(obj.getFone()) || "".equals(obj.getEmail()) || 
                    "".equals(obj.getIe()) || "".equals(obj.getCep()) ||
                    "".equals(obj.getCidade()) ||"".equals(obj.getUf()) ||
                    "".equals(obj.getEndereco())) {
                throw new ExceptionFornecedor("Não pode salvar faltando informações");
            }
            fDAO.updateFornecedor(obj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    @Override
    public void deleteFornecedor(Fornecedor obj) throws ExceptionFornecedor {
        try {
            if("".equals(obj.getId())){
                throw new ExceptionFornecedor("Não pode alterar faltando informações");
            }
            fDAO.deleteFornecedor(obj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    @Override
    public void listarFornecedor(Fornecedor obj) throws ExceptionFornecedor {
        throw new UnsupportedOperationException("Not supported yet."); //Preciso começar a fazer a regrinha de negocios
    }

    @Override
    public void buscarFornecedorPorNome(String nome) throws ExceptionFornecedor {
        throw new UnsupportedOperationException("Not supported yet."); //Preciso começar a fazer a regrinha de negocios
    }

    @Override
    public List<Fornecedor> listarIdNomeFornecedorParaProd() throws ExceptionFornecedor {
        throw new UnsupportedOperationException("Not supported yet."); //Preciso começar a fazer a regrinha de negocios
    }

    @Override
    public ResultSet ListarFornece() {
        throw new UnsupportedOperationException("Not supported yet."); //Preciso começar a fazer a regrinha de negocios
    }
    
}
