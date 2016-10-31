package teste.entidadeTeste;


import entidade.Pessoa;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Denis
 */
public class PessoaTeste {
    
    public PessoaTeste() {
    }
    
    @Test
    public void instanciacaoTest(){
        Pessoa p = new Pessoa("Denis", 998877665);
        Assert.assertEquals(998877665, p.getTelefone());
        Assert.assertEquals("Denis", p.getNome());
    }
    
    @Test
    public void settersTest(){
        Pessoa p = new Pessoa("Denis", 998877665);
        Assert.assertEquals(998877665, p.getTelefone());
        Assert.assertEquals("Denis", p.getNome());
        p.setNome("Wesley");
        p.setTelefone(566778899);
        Assert.assertEquals("Wesley", p.getNome());
        Assert.assertEquals(566778899, p.getTelefone());
    }
}
