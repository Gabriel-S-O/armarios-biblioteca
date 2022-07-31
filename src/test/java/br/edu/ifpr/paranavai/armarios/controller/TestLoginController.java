package br.edu.ifpr.paranavai.armarios.controller;

import br.edu.ifpr.paranavai.armarios.exceptions.NullCpfException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullPasswordException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullRaException;
import br.edu.ifpr.paranavai.armarios.model.Estudante;
import br.edu.ifpr.paranavai.armarios.utils.InfoDTO;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;


public class TestLoginController {
    
    Estudante estudante = new Estudante();
    LoginController login = new LoginController();
    
    String cpf = "000.000.000-00";
    String ra = "1234567890";
    String senha = "senha";
    
    @Before
    public void setup(){
        estudante.setCpf(cpf);
        estudante.setRa(ra);
        estudante.setSenha(senha);
    }
        
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    
    @Test
    public void testLogin() throws Exception {
        // cenario
        String retorno = "Sucesso no login!";
        InfoDTO info = login.verifica(estudante.getRa(), estudante.getSenha());
        // ação
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }
    
    @Test
    public void testLoginSenhaInvalida() throws Exception {
        // cenario
        senha = "11111";
        estudante.setSenha(senha);
        String retorno = "Senha inválida!";
        InfoDTO info = login.verifica(estudante.getRa(), estudante.getSenha());
        // ação
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }
    
    @Test
    public void testLoginRaInvalido() throws Exception {
        // cenario
        ra = "11111";
        estudante.setRa(ra);
        String retorno = "RA inválido!";
        InfoDTO info = login.verifica(estudante.getRa(), estudante.getSenha());
        // ação
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }
    
    @Test(expected = NullRaException.class)
    public void testLoginRaNulo() throws Exception {
        // ação
        login.verifica(null, estudante.getSenha());
    }
    
    @Test(expected = NullPasswordException.class)
    public void testLoginSenhaNula() throws Exception {
        // ação
        login.verifica(estudante.getRa(), null);
    }
    
    
    
    @Test
    public void testLoginCPF() throws Exception {
        // cenário
        InfoDTO info = login.verificaCPF(estudante.getCpf(), estudante.getSenha());
        String retorno = "Sucesso no login!";
        // ação
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }
    
    @Test
    public void testLoginCPFSenhaInvalida() throws Exception {
        // cenario
        senha = "11111";
        estudante.setSenha(senha);
        String retorno = "Senha inválida!";
        InfoDTO info = login.verificaCPF(estudante.getCpf(), estudante.getSenha());
        // açao
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }
    
    @Test
    public void testLoginCPFInvalido() throws Exception {
        // cenario
        cpf = "111.111.111-11";
        estudante.setCpf(cpf);
        String retorno = "CPF inválido!";
        InfoDTO info = login.verificaCPF(estudante.getCpf(), estudante.getSenha());
        // ação
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }

    @Test(expected = NullCpfException.class)
    public void testLoginCPFNulo() throws Exception {
        // ação
        login.verificaCPF(null, estudante.getSenha());
    }
    
    @Test(expected = NullPasswordException.class)
    public void testLoginCPFSenhaNula() throws Exception {
        // ação
        login.verificaCPF(estudante.getSenha(), null);
    }
}
