package br.edu.ifpr.paranavai.armarios.controller;

import br.edu.ifpr.paranavai.armarios.service.LoginService;
import br.edu.ifpr.paranavai.armarios.utils.InfoDTO;

public class LoginController {

    LoginService service = new LoginService();
    
    public InfoDTO verificaRa(String ra, String senha) throws Exception {
        return service.verificaRa(ra, senha);
    }

    public InfoDTO verificaCPF(String cpf, String senha) throws Exception {
        return service.verificaCPF(cpf, senha);
    }
    
    public InfoDTO verificaSIAPE(String siape, String senha) throws Exception {
        LoginService ls = new LoginService();
        return service.verificaSiape(siape, senha);
    }

}
