package teste.persistenciaTeste;

import Persistencia.ChamadoDAO;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Denis
 */
public class ChamadoDAOTeste {
    
    public ChamadoDAOTeste() {
    }
    
     @Test
    public void gerarCodigoMenorZeroTest(){
        ChamadoDAO chamadodao = new ChamadoDAO();
        assertFalse(chamadodao.gerarCodigo()<0);
    }
    
    @Test
    public void gerarCodigoMaiorZeroTest(){
        ChamadoDAO chamadodao = new ChamadoDAO();
        assertTrue(chamadodao.gerarCodigo()>0);
    }
    
    @Test
    public void gerarCodigoRegistroChamadoMaiorZeroTest(){
        ChamadoDAO chamadodao = new ChamadoDAO();
        assertTrue(chamadodao.gerarCodigoRegistroChamado()>0);
    }
    
    @Test
    public void gerarCodigoRegistroMenorZeroTest(){
        ChamadoDAO chamadodao = new ChamadoDAO();
        assertFalse(chamadodao.gerarCodigoRegistroChamado()<0);
    }
    
    @Test
    public void getChamadosNotNullTest(){
        ChamadoDAO chamadodao = new ChamadoDAO();
        assertNotNull(chamadodao.getChamados());
    }
    
    @Test
    public void getRegistrosNotNullTest(){
        ChamadoDAO chamadodao = new ChamadoDAO();
        assertNotNull(chamadodao.getRegistros());
    }
    
    @Test
    public void getZeroTest(){
        ChamadoDAO chamadodao = new ChamadoDAO();
        assertNull(chamadodao.get(0));
    }
    
    @Test
    public void getNegativoTest(){
        ChamadoDAO chamadodao = new ChamadoDAO();
        assertNull(chamadodao.get(-1));
    }
}
