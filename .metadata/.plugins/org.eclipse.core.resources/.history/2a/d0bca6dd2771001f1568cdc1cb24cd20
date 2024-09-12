package exercicios.helloworld;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloWorld {

    // Método principal para criar e exibir a janela
    public static void main(String[] args) {
        // Executa a criação da janela na thread do Swing (recomendado)
        SwingUtilities.invokeLater(() -> {
            // Cria a janela (JFrame)
            JFrame frame = new JFrame("Hello World Java Window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // Adiciona um label com a mensagem "Hello World"
            JLabel label = new JLabel("Hello World!", JLabel.CENTER);
            frame.add(label);
            
            // Define o tamanho da janela
            frame.setSize(300, 200);
            
            // Torna a janela visível
            frame.setVisible(true);
        });
    }
}

