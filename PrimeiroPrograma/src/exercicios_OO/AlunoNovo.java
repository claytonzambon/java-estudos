package exercicios_OO;

public class AlunoNovo {

	private String nome;
	private double notas;
	private int qtdNotas;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotas() {
		return notas;
	}
	public void setNotas(double notas) {
		this.notas += notas;
		setQtdNotas(+1);
	}
	
	public int getQtdNotas() {
		return qtdNotas;
	}
	public void setQtdNotas(int qtdNotas) {
		this.qtdNotas += qtdNotas;
	}
	public double calcularMedia() {
		return getNotas() / qtdNotas;
	}
	
	public String toString() {
		return String.format("Nome do aluno: %s \nMedia do aluno: %.2f", getNome(), calcularMedia());
	}
}
