package com.ezandro.produto.apirest.controller.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ezandro.produto.apirest.service.exception.ProdutoNaoEncontradoException;

@ControllerAdvice
public class ProdutoControllerExceptionHandler {
	
	@ExceptionHandler(ProdutoNaoEncontradoException.class)
	public ResponseEntity<Erro> error (ProdutoNaoEncontradoException p, HttpServletRequest request) {
		Erro error = new Erro(HttpStatus.NOT_FOUND.value(), System.currentTimeMillis(), p.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
