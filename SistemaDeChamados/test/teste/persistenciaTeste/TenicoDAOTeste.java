/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.persistenciaTeste;

import Persistencia.TecnicoDAO;
import entidade.Tecnico;
import java.util.HashMap;
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
public class TenicoDAOTeste {
    
    public TenicoDAOTeste() {
    }
    
    @Test
    public void persistirTecnicoTest() {
        Tecnico nTecnico = new Tecnico("Caleb", 12345678);
        TecnicoDAO tecnicodao = new TecnicoDAO();
        tecnicodao.put(nTecnico);
        Tecnico tecnicoBanco = tecnicodao.get(tecnicodao.gerarCodigo() - 1);
        assertEquals(nTecnico.getTelefone(), tecnicoBanco.getTelefone());
        assertEquals(nTecnico.getNome(), tecnicoBanco.getNome());
    }

    @Test(expected = Exception.class)
    public void persistirTecnicoNullTest() throws Exception {
        Tecnico nTecnico = null;
        TecnicoDAO tecnicodao = new TecnicoDAO();
        tecnicodao.put(nTecnico);
    }

    @Test
    public void gerarCodigoTest() {
        TecnicoDAO tecdao = new TecnicoDAO();
        int codigo = tecdao.gerarCodigo();
        assertTrue(codigo > 0);
    }

    @Test
    public void voltaCashTecnicoTest() {
        Tecnico tecnico = new Tecnico("Caleb", 12345678);
        TecnicoDAO tecnicodao = new TecnicoDAO();
        HashMap<Integer, Tecnico> tecnicos;
        assertTrue(tecnicodao.voltaCashTecnico().size() > 0);
    }
}
