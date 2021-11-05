
package erp.objects;

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
    private Fornecedor fornecedor;
    private int fornecedorr;
    private double lucro;
    private String estoque;

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

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }


    


    public String getEstoque() {
        return estoque;
    }


    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }
    
}
