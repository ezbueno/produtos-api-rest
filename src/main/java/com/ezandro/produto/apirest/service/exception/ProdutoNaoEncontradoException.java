package com.ezandro.produto.apirest.service.exception;

@SuppressWarnings("serial")
public class ProdutoNaoEncontradoException extends RuntimeException {

	public ProdutoNaoEncontradoException(String message) {
		super(message);
	}

	public ProdutoNaoEncontradoException(String message, Throwable cause) {
		super(message, cause);
	}

}
