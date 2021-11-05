/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.services;

import erp.dao.ProdutosDAO;
import erp.exceptions.ExceptionProduto;
import erp.interfaces.service.IProdutoService;
import erp.objects.Produtos;
import java.util.List;

/**
 *
 * @author home
 */
public class ProdutoService implements IProdutoService {
    ProdutosDAO pDAO = new ProdutosDAO();
        
    @Override
    public void adicionarProdutos(Produtos obj) throws ExceptionProduto {
        try {
            if("".equals(obj.getNome())||"".equals(obj.getUnidade())||"".equals(obj.getPrecoDeCompra())
                    ||"".equals(obj.getPrecoDeVenda()) ||"".equals(obj.getFornecedor())||"".equals(obj.getEstoque())
                    ||"".equals(obj.getLucro())){
                throw new ExceptionProduto("Não pode adicionaro faltando informações");
            }
            pDAO.adicionarProdutos(obj);
        } catch (Exception e) {       
        }
    }

    @Override
    public void updateProdutos(Produtos obj) throws ExceptionProduto {
           try {
            if("".equals(obj.getNome())||"".equals(obj.getUnidade())||"".equals(obj.getPrecoDeCompra())
                    ||"".equals(obj.getPrecoDeVenda()) ||"".equals(obj.getFornecedor())||"".equals(obj.getEstoque())
                    ||"".equals(obj.getLucro())){
                throw new ExceptionProduto("Não pode adicionaro faltando informações");
            }
            pDAO.updateProdutos(obj);
        } catch (Exception e) {       
        }
    }

    @Override
    public void deleteProdutos(Produtos obj) throws ExceptionProduto {
        try {
            if("".equals(obj.getIdProd())){
                throw new ExceptionProduto("Não pode deletar faltando informações");
            }
            pDAO.deleteProdutos(obj);
        } catch (Exception e) {
        }
    }

    @Override
    public List<Produtos> listarProdutosNomes(String nome) throws ExceptionProduto {
        throw new UnsupportedOperationException("Not supported yet."); //Preciso começar a fazer a regrinha de negocios
    }

    @Override
    public List<Produtos> listarProdutos() throws ExceptionProduto {
        throw new UnsupportedOperationException("Not supported yet."); //Preciso começar a fazer a regrinha de negocios
    }

    @Override
    public List<Produtos> buscarProdutosPorNome(String nome) throws ExceptionProduto {
        throw new UnsupportedOperationException("Not supported yet."); //Preciso começar a fazer a regrinha de negocios
    }

    @Override
    public Produtos buscarPorCodigo(int idProd) throws ExceptionProduto {
        throw new UnsupportedOperationException("Not supported yet."); //Preciso começar a fazer a regrinha de negocios
    }
    
}
