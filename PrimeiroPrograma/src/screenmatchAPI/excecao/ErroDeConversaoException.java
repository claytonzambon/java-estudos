package screenmatchAPI.excecao;

public class ErroDeConversaoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;
	
	public ErroDeConversaoException(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public String getMessage() {
		return this.mensagem;
	}
}
