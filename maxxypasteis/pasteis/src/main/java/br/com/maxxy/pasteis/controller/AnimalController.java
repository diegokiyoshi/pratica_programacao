package br.com.maxxy.pasteis.controller;

import br.com.maxxy.pasteis.dtos.AnimalDto;
import br.com.maxxy.pasteis.models.Animal;
import br.com.maxxy.pasteis.service.AnimalService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class AnimalController {
    @Autowired
    private AnimalService animalService;
    @GetMapping("/animal")
    public Animal getUser(@RequestParam(value = "cor", defaultValue = "Branco") String cor,
                          @RequestParam(value = "nome", defaultValue = "Olaf") String nome,
                          @RequestParam(value = "raca", defaultValue = "vira-lata") String raca) {
        Animal animal = new Animal();
        animal.setId(23);
        animal.setCor(cor);
        animal.setNome(nome);
        animal.setRaca(raca);

        return animal;
    }

    @PostMapping("/animal")
    public Animal postUser(@RequestBody @Valid AnimalDto animalDto ) {
        System.out.println("nome Animal:" + animalDto.getNome());
        Animal animal = new Animal();
        BeanUtils.copyProperties(animalDto,animal);
        animalService.save(animal);
        return animal;
    }

    @PatchMapping("/animal")
    public Animal patchUser(@RequestBody Animal animal) {

        animalService.save(animal);
        return animal;
    }

}
