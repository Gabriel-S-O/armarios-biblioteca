package br.edu.ifpr.paranavai.armarios.controller;

import br.edu.ifpr.paranavai.armarios.service.LoginService;
import br.edu.ifpr.paranavai.armarios.utils.InfoDTO;

public class LoginController {

    LoginService service = new LoginService();

    public InfoDTO verificaLoginComRA(String ra, String senha) throws Exception {
        return service.verificarLoginComRA(ra, senha);
    }

    public InfoDTO verificaLoginComCPF(String cpf, String senha) throws Exception {
        return service.verificarLoginComCPF(cpf, senha);
    }

}
