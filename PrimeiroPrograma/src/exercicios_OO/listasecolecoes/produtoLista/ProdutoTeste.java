package exercicios_OO.listasecolecoes.produtoLista;

import java.util.ArrayList;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Arroz 5kg", 29.45);
		
		Produto produto2 = new Produto("Farinha 5kg", 17.59);
		
		Produto produto3 = new Produto("Café 500g", 18.99);

		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		listaDeProdutos.add(produto1);
		listaDeProdutos.add(produto2);
		listaDeProdutos.add(produto3);
		
		
		
		double total = 0;
		for (Produto item : listaDeProdutos) {
			total += item.getPreco();
			System.out.println(item);
		}
		System.out.println("Preço total: R$ " + total);
		double precoMedio = total / listaDeProdutos.size();
		System.out.println("Preço médio: R$ " + precoMedio);
	}

}