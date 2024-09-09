package exercicios.valorvsreferencia;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por Valor (Tipo primitivo)
		
		a++;
		b--;
		System.out.println(a + " " + b);

		Data d1 = new Data(1, 9, 2024);
		Data d2 = d1; // atribuição por referência (Objeto)
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		d1.setDia(31);
		d2.setMes(12);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	//Referencia
	static void voltarDataParaValorPadrao(Data d) {
		d.setDia(1);
		d.setMes(1);
		d.setAno(1970);
	}
	//Valor
	static void alterarPrimitivo(int a) {
		a++;
	}

}
