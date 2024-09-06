package exercicios_OO.interfaces.calculavel;

public class CalculavelTeste {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setNome("Maze Runner");
		livro.setPreco(23.00);
		livro.setAutor("Adam Driver");
		System.out.println("O preço do livro " + livro.getNome() + " é: " + livro.calcularPrecoFinal());
		
		ProdutoFisico produtoFisico = new ProdutoFisico();
		produtoFisico.setNome("Air Frier");
		produtoFisico.setPreco(520.00);
		System.out.println("O preço do produto " + produtoFisico.getNome() + " é: " + produtoFisico.calcularPrecoFinal());

	}

}
