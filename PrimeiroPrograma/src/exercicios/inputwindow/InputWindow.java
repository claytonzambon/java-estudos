package exercicios.inputwindow;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class InputWindow {

    public static void main(String[] args) {
        // Cria a janela principal
        JFrame frame = new JFrame("Janela de Input");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        // Cria um painel para organizar os componentes
        JPanel panel = new JPanel();
        frame.add(panel);
        
        PlaceComponents components = new PlaceComponents();
        components.placeComponents(panel);
 

        // Torna a janela visível
        frame.setVisible(true);
    }
}

