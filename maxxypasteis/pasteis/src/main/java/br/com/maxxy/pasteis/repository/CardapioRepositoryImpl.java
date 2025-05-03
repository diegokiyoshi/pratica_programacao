package br.com.maxxy.pasteis.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.maxxy.pasteis.models.Cardapio;

@Repository
public class CardapioRepositoryImpl implements CardapioRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	public Cardapio save(Cardapio cardapio) {
		entityManager.persist(cardapio);
		return cardapio;
	}
}
