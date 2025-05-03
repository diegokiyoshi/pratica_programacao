package br.com.maxxy.pasteis.service;

import br.com.maxxy.pasteis.models.Animal;
import br.com.maxxy.pasteis.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Transactional
    public Animal save(Animal animal) {

        return animalRepository.save(animal);
    }
}
