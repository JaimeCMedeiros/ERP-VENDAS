/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.objects;

/**
 *
 * @author home
 */
public class ItemVenda {
    private int id;
    private Vendas venda;
    private Produtos produtos; // meu produto
    private int qtd;
    private double subtotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vendas getVenda() {
        return venda;
    }

    public void setVenda(Vendas venda) {
        this.venda = venda;
    }


    public Produtos getProdutos() {
        return produtos;
     }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    
   // public ProdutosProf getProdutoProf() {
   //     return produtoProf;
   //}

   // public void setProdutoProf(ProdutosProf produtoProf) {
   //     this.produtoProf = produtoProf;
   // }
   // private ProdutosProf produtoProf;  classe produto 
}
