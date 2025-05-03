package br.com.maxxy.pasteis.repository;

import br.com.maxxy.pasteis.models.Animal;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AnimalRepositoryImpl implements AnimalRepository {
    @PersistenceContext
    private EntityManager entityManager;
    public Animal save(Animal animal) {
        entityManager.persist(animal);
        return animal;
    }
}
