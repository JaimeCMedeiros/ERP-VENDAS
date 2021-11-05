/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.services;

import erp.dao.ClientesDAO;
import erp.exceptions.ExceptionCliente;
import erp.interfaces.service.IClienteService;
import erp.objects.Clientes;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class ClientesService implements IClienteService {
    ClientesDAO cDAO = new ClientesDAO();

    @Override
    public void adicionarCliente(Clientes obj) throws ExceptionCliente {
        try {
            if ("".equals(obj.getNome()) || "".equals(obj.getRg()) || 
                    "".equals(obj.getCpf()) || "".equals(obj.getEndereco()) || 
                    "".equals(obj.getCep()) || "".equals(obj.getCidade()) ||
                    "".equals(obj.getUf()) ||"".equals(obj.getNumero())||
                    "".equals(obj.getBairro())) {
                throw new ExceptionCliente("Não pode salvar faltando informações");
            }
            cDAO.adicionarClientes(obj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    @Override
    public void uptadeCliente(Clientes obj) throws ExceptionCliente {
         try {
            if ("".equals(obj.getNome()) || "".equals(obj.getRg()) || 
                    "".equals(obj.getCpf()) || "".equals(obj.getEndereco()) || 
                    "".equals(obj.getCep()) || "".equals(obj.getCidade()) ||
                    "".equals(obj.getUf()) ||"".equals(obj.getNumero())||
                    "".equals(obj.getBairro())) {
                throw new ExceptionCliente("Não pode alterar faltando informações");
            }
            cDAO.updateClientes(obj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    @Override
    public void deleteCliente(Clientes obj) throws ExceptionCliente {
        try {
            if("".equals(obj.getId())){
                throw new ExceptionCliente("Não pode alterar faltando informações");
            }
            cDAO.deleteCliente(obj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    @Override
    public void listarClientes(Clientes obj) throws ExceptionCliente {
        throw new UnsupportedOperationException("Not supported yet."); //Preciso começar a fazer a regrinha de negocios
    }

    @Override
    public Clientes buscarPorCpf(String cpf) throws ExceptionCliente {
        throw new UnsupportedOperationException("Not supported yet."); //Preciso começar a fazer a regrinha de negocios
    }

    @Override
    public List<Clientes> buscarClientesPorNome(String nome) throws ExceptionCliente {
        throw new UnsupportedOperationException("Not supported yet."); //Preciso começar a fazer a regrinha de negocios
    }
}
