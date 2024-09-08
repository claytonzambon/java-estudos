package exercicios_OO.listasecolecoes.produto;

public class ProdutoPerecivel extends Produto {

	private String dataDeValidade;
	
	public ProdutoPerecivel(String nome, double preco, int quantidade, String dataDeValidade) {
		super(nome, preco, quantidade);
		this.dataDeValidade = dataDeValidade;
	}
	
	public String getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(String dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}	
}
