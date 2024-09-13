package exercicios_OO.excecoes.senha;

public class SenhaInvalidaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SenhaInvalidaException(String mensagem) {
		super(mensagem);
	}
}
