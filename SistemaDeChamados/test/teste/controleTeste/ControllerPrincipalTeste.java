/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.controleTeste;

import controle.ControladorPrincipal;
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
public class ControllerPrincipalTeste {
    
    public ControllerPrincipalTeste() {
    }
    @Test
    public void testeIniciarControladorPrincipal() {
        ControladorPrincipal controlador = new ControladorPrincipal();
        assertNotNull(controlador.getCtrEmpresa());
        assertNotNull(controlador.getCtrChamados());
        assertNotNull(controlador.getCtrClientes());
        assertNotNull(controlador.getCtrTecnicos());
        
    }
    }
