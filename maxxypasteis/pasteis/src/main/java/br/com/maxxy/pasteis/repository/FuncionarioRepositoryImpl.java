package br.com.maxxy.pasteis.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.maxxy.pasteis.models.Funcionario;

@Repository
public class FuncionarioRepositoryImpl implements FuncionarioRepository{
	@PersistenceContext
	private EntityManager entityManager;

	public Funcionario save(Funcionario funcionario) {
		entityManager.persist(funcionario);
		return funcionario;
	}

}
