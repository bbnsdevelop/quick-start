package br.com.quickStart.exception;

public class TopicException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TopicException() {

	}

	public TopicException(String mensage) {
		super(mensage);

	}

}
