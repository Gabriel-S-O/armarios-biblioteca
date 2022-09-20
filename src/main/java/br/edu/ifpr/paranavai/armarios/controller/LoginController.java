package br.edu.ifpr.paranavai.armarios.controller;

import br.edu.ifpr.paranavai.armarios.service.LoginService;
import br.edu.ifpr.paranavai.armarios.utils.InfoDTO;

public class LoginController {

    LoginService loginService = new LoginService();

    public InfoDTO verificaLoginComRA(String ra, String senha) throws Exception {
        return loginService.verificaRa(ra, senha);
    }

    public InfoDTO verificaLoginComCPF(String cpf, String senha) throws Exception {
        return loginService.verificaCPF(cpf, senha);
    }

}
