package com.ezandro.produto.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ezandro.produto.apirest.entity.Produto;
import com.ezandro.produto.apirest.service.ProdutoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping(value = "/produtos")
	@ApiOperation(value = "Retorna uma lista de produtos")
	public List<Produto> listarProdutos() {
		return produtoService.findAll();
	}
	
	@GetMapping(value = "/produto/{id}")
	@ApiOperation(value = "Retorna um único produto")
	public Produto listarProdutoPorId(@PathVariable Integer id) {
		return produtoService.findById(id);
	}
	
	@PostMapping(value = "/produto")
	@ApiOperation(value = "Salva um produto")
	public Produto salvarProduto(@RequestBody Produto produto) {
		return produtoService.save(produto);
	}
	
	@PutMapping(value = "/produto/{id}")
	@ApiOperation(value = "Atualiza um produto")
	public Produto atualizarProduto(@PathVariable Integer id, @RequestBody Produto produto) {
		return produtoService.update(id, produto);
	}
	
	@DeleteMapping(value = "/produto/{id}")
	@ApiOperation(value = "Deleta um produto")
	public void deletarProduto(@PathVariable Integer id) {
		produtoService.delete(id);
	}

}
