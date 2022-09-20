package br.edu.ifpr.paranavai.armarios.service;

import br.edu.ifpr.paranavai.armarios.dao.EstudanteDao;
import br.edu.ifpr.paranavai.armarios.entity.Estudante;
import br.edu.ifpr.paranavai.armarios.exceptions.NullCpfException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullPasswordException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullRaException;
import br.edu.ifpr.paranavai.armarios.utils.InfoDTO;

/**
 *
 *
 *
 * @author Aluno
 */
public class LoginService {

    Estudante estudante = new Estudante();

    InfoDTO info = new InfoDTO();

    public InfoDTO verificarLoginComRA(String ra, String senha) throws NullRaException, NullPasswordException {

        if (ra == null) throw new NullRaException();

        if (senha == null) throw new NullPasswordException();

        info = verificarEstudanteComRA(ra, senha);

        return info;
    }

    public InfoDTO verificarLoginComCPF(String cpf, String senha) throws NullCpfException, NullPasswordException {

        if (cpf == null) throw new NullCpfException();

        if (senha == null) throw new NullPasswordException();

        info = verificarEstudanteComCPF(cpf, senha);

        return info;
    }

    public InfoDTO verificarEstudanteComRA(String ra, String senha){

        estudante = new EstudanteDao().findByRa(ra);

        if (estudante != null) {
            if (estudante.getSenha().equals(senha)) {
                info.setMessage("Sucesso no login!");
                info.setObject(estudante);
            } else {
                info.setMessage("Senha inválida!");
            }
        } else {
            info.setMessage("RA inválido!");
        }
        return info;
    }

    public InfoDTO verificarEstudanteComCPF(String cpf, String senha){

        estudante = new EstudanteDao().findByCpf(cpf);

        if (estudante != null) {
            if (estudante.getSenha().equals(senha)) {
                info.setMessage("Sucesso no login!");
                info.setObject(estudante);
            } else {
                info.setMessage("Senha inválida!");
            }
        } else {
            info.setMessage("CPF inválido!");
        }
        return info;
    }
}
