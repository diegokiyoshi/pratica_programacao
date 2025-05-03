package br.com.maxxy.pasteis.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.maxxy.pasteis.models.Cliente;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository{
	@PersistenceContext
	private EntityManager entityManager;
	public Cliente save(Cliente cliente) {
		entityManager.persist(cliente);
		return cliente;
	}

}
