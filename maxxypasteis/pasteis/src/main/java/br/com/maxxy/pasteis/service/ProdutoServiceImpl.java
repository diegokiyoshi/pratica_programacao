package br.com.maxxy.pasteis.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maxxy.pasteis.models.Produto;
import br.com.maxxy.pasteis.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService{
	@Autowired
	private ProdutoRepository produtoRepository;
	@Transactional
	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}

}
