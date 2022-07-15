package br.edu.ifpr.paranavai.armarios.controller;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestLoginController {
        String cpf = "000.000.000-00";
        String ra = "20220012345";
        String senha = "12345";
    
    @Test
    public void testVerifica() {
        Assert.assertEquals(LoginController.verifica(ra, senha), "Sucesso no login!");
    }
    
    @Test
    public void testVerificaCPF() {
        Assert.assertEquals(LoginController.verificaCPF(cpf, senha), "Sucesso no login!");

    }
    
}
