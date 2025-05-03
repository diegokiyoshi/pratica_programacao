package br.com.maxxy.pasteis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.maxxy.pasteis.models.Produto;
import br.com.maxxy.pasteis.service.ProdutoService;

@RestController
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;
	@GetMapping("/produto")
	public Produto getUser(@RequestParam(value = "tipo_produto" , defaultValue = "Massa") String tipo_produto, 
						   @RequestParam(value = "quantidade_produto", defaultValue = "2") Integer quantidade_produto,
						   @RequestParam(value = "preco_produto", defaultValue = "15.00") Double preco_produto) {
		Produto produto = new Produto();
		produto.setId_produto((long) 10);
		produto.setTipo_produto(tipo_produto);
		produto.setQuantidade_produto(quantidade_produto);
		produto.setPreco_produto(preco_produto);
		
		return produto;
	}
	
	@PostMapping("/produto")
	public Produto postUser(@RequestBody Produto produto) {
		produtoService.save(produto);
		return produto;
	}
	
	@PatchMapping("/produto")
	public Produto patchUser(@RequestBody Produto produto) {
		produtoService.save(produto);
		return produto;
	}

}
