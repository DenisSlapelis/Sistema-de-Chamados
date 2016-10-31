package teste.entidadeTeste;

import entidade.ClienteEmpresa;
import entidade.Empresa;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Denis
 */
public class ClienteEmpresaTeste {
    
    public ClienteEmpresaTeste() {
    }
    
    @Test
    public void instanciacaoTest(){
         Empresa e = new Empresa(0001, "Mackenzie");
         ClienteEmpresa ce = new ClienteEmpresa(1, e, 469512954, "Nome", 995566442);
         //Construtor não estava aceitando a quantidade correta de números que um cpf possui
         //foi necessário reduzir
         Assert.assertEquals("Mackenzie", ce.getEmpresa().getNomeEmpresa());
         Assert.assertEquals(0001, ce.getEmpresa().getNumeroContrato());
         Assert.assertEquals(e, ce.getEmpresa());
         Assert.assertEquals(469512954, ce.getCpf());
         Assert.assertEquals("Nome", ce.getNome());
         Assert.assertEquals(995566442, ce.getTelefone());
    }
    
    @Test
    public void settersTest(){
        Empresa e = new Empresa(0001, "Mackenzie");
        ClienteEmpresa ce = new ClienteEmpresa(1, e, 469512954, "Nome", 995566442);
        
        Assert.assertEquals("Mackenzie", ce.getEmpresa().getNomeEmpresa());
        Assert.assertEquals(0001, ce.getEmpresa().getNumeroContrato());
        Assert.assertEquals(e, ce.getEmpresa());
        Assert.assertEquals(469512954, ce.getCpf());
        Assert.assertEquals("Nome", ce.getNome());
        Assert.assertEquals(995566442, ce.getTelefone());
        
        ce.setCpf(455821339);
        ce.setNome("NovoNome");
        ce.setTelefone(983322445);
        
        Assert.assertEquals(455821339, ce.getCpf());
        Assert.assertEquals("NovoNome", ce.getNome());
        Assert.assertEquals(983322445, ce.getTelefone());   
    }
    
}
