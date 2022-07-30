package br.edu.ifpr.paranavai.armarios.service;

import br.edu.ifpr.paranavai.armarios.exceptions.NullCpfException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullPasswordException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullRaException;
import br.edu.ifpr.paranavai.armarios.model.Estudante;
import br.edu.ifpr.paranavai.armarios.utils.InfoDTO;
import br.edu.ifpr.paranavai.armarios.utils.ListEstudante;
import br.edu.ifpr.paranavai.armarios.view.EditorLoginUI;
import br.edu.ifpr.paranavai.armarios.view.EditorReservaUI;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.imageio.ImageIO;

/**
 *
 *
 *
 * @author Aluno
 */
public class LoginService {

    Estudante estudante = new Estudante();
    List<Estudante> listEstudante = new ListEstudante().getListaEstudantes();

    public InfoDTO verifica(String ra, String senha) throws NullRaException, NullPasswordException, IOException {
        InfoDTO info = new InfoDTO();

        if (ra == null) {
            throw new NullRaException();
        }

        if (senha == null) {
            throw new NullPasswordException();
        }
        

        for (Estudante obj : listEstudante) {

            if (ra.equals(obj.getRa())) {
                estudante.setRa(obj.getRa());
                estudante.setEmail(obj.getEmail());
                estudante.setNome(obj.getNome());
                estudante.setSenha(obj.getSenha());
                estudante.setTelefone(obj.getTelefone());

                if (senha.equals(estudante.getSenha())) {
                    info.setMessage("Sucesso no login!");
                    info.setObject(estudante);

                    return info;
                } else {
                    info.setMessage("Senha inválida!");
                    return info;
                }
            }
        }
        info.setMessage("RA inválido!");
        return info;
    }

    public InfoDTO verificaCPF(String cpf, String senha) throws NullCpfException, NullPasswordException {
        InfoDTO info = new InfoDTO();

        if (cpf == null) {
            throw new NullCpfException();
        }

        if (senha == null) {
            throw new NullPasswordException();
        }

        for (Estudante obj : listEstudante) {

            if (cpf.equals(obj.getCpf())) {
                estudante.setRa(obj.getRa());
                estudante.setEmail(obj.getEmail());
                estudante.setNome(obj.getNome());
                estudante.setSenha(obj.getSenha());
                estudante.setTelefone(obj.getTelefone());

                if (senha.equals(estudante.getSenha())) {
                    info.setMessage("Sucesso no login!");
                    info.setObject(estudante);

                    return info;
                } else {
                    info.setMessage("Senha inválida!");
                    return info;
                }
            }
        }
        info.setMessage("CPF inválido!");
        return info;
    }
}
