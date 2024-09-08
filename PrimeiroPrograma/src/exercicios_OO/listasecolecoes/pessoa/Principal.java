package exercicios_OO.listasecolecoes.pessoa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Chaves");
		pessoa1.setIdade(12);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Chiquinha");
		pessoa2.setIdade(12);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Nhonho");
		pessoa3.setIdade(13);
		
		ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
		listaDePessoas.add(pessoa1);
		listaDePessoas.add(pessoa2);
		listaDePessoas.add(pessoa3);
		
		System.out.println("Tamanho da Lista: " + listaDePessoas.size());
		System.out.println("Primeira pessoa da Lista: " + listaDePessoas.get(0).toString());
		System.out.println("Lista completa: " + listaDePessoas);
	}
}
