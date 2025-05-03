package br.com.maxxy.pasteis.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cardapio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cardapio;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setId_cardapio(Long id_cardapio) {
		this.id_cardapio = id_cardapio;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId_cardapio() {
		return id_cardapio;
	}
	
	
}
	