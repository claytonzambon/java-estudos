package exercicios_OO;

public class Aluno {

	String nome;
	int idade;
	
	public String exibeInformacoes(){
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + nome);
		sb.append("\nIdade: " + idade);
		
		return sb.toString();
	}
}
