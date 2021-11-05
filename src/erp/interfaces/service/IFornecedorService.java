/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.interfaces.service;

import erp.exceptions.ExceptionFornecedor;
import erp.objects.Fornecedor;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author home
 */
public interface IFornecedorService {
    
    public void adicionarFornecedor(Fornecedor obj) throws ExceptionFornecedor;
    public void uptadeFornecedor(Fornecedor obj) throws ExceptionFornecedor;
    public void deleteFornecedor(Fornecedor obj) throws ExceptionFornecedor;
    public void listarFornecedor(Fornecedor obj) throws ExceptionFornecedor;
    public void buscarFornecedorPorNome(String nome) throws ExceptionFornecedor;
    public List<Fornecedor> listarIdNomeFornecedorParaProd() throws ExceptionFornecedor; 
    public ResultSet ListarFornece();
}  
