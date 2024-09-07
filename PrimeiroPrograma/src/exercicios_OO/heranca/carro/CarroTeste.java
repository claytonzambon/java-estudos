package exercicios_OO.heranca.carro;

public class CarroTeste {

	public static void main(String[] args) {
		
		ModeloCarro meuCarro = new ModeloCarro();
		
		meuCarro.definirModelo("Sedan");
		meuCarro.definirPrecos(30000, 32000, 35000);
		
		meuCarro.setMontadora("Fiat");
		meuCarro.setTipoCombustivel("Flex");
		meuCarro.setCategoria("Básico");
		meuCarro.exibirInfo();
	}

}
