package teste.persistenciaTeste;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Denis
 */
public class ClienteDAOTeste {
    
    public ClienteDAOTeste() {
    }
    
    @Test
    public void gerarCodigoFalseTest(){
        ClienteDAO clientedao = new ClienteDAO();
        assertFalse(clientedao.gerarCodigo()<0);
    }

  @Test
    public void gerarCodigoTrueTest(){
        ClienteDAO clientedao = new ClienteDAO();
        assertTrue(clientedao.gerarCodigo()>0);
    }
    
    @Test
    public void validarCPFComZeroTest(){
	Empresa e = new Empresa(0001, "Mackenzie");
        ClienteEmpresa ce = new ClienteEmpresa(1, e, 0, "NomeCliente", 995566442);
        ClienteDAO clientedao = new ClienteDAO();
        
        assertFalse(clientedao.validarCPF(ce.getCpf()));
    }

    @Test
    public void validarCPFComNegativoTest(){
	Empresa e = new Empresa(0001, "Mackenzie");
        ClienteEmpresa ce = new ClienteEmpresa(1, e, -1, "NomeCliente", 995566442);
        ClienteDAO clientedao = new ClienteDAO();
        
        assertFalse(clientedao.validarCPF(ce.getCpf()));
    }
    
    @Test
    public void voltaCashClienteTest(){
        ClienteDAO clientedao = new ClienteDAO();
        assertNotNull(clientedao.voltaCashCliente());
    }
    
}
