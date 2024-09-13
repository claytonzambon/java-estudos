package exercicios_OO.excecoes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Divisao {

	public static void main(String[] args) {
		
		int numerador, denominador, resultadoDivisao;
		
		JOptionPane.showMessageDialog(null, "## Sistema que divide dois números ###");
		Scanner leitura = new Scanner(System.in);
		
		
		//System.out.print("Informe o numerador: ");
		//numerador = leitura.nextInt();
		numerador = Integer.parseInt(JOptionPane.showInputDialog("Informe o numerador: "));
		//System.out.print("Informe o denominador: ");
		//denominador = leitura.nextInt();
		denominador = Integer.parseInt(JOptionPane.showInputDialog("Informe o denominador: "));
		
		try {
			resultadoDivisao = numerador / denominador;
			JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultadoDivisao);
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Erro: Não é possível dividor por ZERO");
		}
		
		leitura.close();

	}

}
