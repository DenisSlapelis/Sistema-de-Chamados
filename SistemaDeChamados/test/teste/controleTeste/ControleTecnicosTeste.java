/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.controleTeste;

import Persistencia.TecnicoDAO;
import controle.ControleTecnicos;
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
public class ControleTecnicosTeste {
    
    public ControleTecnicosTeste() {
    }
    
    @Test
    public void inserirTecnicoTest() {
        ControleTecnicos tecnico = new ControleTecnicos();
        tecnico.inserir(1, "Tecnico Denis");

        Assert.assertNotNull(tecnico);

    }

    @Test
    public void buscarTecnicoTest() {
        ControleTecnicos tecnico = new ControleTecnicos();
        tecnico.inserir(2, "Tecnico Jorge");

        TecnicoDAO tecnicoDAO = new TecnicoDAO();

        Assert.assertNotNull(tecnicoDAO.get(2));

    }
}
