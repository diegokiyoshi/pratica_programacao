package br.com.maxxy.pasteis.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.maxxy.pasteis.models.Pedido;
@Repository
public class PedidoRepositoryImpl implements PedidoRepository{

	@PersistenceContext
	private EntityManager entityManager;
	public Pedido save(Pedido pedido) {
		entityManager.persist(pedido);
		return pedido;
	}

}
