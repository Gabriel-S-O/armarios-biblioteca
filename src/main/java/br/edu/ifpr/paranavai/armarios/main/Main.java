package br.edu.ifpr.paranavai.armarios.main;

import br.edu.ifpr.paranavai.armarios.view.EditorIndexUI;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args){
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
