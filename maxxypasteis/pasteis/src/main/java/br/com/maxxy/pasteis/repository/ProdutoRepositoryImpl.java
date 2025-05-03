package br.com.maxxy.pasteis.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.maxxy.pasteis.models.Produto;

@Repository
public class ProdutoRepositoryImpl implements ProdutoRepository{
	@PersistenceContext
	private EntityManager entityManager;
	
	public Produto save(Produto produto) {
		entityManager.persist(produto);
		return produto;
	}

}
