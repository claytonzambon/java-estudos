package exercicios_OO.metodos.aluno;

import javax.swing.JOptionPane;

public class AlunoTeste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.nome = "Seu Madruga";
		aluno.idade = 30;
		
		//System.out.println(aluno.exibeInformacoes());
		
		JOptionPane.showMessageDialog(null, aluno.exibeInformacoes());
	}

}
