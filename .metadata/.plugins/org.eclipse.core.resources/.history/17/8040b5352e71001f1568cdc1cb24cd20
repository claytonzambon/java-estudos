package exercicios.bar;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		String sexo;
		int cervejas, refri, espetos;
		double consumo, couvert, ingresso, total;
		
		//Leitura dos dados
		sexo = JOptionPane.showInputDialog("Sexo: ");
		cervejas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cervejas: "));
		refri = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de refrigerantes: "));
		espetos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de espetinhos: "));
		
		//Calculos
		if (sexo.equals("F")) {
			ingresso = 8.0;
		} else {
			ingresso = 10.0;
		}
		
		consumo = cervejas * 5.0 + refri * 3.0 + espetos * 7.0;
		
		if (consumo > 30) {
			couvert = 0.0;
		} else {
			couvert = 4.0;
		}
		
		total = ingresso + consumo + couvert;
		
		//Relatorio
		String relatorioFinal = String.format("### RELATÓRIO ###"
				+ "\n\nConsumo: R$ %.2f"
				+ "\nCouvert: R$ %.2f"
				+ "\nIngresso: R$ %.2f"
				+ "\n\nValor a pagar: R$ %.2f", 
				consumo, couvert, ingresso, total);

		JOptionPane.showMessageDialog(null, relatorioFinal);
	}

}
