package br.com.maxxy.pasteis.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue
	private Long id_funcionario;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(Long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	

}
