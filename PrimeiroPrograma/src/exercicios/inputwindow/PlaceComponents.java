package exercicios.inputwindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlaceComponents {

    public void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Rótulo para o campo de texto
        JLabel userLabel = new JLabel("Digite algo:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        // Campo de texto onde o usuário pode digitar
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // Botão para enviar a informação
        JButton sendButton = new JButton("Enviar");
        sendButton.setBounds(10, 80, 80, 25);
        panel.add(sendButton);

        // Adiciona a ação ao botão
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtém o texto digitado pelo usuário
                String userInput = userText.getText();
                
                // Exibe o texto em uma caixa de diálogo
                JOptionPane.showMessageDialog(null, "Você digitou: " + userInput);
            }
        });
    }
}
