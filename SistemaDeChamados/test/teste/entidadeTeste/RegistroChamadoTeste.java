package teste.entidadeTeste;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Denis
 */
public class RegistroChamadoTeste {

    public RegistroChamadoTeste() {
    }

    @Test
    public void instancicaoRegistroChamadoTeste() {
        Empresa e = new Empresa(0001, "Mackenzie");
        ClienteEmpresa ce = new ClienteEmpresa(1, e, 469512954, "Nomecliente", 995566442);
        Tecnico t = new Tecnico("DenisT", 900112233);
        Chamado c = new Chamado(331, "Problema de Rede", "Internet nao esta funcionando",
                1, t, ce, "Windows", "8", "Banda larga", "192.168.1.1");

        RegistroChamado rc = new RegistroChamado("Problema de Rede", c, t);
        Assert.assertEquals("Problema de Rede", rc.getAssunto());
        Assert.assertEquals(t, rc.getTecnico());
        Assert.assertEquals(c, rc.getChamado());
    }
    
    @Test(expected = Exception.class)
    public void testeCadastroRegistroChamadoChamInvalido() throws Exception {
        Tecnico t = new Tecnico("DenisT", 900112233);
        RegistroChamado rc = new RegistroChamado("Problema de Rede", null, t);
    }
    
    

}
