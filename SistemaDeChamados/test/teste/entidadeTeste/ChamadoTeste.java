/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.entidadeTeste;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Pessoa;
import entidade.Tecnico;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Denis
 */
public class ChamadoTeste {
    
    public ChamadoTeste() {
    }
    
    @Test
    public void InstanciacaoTest() {
        Empresa e = new Empresa(0001, "Mackenzie");
        Pessoa p = new Pessoa("Denis", 998877665);
        Tecnico t = new Tecnico("DenisT", 900112233);
        ClienteEmpresa ce = new ClienteEmpresa(1, e, 469512954, p.getNome(), p.getTelefone());
        Chamado c = new Chamado(331, "Problema de Rede", "Internet nao esta funcionando",
                1, t, ce, "Windows", "8", "Banda larga", "192.168.1.1");
        
        Assert.assertEquals(331, c.getCodigo());
    }
    
}
