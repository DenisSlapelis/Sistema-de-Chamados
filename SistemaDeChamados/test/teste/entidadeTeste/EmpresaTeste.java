package teste.entidadeTeste;

import entidade.Empresa;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Denis
 */
public class EmpresaTeste {
    
    public EmpresaTeste() {
    }
    
    @Test
    public void instanciacaoTest(){
        Empresa e = new Empresa(0001, "Mackenzie");
        Assert.assertEquals(0001, e.getNumeroContrato());
        Assert.assertEquals("Mackenzie", e.getNomeEmpresa());
    }
    
    @Test
    public void settersTest(){
        Empresa e = new Empresa(0001, "Mackenzie");
        Assert.assertEquals(0001, e.getNumeroContrato());
        Assert.assertEquals("Mackenzie", e.getNomeEmpresa());
        e.setNumeroContrato(0002);
        e.setNomeEmpresa("NovoNomeEmpresa");
        Assert.assertEquals(0002, e.getNumeroContrato());
        Assert.assertEquals("NovoNomeEmpresa", e.getNomeEmpresa());
    }
    
   
}
