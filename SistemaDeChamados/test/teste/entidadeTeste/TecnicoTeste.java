package teste.entidadeTeste;

import entidade.Tecnico;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Denis
 */
public class TecnicoTeste {
    
    public TecnicoTeste() {
    }
    
    @Test
    public void instanciacaoTest(){
        Tecnico t = new Tecnico("DenisT", 900112233);
        Assert.assertEquals(900112233, t.getTelefone());
        Assert.assertEquals("DenisT", t.getNome());
    }
    
    @Test
    public void settersTest(){
        Tecnico t = new Tecnico("DenisT", 900112233);
        Assert.assertEquals(900112233, t.getTelefone());
        Assert.assertEquals("DenisT", t.getNome());
        t.setNome("WesleyT");
        t.setTelefone(566778899);
        Assert.assertEquals("WesleyT", t.getNome());
        Assert.assertEquals(566778899, t.getTelefone());
    }
    
}
