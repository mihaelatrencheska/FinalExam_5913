package org.veterinaryClinic.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;
import org.veterinaryClinic.entity.pet;
import org.veterinaryClinic.repository.PetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@RestController
@RequestMapping()
public class petController{
    private Logger logger = LoggerFactory.getLogger(petController.class);
    @Autowired
    pet Pet;


    @Autowired
    private PetRepository petRepository;

    @GetMapping
    public List<pet> getAll(){
        return petRepository.findAll();
    }

    @PostMapping
    public pet create(@RequestBody pet Pet){
        return  petRepository.save(Pet);
    }

    @GetMapping("/{id}")
    public pet getById(@PathVariable Long id){
        return  petRepository.findById(id).orElseThrow();
    }

    @PutMapping("/id")
    public pet update(@PathVariable Long id, @RequestBody pet updated){
        pet Pet = petRepository.findById(id).orElseThrow();
        Pet.setName(updated.getName());
        return petRepository.save(Pet);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        petRepository.deleteById(id);

    }


}
