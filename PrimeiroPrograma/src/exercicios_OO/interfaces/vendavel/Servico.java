package exercicios_OO.interfaces.vendavel;

public class Servico implements Vendavel {
	
	private String descricao;
	private double precoHora;
	
	public Servico(String descricao, double precoHora) {
		this.descricao = descricao;
		this.precoHora = precoHora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}

	@Override
	public double calcularPrecoTotal(int quantidade) {
		return precoHora * quantidade;
	}

	@Override
	public void aplicarDesconto(double precentualDesconto) {
		precoHora -= precoHora * (precentualDesconto / 100.0);
		
	}
}
