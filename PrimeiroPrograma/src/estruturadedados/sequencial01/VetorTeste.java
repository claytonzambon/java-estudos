package estruturadedados.sequencial01;

public class VetorTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("José");
		Aluno a3 = new Aluno("Daniel");
		
		Vetor lista = new Vetor();
		
		System.out.println(lista.tamanho());
		lista.adiciona(a1);
		System.out.println(lista.tamanho());
		lista.adiciona(a2);
		System.out.println(lista.tamanho());
		lista.adiciona(1, a3);

		System.out.println(lista);
		
		System.out.println(lista.contem(0));
				
		Aluno x = lista.pega(1);
		System.out.println(x);
		
		lista.remove(1);
		System.out.println(lista);
		
		for (int i = 0; i < 40; i++) {
			Aluno y = new Aluno("Teste" + i);
			lista.adiciona(y);
		}
		System.out.println(lista);
	}

}
