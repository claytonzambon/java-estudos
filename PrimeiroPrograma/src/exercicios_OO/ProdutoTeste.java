package exercicios_OO;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setNome("Notebook");
		produto.setPreco(5000.00);
		
		System.out.println(produto);
		System.out.printf("Preço com desconto: R$ %.2f", produto.precoComDesconto(25));
	}

}
