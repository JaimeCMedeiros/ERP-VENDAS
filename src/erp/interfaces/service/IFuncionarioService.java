/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.interfaces.service;

import erp.exceptions.ExceptionFuncionario;
import erp.objects.Funcionario;
import java.util.List;

/**
 *
 * @author home
 */
public interface IFuncionarioService {
    
     public void adicionarFuncionario(Funcionario obj) throws ExceptionFuncionario;
     public void updateFuncionario(Funcionario obj) throws ExceptionFuncionario;
     public void deleteFuncionario(Funcionario obj) throws ExceptionFuncionario;
     public List<Funcionario> listarFuncionario(Funcionario obj) throws ExceptionFuncionario;
     public List<Funcionario> buscarFuncionarioPorNome(String nome) throws ExceptionFuncionario;
     
}
