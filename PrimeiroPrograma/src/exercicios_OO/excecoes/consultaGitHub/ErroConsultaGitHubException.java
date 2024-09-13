package exercicios_OO.excecoes.consultaGitHub;

public class ErroConsultaGitHubException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ErroConsultaGitHubException(String mensagem) {
		super(mensagem);
	}
}
