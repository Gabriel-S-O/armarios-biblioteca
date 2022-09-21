package br.edu.ifpr.paranavai.armarios.controller;

import br.edu.ifpr.paranavai.armarios.service.LoginService;
import br.edu.ifpr.paranavai.armarios.utils.InfoDTO;

public class LoginController {

    public InfoDTO verificaRa(String ra, String senha) throws Exception {
        LoginService ls = new LoginService();
        return ls.verificaRa(ra, senha);
    }

    public InfoDTO verificaCPF(String cpf, String senha) throws Exception {
        LoginService ls = new LoginService();
        return ls.verificaCPF(cpf, senha);
    }

}
