package com.ezandro.produto.apirest.controller.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Erro {
	
	private Integer status;
	private Long timestamp;
	private String message;
	
}
