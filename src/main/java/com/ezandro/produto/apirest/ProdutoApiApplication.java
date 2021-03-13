package com.ezandro.produto.apirest;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ezandro.produto.apirest.entity.Produto;
import com.ezandro.produto.apirest.repository.ProdutoRepository;

@SpringBootApplication
public class ProdutoApiApplication implements CommandLineRunner {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProdutoApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String nome1 = "Samsung Galaxy S20"; 
		BigDecimal quantidade1 = new BigDecimal(5);
		BigDecimal valor1 = new BigDecimal(5000);
		
		String nome2 = "Televisão LG"; 
		BigDecimal quantidade2 = new BigDecimal(2);
		BigDecimal valor2 = new BigDecimal(2500);
		
		String nome3 = "Notebook Dell Inspiron"; 
		BigDecimal quantidade3 = new BigDecimal(4);
		BigDecimal valor3 = new BigDecimal(3850);
		
		Produto p1 = new Produto(null, nome1, quantidade1, valor1);
		Produto p2 = new Produto(null, nome2, quantidade2, valor2);
		Produto p3 = new Produto(null, nome3, quantidade3, valor3);
		
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
	}

}
