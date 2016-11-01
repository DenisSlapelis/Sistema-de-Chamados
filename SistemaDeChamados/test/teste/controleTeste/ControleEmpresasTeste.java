/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.controleTeste;

import controle.ControleEmpresas;
import entidade.Empresa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 *
 * @author PC
 */
public class ControleEmpresasTeste {
    
    public ControleEmpresasTeste() {
    }
    
     @Rule
    public Timeout globalTimeout = new Timeout(200);
    
   @Test
    public void testeInsercao() {
        ControleEmpresas controleEmpresas = new ControleEmpresas();
        Empresa empresa = new Empresa(29, "Samsung");
        controleEmpresas.inserir(empresa.getNumeroContrato(), empresa.getNomeEmpresa());
        Empresa ei = controleEmpresas.retorna(29, "Samsung");
        Assert.assertTrue(ei.getNomeEmpresa().equals(empresa.getNomeEmpresa()));
        Assert.assertTrue(ei.getNumeroContrato() == empresa.getNumeroContrato());
    }

    @Test
    public void TesteInsercaoDupla() {
        ControleEmpresas controleEmpresas = new ControleEmpresas();
        Empresa empresa = controleEmpresas.retorna(1, "Samsung");
        Assert.assertNull(controleEmpresas.inserir(empresa.getNumeroContrato(), empresa.getNomeEmpresa()));

    }

    @Test
    public void testeBuscarEmpresas() {
        Empresa empresa = new Empresa(4321, "Apple");
        ControleEmpresas controleEmpresas = new ControleEmpresas();
        controleEmpresas.inserir(empresa.getNumeroContrato(), empresa.getNomeEmpresa());
        Empresa ei = controleEmpresas.retorna(4321, "Samsung");
        Assert.assertEquals("Apple", ei.getNomeEmpresa());
        Assert.assertEquals(1234, ei.getNumeroContrato());

    }
}

