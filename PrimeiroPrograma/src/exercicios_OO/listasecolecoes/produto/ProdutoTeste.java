package exercicios_OO.listasecolecoes.produto;

import java.util.ArrayList;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Nescau", 9.78, 12);
		
		Produto produto2 = new Produto("Toddy", 6.78, 12);
		
		Produto produto3 = new Produto("Suco de Laranja 1Lt", 3.99, 12);
		
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		listaDeProdutos.add(produto1);
		listaDeProdutos.add(produto2);
		listaDeProdutos.add(produto3);
		
		System.out.println("Tamanho da lista de Produtos: " + listaDeProdutos.size());
		System.out.println("Produto 2 da lista de Produtos: " + listaDeProdutos.get(1).getNome());
		System.out.println(listaDeProdutos);
		
		ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Iogurte 200ml", 2.98, 12, "10/09/2024");
		System.out.println(produtoPerecivel1);
	}

}
