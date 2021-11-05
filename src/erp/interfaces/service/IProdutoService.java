/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.interfaces.service;

import erp.exceptions.ExceptionProduto;
import erp.objects.Produtos;
import java.util.List;

/**
 *
 * @author home
 */
public interface IProdutoService {
    
    public void adicionarProdutos(Produtos obj) throws ExceptionProduto;
    public void updateProdutos(Produtos obj) throws ExceptionProduto;
    public void deleteProdutos(Produtos obj) throws ExceptionProduto;
    public List<Produtos> listarProdutosNomes(String nome) throws ExceptionProduto;
    public List<Produtos> listarProdutos() throws ExceptionProduto;
    public List<Produtos> buscarProdutosPorNome(String nome) throws ExceptionProduto;
    public Produtos buscarPorCodigo(int idProd) throws ExceptionProduto;
}
