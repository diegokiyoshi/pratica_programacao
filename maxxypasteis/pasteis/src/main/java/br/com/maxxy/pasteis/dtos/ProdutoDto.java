package br.com.maxxy.pasteis.dtos;

import java.util.Collection;


import br.com.maxxy.pasteis.models.Pedido;

public class ProdutoDto {
	
	private String tipo_produto;
	private Integer quantidade_produto;
	private Double preco_produto;

	private Collection<Pedido> pedidos;
	
	public String getTipo_produto() {
		return tipo_produto;
	}

	public void setTipo_produto(String tipo_produto) {
		this.tipo_produto = tipo_produto;
	}

	public Integer getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(Integer quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}

	public Double getPreco_produto() {
		return preco_produto;
	}

	public void setPreco_produto(Double preco_produto) {
		this.preco_produto = preco_produto;
	}

}
