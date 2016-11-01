/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.controleTeste;

import Persistencia.ClienteDAO;
import controle.ControleClientes;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ControleClientesTeste {
    
    public ControleClientesTeste() {
    }
    
    @Test
    public void testeIncluirNovoCliente() {
        ControleClientes controller = new ControleClientes();
        Empresa empresa = new Empresa(321, "Empresa");
        ClienteEmpresa clienteEmpresa = controller.incluiNovoCliente(empresa, 654321, "Diego", 87654321);
        ClienteDAO clientedao = controller.getClienteDAO();
        ClienteEmpresa cliente = clientedao.get(Long.parseLong("654321"));
        assertEquals(cliente.getCpf(), clienteEmpresa.getCpf());
        assertEquals(cliente.getNome(), clienteEmpresa.getNome());
        assertEquals(cliente.getEmpresa(), clienteEmpresa.getEmpresa());
        assertEquals(cliente.getTelefone(), clienteEmpresa.getTelefone());
        assertEquals(cliente.getCodigo(), clienteEmpresa.getCodigo());
    }

    @Test
    public void testeAtualizarCliente() {
        ControleClientes controller = new ControleClientes();
        Empresa empresa = new Empresa(321, "Empresa");
        Empresa empresa2 = new Empresa(321, "Empresa2");
        ClienteEmpresa clienteEmpresa = controller.incluiNovoCliente(empresa, 654312, "Diego", 87654321);
        ClienteEmpresa clienteEmpresa2 = controller.incluiNovoCliente(empresa2, 654321, "Diego", 87654321);
        ClienteEmpresa cliente = controller.getClienteDAO().voltaCashCliente().get(clienteEmpresa2.getCpf());
        assertEquals(clienteEmpresa2.toString(), cliente.toString());
    }

    @Test
    public void testeRemoverCliente() {
        ControleClientes controller = new ControleClientes();
        Empresa empresa = new Empresa(321, "Empresa");
        ClienteEmpresa clienteEmpresa = controller.incluiNovoCliente(empresa, 654321, "Diego", 87654321);
        controller.getClienteDAO().voltaCashCliente().remove(clienteEmpresa.getCpf());
        Assert.assertNull(controller.getClienteDAO().voltaCashCliente().get(clienteEmpresa.getCpf()));
    }

    @Test
    public void testeBuscarCliente() {
        ControleClientes controller = new ControleClientes();
        Empresa empresa = new Empresa(321, "Empresa");
        ClienteEmpresa clienteEmpresa = controller.incluiNovoCliente(empresa, 654321, "Diego", 87654321);
        ClienteEmpresa clienteEmpresa2 = controller.incluiNovoCliente(empresa, 654321, "Diego", 87654321);
        ClienteDAO clientedao = controller.getClienteDAO();

        HashMap<Long, ClienteEmpresa> clientes = clientedao.voltaCashCliente();
        ClienteEmpresa cliente = clientes.get(clienteEmpresa.getCpf());
        ClienteEmpresa cliente2 = clientes.get(clienteEmpresa2.getCpf());
        assertEquals(clienteEmpresa.toString(), cliente.toString());
        assertEquals(clienteEmpresa2.toString(), cliente2.toString());
    }
}
