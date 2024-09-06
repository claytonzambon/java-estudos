package exercicios_OO.interfaces.vendavel;

public class VendavelTeste {

	public static void main(String[] args) {
		Produto produto = new Produto("Lava e Seca", 3100.50);
		System.out.println(produto.calcularPrecoTotal(2));
		produto.aplicarDesconto(20);
		System.out.println(produto.calcularPrecoTotal(2));

		Servico servico = new Servico("Consultoria em TI", 200.00);
		System.out.println(servico.calcularPrecoTotal(4));
		servico.aplicarDesconto(10);
		System.out.println(servico.calcularPrecoTotal(2));
	}

}
