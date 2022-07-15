package br.edu.ifpr.paranavai.armarios.controller;

import br.edu.ifpr.paranavai.armarios.service.LoginService;


public class LoginController {

    public static String verifica(String ra, String senha) {
        return LoginService.verifica(ra,senha);
    }

   public static String verificaCPF(String cpf, String senha) {
        return LoginService.verifica(cpf, senha);
    } 
    
}
