package br.edu.ifpr.paranavai.armarios.controller;

import br.edu.ifpr.paranavai.armarios.exceptions.NullCpfException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullPasswordException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullRaException;
import br.edu.ifpr.paranavai.armarios.model.Estudante;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;


public class TestLoginController {
    
    String cpf;
    String ra;
    String senha;
    
    @Before
    public void setup(){
        cpf = "000.000.000-00";
        ra = "20220012345";
        senha = "12345";
    }
        
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    
    @Test
    public void testLogin() throws Exception {
        // ação
        collector.checkThat(LoginController.verifica(ra, senha), CoreMatchers.is("Sucesso no login!"));
    }
    
    @Test
    public void testLoginSenhaInvalida() throws Exception {
        // cenario
        senha = "11111";
        // ação
        collector.checkThat(LoginController.verifica(ra, senha), CoreMatchers.is("Senha inválida!"));
    }
    
    @Test
    public void testLoginRaInvalido() throws Exception {
        // cenario
        ra = "11111";
        // ação
        collector.checkThat(LoginController.verifica(ra, senha), CoreMatchers.is("RA inválido!"));
    }
    
    @Test(expected = NullRaException.class)
    public void testLoginRaNulo() throws Exception {
        // ação
        LoginController.verifica(null, senha);
    }
    
    @Test(expected = NullPasswordException.class)
    public void testLoginSenhaNula() throws Exception {
        // ação
        LoginController.verifica(ra, null);
    }
    
    
    
    @Test
    public void testLoginCPF() throws Exception {
        // ação
        collector.checkThat(LoginController.verificaCPF(cpf, senha), CoreMatchers.is("Sucesso no login!"));
    }
    
    @Test
    public void testLoginCPFSenhaInvalida() throws Exception {
        // cenario
        senha = "11111";
        // açao
        collector.checkThat(LoginController.verificaCPF(cpf, senha), CoreMatchers.is("Senha inválida!"));
    }
    
    @Test
    public void testLoginCPFInvalido() throws Exception {
        // cenario
        cpf = "111.111.111-11";
        // ação
        collector.checkThat(LoginController.verificaCPF(cpf, senha), CoreMatchers.is("CPF inválido!"));
    }

    @Test(expected = NullCpfException.class)
    public void testLoginCPFNulo() throws Exception {
        // ação
        LoginController.verificaCPF(null, senha);
    }
    
    @Test(expected = NullPasswordException.class)
    public void testLoginCPFSenhaNula() throws Exception {
        // ação
        LoginController.verificaCPF(cpf, null);
    }
}
