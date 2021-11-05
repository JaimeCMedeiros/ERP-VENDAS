/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.interfaces.service;

import erp.exceptions.ExceptionCliente;
import erp.objects.Clientes;
import java.util.List;

/**
 *
 * @author home
 */
public interface IClienteService {
        
        public void adicionarCliente (Clientes obj) throws ExceptionCliente;
	public void uptadeCliente (Clientes obj) throws ExceptionCliente;
	public void deleteCliente (Clientes obj) throws ExceptionCliente;
	public void listarClientes (Clientes obj) throws ExceptionCliente;
        public Clientes buscarPorCpf (String cpf) throws ExceptionCliente;
        public List<Clientes> buscarClientesPorNome (String nome) throws ExceptionCliente;
    
}
