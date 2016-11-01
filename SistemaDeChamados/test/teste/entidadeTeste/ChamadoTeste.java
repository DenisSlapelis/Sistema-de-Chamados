/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.entidadeTeste;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Pessoa;
import entidade.Tecnico;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Denis
 */
public class ChamadoTeste {
    
    public ChamadoTeste() {
    }
    
    @Test
    public void InstanciacaoProblemaDeRedeTest() {
        Empresa e = new Empresa(0001, "Mackenzie");
        Pessoa p = new Pessoa("Denis", 998877665);
        Tecnico t = new Tecnico("DenisT", 900112233);
        ClienteEmpresa ce = new ClienteEmpresa(1, e, 469512954, p.getNome(), p.getTelefone());
        Chamado c = new Chamado(331, "Problema de Rede", "Internet nao esta funcionando",
                1, t, ce, "Windows", "8", "Banda larga", "192.168.1.1");
        
        Assert.assertEquals(331, c.getCodigo());
        Assert.assertEquals("Problema de Rede", c.getTitulo());
        Assert.assertEquals("Internet nao esta funcionando", c.getDescricao());
        Assert.assertEquals(1, c.getPrioridade());
        Assert.assertEquals(t, c.getTecnico());
        Assert.assertEquals(ce, c.getCliente());
        Assert.assertEquals("Windows", c.getSistemaOperacional());
        Assert.assertEquals("8", c.getVersaoSO());
        Assert.assertNotNull(c.getData());
        Assert.assertNotNull(c.getHora());
        Assert.assertEquals("Banda larga", c.getTipoConexao());
        Assert.assertEquals("192.168.1.1",c.getEnderecoRede());
        Assert.assertEquals("Iniciado", c.getStatus());
        Assert.assertEquals("Problema de Rede", c.getTipoProblema());
    }
    
    @Test
    public void cadastrarChamadoProblemaBancoDeDados() {
        Tecnico tecnico = new Tecnico("Diego", 567);
        Empresa empresa = new Empresa(123, "Samsung");
        ClienteEmpresa clienteEmpresa = new ClienteEmpresa(1, empresa, 2197534L, "Denis", 123);
        Chamado chamadoBancoDados = new Chamado("Título", "Descrição", 3, tecnico, clienteEmpresa, "linux", "minix", "Oracle");
	Assert.assertEquals("Título", chamadoBancoDados.getTitulo());
        Assert.assertEquals("Descrição", chamadoBancoDados.getDescricao());
        Assert.assertEquals(3, chamadoBancoDados.getPrioridade());
        Assert.assertEquals(tecnico, chamadoBancoDados.getTecnico());
        Assert.assertEquals(clienteEmpresa, chamadoBancoDados.getCliente());
        Assert.assertEquals("linux", chamadoBancoDados.getSistemaOperacional());
        Assert.assertEquals("minix", chamadoBancoDados.getVersaoSO());
        Assert.assertEquals("Oracle", chamadoBancoDados.getBancoDeDados());
        Assert.assertNotNull(chamadoBancoDados.getData());
        Assert.assertNotNull(chamadoBancoDados.getHora());
        Assert.assertEquals("iniciado", chamadoBancoDados.getStatus());
        Assert.assertEquals("Banco de Dados", chamadoBancoDados.getTipoProblema());
    }
    
    
    }

