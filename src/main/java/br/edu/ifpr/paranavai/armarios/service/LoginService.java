package br.edu.ifpr.paranavai.armarios.service;

import br.edu.ifpr.paranavai.armarios.exceptions.NullCpfException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullPasswordException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullRaException;
import br.edu.ifpr.paranavai.armarios.model.Estudante;
import br.edu.ifpr.paranavai.armarios.utils.InfoDTO;
import br.edu.ifpr.paranavai.armarios.view.EditorDevolucaoUI;
import br.edu.ifpr.paranavai.armarios.view.EditorLoginUI;
import br.edu.ifpr.paranavai.armarios.view.EditorReservaUI;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 *
 *
 * @author Aluno
 */
public class LoginService {

    Estudante estudante = new Estudante();

    public InfoDTO verifica(String ra, String senha) throws NullRaException, NullPasswordException, IOException {
        String message = new String();
        InfoDTO info = new InfoDTO();

        if (ra == null) {
            throw new NullRaException();
        }

        if (senha == null) {
            throw new NullPasswordException();
        }

        if (ra.equals(estudante.getRa())) {
            if (senha.equals(estudante.getSenha())) {
                message = "Sucesso no login!";
                info.setMessage(message);
                info.setError(false);
                info.setObject(estudante);
                if (estudante.getEmprestado()) {
                    try {
                        EditorDevolucaoUI telaDevolucao = new EditorDevolucaoUI(info);
                        URL resource = telaDevolucao.getClass().getResource("/icones/icon-window.png");
                        BufferedImage image = ImageIO.read(resource);
                        telaDevolucao.setIconImage(image);
                        telaDevolucao.setTitle("Reserva");
                        telaDevolucao.setVisible(true);
                    } catch (IOException iOException) {
                    }
                    
                } else {
                    try {
                        EditorReservaUI telaReserva = new EditorReservaUI(info);
                        URL resource = telaReserva.getClass().getResource("/icones/icon-window.png");
                        BufferedImage image = ImageIO.read(resource);
                        telaReserva.setIconImage(image);
                        telaReserva.setTitle("Reserva");
                        telaReserva.setVisible(true);
                    } catch (IOException iOException) {
                    }
                }

                return info;
            }
            message = "Senha inválida!";
            info.setError(true);
            info.setMessage(message);
            return info;
        }
        message = "RA inválido!";
        info.setError(true);
        info.setMessage(message);
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

        if (cpf.equals("000.000.000-00")) {
            if (senha.equals("12345")) {
                String message = "Sucesso no login!";
                info.setError(false);
                info.setMessage(message);
                return info;
            }
            String message = "Senha inválida!";
            info.setError(true);
            info.setMessage(message);
            return info;
        }
        String message = "CPF inválido!";
        info.setError(true);
        info.setMessage(message);
        return info;
    }

}
