/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.objects;

import erp.dao.NivelAcessoDAO;

/**
 *
 * @author home
 */
public class Funcionario {
    
    
    private NivelAcesso nivelAcesso;
    
    private String nivelAcessoo;
    
    private int id;
    private String login;
    private String senha;
    private String nome;
    private String rg;
    private String cpf;
    private String endereco;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String bairro;
    
    public NivelAcessoDAO ndao = new NivelAcessoDAO();
    
    public Funcionario(){
        
    }
    public Funcionario(int id, String login, String senha, NivelAcesso nivelAcesso, String nome, String rg, String cpf, String endereco, String cep, String cidade, String uf, String numero, String bairro){
        super();
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
        this.nome = nome;
        this.rg = rg;
        this.cpf= cpf;
        this.cidade = cidade;
        this.uf = uf;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getNivelAcessoo() {
        return nivelAcessoo;
    }

    public void setNivelAcessoo(String nivelAcessoo) {
        this.nivelAcessoo = nivelAcessoo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int id) {
        NivelAcesso obj = ndao.nivelAcessoIdSearch(id);
        this.nivelAcesso = obj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
}
