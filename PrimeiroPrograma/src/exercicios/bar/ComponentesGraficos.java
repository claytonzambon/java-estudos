package exercicios.bar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComponentesGraficos {
	
    public void placeComponents(JPanel panel) {
    	
        panel.setLayout(null);

        // Campo para o char
        JLabel charLabel = new JLabel("Informe o Sexo:");
        charLabel.setBounds(10, 20, 150, 25);
        panel.add(charLabel);

        JTextField charText = new JTextField(1);  // Limita a 1 caractere
        charText.setBounds(160, 20, 50, 25);
        panel.add(charText);

        // Campo para o primeiro int
        JLabel intLabel1 = new JLabel("Quantidade de Cervejas:");
        intLabel1.setBounds(10, 60, 150, 25);
        panel.add(intLabel1);

        JTextField intText1 = new JTextField(10);
        intText1.setBounds(160, 60, 50, 25);
        panel.add(intText1);

        // Campo para o segundo int
        JLabel intLabel2 = new JLabel("Quantidade de Refrigerantes:");
        intLabel2.setBounds(10, 100, 150, 25);
        panel.add(intLabel2);

        JTextField intText2 = new JTextField(10);
        intText2.setBounds(160, 100, 50, 25);
        panel.add(intText2);

        // Campo para o terceiro int
        JLabel intLabel3 = new JLabel("Quantidade de Espetinhos:");
        intLabel3.setBounds(10, 140, 150, 25);
        panel.add(intLabel3);

        JTextField intText3 = new JTextField(10);
        intText3.setBounds(160, 140, 50, 25);
        panel.add(intText3);

        // Botão para enviar as informações
        JButton sendButton = new JButton("Enviar");
        sendButton.setBounds(10, 180, 80, 25);
        panel.add(sendButton);

        // Adiciona ação ao botão
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtém o valor do campo de char
                    String charInput = charText.getText();
                    if (charInput.length() != 1) {
                        throw new IllegalArgumentException("No campo sexo, digite apenas um caractere (F ou M).");
                    }
                    char sexo = charInput.charAt(0);
                    
                    // Obtém os valores dos campos int
                    int cerveja = Integer.parseInt(intText1.getText());
                    int refrigerante = Integer.parseInt(intText2.getText());
                    int espeto = Integer.parseInt(intText3.getText());
                    
                    CalculosBar calculos = new CalculosBar(sexo, cerveja, refrigerante, espeto);
                    
            		//Relatorio
            		String relatorioFinal = String.format(
            					"### RELATÓRIO ###"
            					+ "\n\nConsumo: R$ %.2f"
            					+ "\nCouvert: R$ %.2f"
            					+ "\nIngresso: R$ %.2f"
            					+ "\n\nValor a pagar: R$ %.2f", 
            					calculos.getConsumo(), calculos.getCouvert(), 
            					calculos.getIngresso(), calculos.getTotalIngresso()
            				);

                    // Exibe uma caixa de diálogo com os valores inseridos
            		JOptionPane.showMessageDialog(null, relatorioFinal);
            		
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira números inteiros válidos.");
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
}
