package br.edu.ifpr.paranavai.armarios.view;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class TelaInicial {

    public static void chamarTelaInicial(){
        EditorIndexUI telaInicial = new EditorIndexUI();
        try {
            URL resource = telaInicial.getClass().getResource("/icones/icon-window.png");
            BufferedImage image = ImageIO.read(resource);
            telaInicial.setIconImage(image);
        } catch (IOException iOException) {
        }
        telaInicial.setTitle("Inicio");
        telaInicial.setVisible(true);
    }
}
