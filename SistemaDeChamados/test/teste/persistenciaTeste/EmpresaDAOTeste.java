/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.persistenciaTeste;

import Persistencia.EmpresaDAO;
import entidade.Empresa;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class EmpresaDAOTeste {
    
    public EmpresaDAOTeste() {
    }
    @Test
    public void inserirEmpresaTest() {
        Empresa nEmpresa = new Empresa(321, "Mackenzie");
        EmpresaDAO empresadao = new EmpresaDAO();
        empresadao.put(nEmpresa);

        Collection<Empresa> empresas = empresadao.getEmpresas();
        Empresa inserida = null;
        for (Empresa empresa : empresas) {
            if ((nEmpresa.getNomeEmpresa().equals(empresa.getNomeEmpresa())) && (nEmpresa.getNumeroContrato() == empresa.getNumeroContrato())) {
                assertEquals(empresa, nEmpresa);
            }
        }
    }

    @Test(expected = Exception.class)
    public void inserirEmpresaNullTest() throws Exception {
        Empresa nEmpresa = null;
        EmpresaDAO empresadao = new EmpresaDAO();
        empresadao.put(nEmpresa);
    }

    @Test
    public void voltaEmpresaTest() {
        EmpresaDAO empresadao = new EmpresaDAO();
        assertTrue(empresadao.voltaEmpresa().size() > 0);
    }
}
