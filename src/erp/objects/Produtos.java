
package erp.objects;

import erp.dao.FornecedorDAO;

/**
 * 
 * @author Jaime
 */
public class Produtos {
    
    private int idProd;
    private String nome;
    private String unidade;
    private int precoDeCompra;
    private double precoDeVenda;
    private Fornecedor fornecedor; // não uso, tentar ajeitar o relacionamento
    private int fornecedorr;
    private double lucro;
    private int estoque;
    
    public FornecedorDAO fornecedordao = new FornecedorDAO();
    
    public Produtos(){
        
    }
    public Produtos(int idProd, String Nome, String unidade, int precoDeCompra, double precoDeVenda, Fornecedor fornecedor, double lucro, int estoque){
        super();
        this.idProd = idProd;
        this.nome = nome;
        this.unidade = unidade;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
        this.fornecedor = fornecedor;
        this.lucro = lucro;
        this.estoque = estoque;
    }

    public int getFornecedorr() {
        return fornecedorr;
    }

    public void setFornecedorr(int fornecedorr) {
        this.fornecedorr = fornecedorr;
    }

    
    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    
 
    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getUnidade() {
        return unidade;
    }


    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }


    public int getPrecoDeCompra() {
        return precoDeCompra;
    }


    public void setPrecoDeCompra(int precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }


    public double getPrecoDeVenda() {
        return precoDeVenda;
    }


    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int id) {
        Fornecedor obj = fornecedordao.fornecedorIdSearch(id);
        this.fornecedor = obj;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
}
