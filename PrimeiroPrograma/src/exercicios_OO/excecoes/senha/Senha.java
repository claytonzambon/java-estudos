package exercicios_OO.excecoes.senha;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Senha {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		String senha;
		
		senha = JOptionPane.showInputDialog("Digite uma senha: ");
		
		try {
			validarSenha(senha);
			JOptionPane.showMessageDialog(null, "Senha válida. Acesso permitido");
		} catch (SenhaInvalidaException e){
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}
		
		leitura.close();
	}

	private static void validarSenha(String senha) {
		if (senha.length() < 8) {
			throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres");
		}
		
	}

}
