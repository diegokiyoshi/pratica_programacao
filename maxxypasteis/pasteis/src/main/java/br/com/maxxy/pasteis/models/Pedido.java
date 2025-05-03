package br.com.maxxy.pasteis.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Pedido {

	@Id
	@GeneratedValue
	private Long id_pedido;

	@ManyToMany
	private Collection<Produto> produtos;
	
	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}
	public Long getId_pedido() {
		return id_pedido;
	}
	
	
}
