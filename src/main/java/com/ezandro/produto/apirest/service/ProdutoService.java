package com.ezandro.produto.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezandro.produto.apirest.entity.Produto;
import com.ezandro.produto.apirest.repository.ProdutoRepository;
import com.ezandro.produto.apirest.service.exception.ProdutoNaoEncontradoException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

	public Produto findById(Integer id) {
		return produtoRepository.findById(id).orElseThrow(() -> new ProdutoNaoEncontradoException(
				"Id: " + id + ", não existe na base de dados. A solicitação não pôde ser atendida!"));
	}

	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}

	public Produto update(Integer id, Produto produto) {
		Produto updateProduto = findById(id);
		updateProduto.setNome(produto.getNome());
		updateProduto.setQuantidade(produto.getQuantidade());
		updateProduto.setValor(produto.getValor());
		return produtoRepository.save(updateProduto);
	}

	public void delete(Integer id) {
		findById(id);
		produtoRepository.deleteById(id);
	}

}
