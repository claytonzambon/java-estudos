package exercicios_OO;

public class LivroTeste {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.setTitulo("Procrastinação - Guia científico sobre como parar de procrastinar");
		livro.setAutor("Lílian Soares");
		
		System.out.println(livro.exibirDetalhes());

	}

}
