package exercicios_OO;

public class IdadePessoaTeste {

	public static void main(String[] args) {
		
		IdadePessoa idadePessoa = new IdadePessoa();
		idadePessoa.setNome("Chaves");
		idadePessoa.setIdade(10);
		
		System.out.println(idadePessoa.verificaSeMaiorDeIdade());

	}

}
