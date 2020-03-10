package br.com.portoinvestimento.portoinvestimento.exception;

public class BusinessException extends RuntimeException{

	private static final long serialVersionUID = -3387516993124229948L;
	
	public BusinessException(String mensagem) {
		super(mensagem);
	}
	
	public BusinessException(String mensagem, Throwable throwable) {
		super(mensagem, throwable);
	}
}
