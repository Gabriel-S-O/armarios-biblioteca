package br.edu.ifpr.paranavai.armarios.controller;

import br.edu.ifpr.paranavai.armarios.exceptions.NullCpfException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullPasswordException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullRaException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullSiapeException;
import br.edu.ifpr.paranavai.armarios.model.Bibliotecario;
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
    Bibliotecario bibliotecario = new Bibliotecario();
    LoginController login = new LoginController();
    
    String cpf = "47586912300";
    String ra = "20190023";
    String siape = "123456";
    String senha = "senha123";
    String senhaBibliotecario = "123";
    
    @Before
    public void setup(){
        estudante.setCpf(cpf);
        estudante.setRa(ra);
        estudante.setSenha(senha);
        
        bibliotecario.setSiape(siape);
        bibliotecario.setSenha(senhaBibliotecario);
    }
        
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    
    @Test
    public void loginTest() throws Exception {
        // cenario
        String retorno = "Sucesso no login!";
        InfoDTO info = login.verificaRa(estudante.getRa(), estudante.getSenha());
        // ação
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }
    
    @Test
    public void loginSenhaInvalidaTest() throws Exception {
        // cenario
        senha = "11111";
        estudante.setSenha(senha);
        String retorno = "Senha inválida!";
        InfoDTO info = login.verificaRa(estudante.getRa(), estudante.getSenha());
        // ação
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }
    
    @Test
    public void loginRaInvalidoTest() throws Exception {
        // cenario
        ra = "11111";
        estudante.setRa(ra);
        String retorno = "RA inválido!";
        InfoDTO info = login.verificaRa(estudante.getRa(), estudante.getSenha());
        // ação
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }
    
    @Test(expected = NullRaException.class)
    public void loginRaNuloTest() throws Exception {
        // ação
        login.verificaRa(null, estudante.getSenha());
    }
    
    @Test(expected = NullPasswordException.class)
    public void loginSenhaNulaTest() throws Exception {
        // ação
        login.verificaRa(estudante.getRa(), null);
    }
    
    
    
    @Test
    public void loginCPFTest() throws Exception {
        // cenário
        InfoDTO info = login.verificaCPF(estudante.getCpf(), estudante.getSenha());
        String retorno = "Sucesso no login!";
        // ação
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }
    
    @Test
    public void loginCPFSenhaInvalidaTest() throws Exception {
        // cenario
        senha = "11111";
        estudante.setSenha(senha);
        String retorno = "Senha inválida!";
        InfoDTO info = login.verificaCPF(estudante.getCpf(), estudante.getSenha());
        // açao
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }
    
    @Test
    public void loginCPFInvalidoTest() throws Exception {
        // cenario
        cpf = "111.111.111-11";
        estudante.setCpf(cpf);
        String retorno = "CPF inválido!";
        InfoDTO info = login.verificaCPF(estudante.getCpf(), estudante.getSenha());
        // ação
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }

    @Test(expected = NullCpfException.class)
    public void loginCPFNuloTest() throws Exception {
        // ação
        login.verificaCPF(null, estudante.getSenha());
    }
    
    @Test(expected = NullPasswordException.class)
    public void loginCPFSenhaNulaTest() throws Exception {
        // ação
        login.verificaCPF(estudante.getSenha(), null);
    }
    
    
     @Test
    public void loginSIAPETest() throws Exception {
        // cenário
        InfoDTO info = login.verificaSIAPE(bibliotecario.getSiape(), bibliotecario.getSenha());
        String retorno = "Sucesso no login!";
        // ação
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }
    
    @Test
    public void loginSIAPESenhaInvalidaTest() throws Exception {
        // cenário
        senha = "11111";
        bibliotecario.setSenha(senha);
        String retorno = "Senha inválida!";
        InfoDTO info = login.verificaSIAPE(bibliotecario.getSiape(), bibliotecario.getSenha());
        // açao
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }
    
    @Test
    public void loginSIAPEInvalidoTest() throws Exception {
        // cenario
        siape = "11111111111";
        bibliotecario.setSiape(siape);
        String retorno = "Siape inválido!";
        InfoDTO info = login.verificaSIAPE(bibliotecario.getSiape(), bibliotecario.getSenha());
        // ação
        collector.checkThat(info.getMessage(), CoreMatchers.is(retorno));
    }

    @Test(expected = NullSiapeException.class)
    public void loginSIAPENuloTest() throws Exception {
        // ação
        login.verificaSIAPE(null, bibliotecario.getSenha());
    }
    
    @Test(expected = NullPasswordException.class)
    public void loginSIAPESenhaNulaTest() throws Exception {
        // ação
        login.verificaCPF(bibliotecario.getSiape(), null);
    }
}
