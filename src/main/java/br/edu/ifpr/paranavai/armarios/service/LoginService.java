package br.edu.ifpr.paranavai.armarios.service;

import br.edu.ifpr.paranavai.armarios.dao.BibliotecarioDao;
import br.edu.ifpr.paranavai.armarios.dao.EstudanteDao;
import br.edu.ifpr.paranavai.armarios.entity.Bibliotecario;
import br.edu.ifpr.paranavai.armarios.exceptions.NullCpfException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullPasswordException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullRaException;
import br.edu.ifpr.paranavai.armarios.entity.Estudante;
import br.edu.ifpr.paranavai.armarios.exceptions.NullSiapeException;
import br.edu.ifpr.paranavai.armarios.utils.InfoDTO;
import java.io.IOException;

public class LoginService {

    Estudante estudante = new Estudante();
    Bibliotecario bibliotecario = new Bibliotecario();
    
    InfoDTO info = new InfoDTO();

    public InfoDTO verificaRa(String ra, String senha) throws NullRaException, NullPasswordException, IOException {

        if (ra == null) {
            throw new NullRaException();
        }

        if (senha == null) {
            throw new NullPasswordException();
        }

        estudante = new EstudanteDao().findByRa(ra);

        if (estudante != null) {
            if (estudante.getSenha().equals(senha)) {
                info.setError(false);
                info.setMessage("Sucesso no login!");
                info.setObject(estudante);
                return info;
            } else {
                info.setError(true);
                info.setMessage("Senha inválida!");
                return info;
            }
        } else {
            info.setError(true);
            info.setMessage("RA inválido!");
            return info;
        }
    }

    public InfoDTO verificaCPF(String cpf, String senha) throws NullCpfException, NullPasswordException {

        if (cpf == null) {
            throw new NullCpfException();
        }

        if (senha == null) {
            throw new NullPasswordException();
        }

        estudante = new EstudanteDao().findByCpf(cpf);

        if (estudante != null) {
            if (estudante.getSenha().equals(senha)) {
                info.setError(false);
                info.setMessage("Sucesso no login!");
                info.setObject(estudante);
                return info;
            } else {
                info.setError(true);
                info.setMessage("Senha inválida!");
                return info;
            }
        } else {
            info.setError(true);
            info.setMessage("CPF inválido!");
            return info;
        }
    }

    public InfoDTO verificaSiape(String siape, String senha) throws NullSiapeException, NullPasswordException {
        
        if(siape == null){
            throw new NullSiapeException();
        }
        
        if(senha == null){
            throw new NullPasswordException();
        }
        
        bibliotecario = new BibliotecarioDao().findBySiape(siape);
        
        if (bibliotecario != null) {
            if (bibliotecario.getSenha().equals(senha)) {
                info.setError(false);
                info.setMessage("Sucesso no login!");
                info.setObject(bibliotecario);
            } else {
                info.setError(true);
                info.setMessage("Senha Inválida!");
                return info;
            }
        } else {
            info.setError(true);
            info.setMessage("Siape inválido!");
            return info;
        }
    }
    
}
