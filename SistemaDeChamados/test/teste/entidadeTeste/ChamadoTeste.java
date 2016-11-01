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
    
    
    }

