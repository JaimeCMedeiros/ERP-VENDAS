/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.services;

import erp.dao.FuncionarioDAO;
import erp.exceptions.ExceptionFuncionario;
import erp.interfaces.service.IFuncionarioService;
import erp.objects.Funcionario;
import java.util.List;

/**
 *
 * @author home
 */
public class FuncionarioService implements IFuncionarioService {
    FuncionarioDAO fuDAO = new FuncionarioDAO();

    @Override
    public void adicionarFuncionario(Funcionario obj) throws ExceptionFuncionario {
        try {
            if("".equals(obj.getLogin()) || "".equals(obj.getSenha()) || "".equals(obj.getNivelAcesso())
                    || "".equals(obj.getNome()) || "".equals(obj.getRg()) ||"".equals(obj.getCpf())
                    || "".equals(obj.getEndereco()) ||"".equals(obj.getCep()) || "".equals(obj.getCidade())
                    ||"".equals(obj.getUf()) ||"".equals(obj.getNumero()) ||"".equals(obj.getBairro()) ){
                throw new ExceptionFuncionario("Não pode adicionar faltando informações");
            }
            fuDAO.addFuncionario(obj);
        } catch (Exception e) {
        }
    }

    @Override
    public void updateFuncionario(Funcionario obj) throws ExceptionFuncionario {
        try {
            if("".equals(obj.getLogin()) || "".equals(obj.getSenha()) || "".equals(obj.getNivelAcesso())
                    || "".equals(obj.getNome()) || "".equals(obj.getRg()) ||"".equals(obj.getCpf())
                    || "".equals(obj.getEndereco()) ||"".equals(obj.getCep()) || "".equals(obj.getCidade())
                    ||"".equals(obj.getUf()) ||"".equals(obj.getNumero()) ||"".equals(obj.getBairro()) ){
                throw new ExceptionFuncionario("Não pode adicionar faltando informações");
            }
            fuDAO.updateFuncionario(obj);
        } catch (Exception e) {
        }
    }

    @Override
    public void deleteFuncionario(Funcionario obj) throws ExceptionFuncionario {
        try {
            if("".equals(obj.getId())){
                throw new ExceptionFuncionario("Não pode excluir faltando informações");
            }
            fuDAO.deleteFuncionario(obj);
        } catch (Exception e) {
            }
    }

    @Override
    public List<Funcionario> listarFuncionario(Funcionario obj) throws ExceptionFuncionario {
        throw new UnsupportedOperationException("Not supported yet."); //Preciso começar a fazer a regrinha de negocios
    }

    @Override
    public List<Funcionario> buscarFuncionarioPorNome(String nome) throws ExceptionFuncionario {
        throw new UnsupportedOperationException("Not supported yet."); //Preciso começar a fazer a regrinha de negocios
    }
    
}
