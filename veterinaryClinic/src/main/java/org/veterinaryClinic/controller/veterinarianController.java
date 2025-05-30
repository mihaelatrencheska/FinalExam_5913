package org.veterinaryClinic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;
import org.veterinaryClinic.entity.veterinarian;
import org.veterinaryClinic.repository.VetRepository;

import java.util.List;

@RestController
@RequestMapping()
public class veterinarianController{
    private Logger logger = LoggerFactory.getLogger(veterinarianController.class);
    @Autowired
    veterinarian Veterinarian;

    @Autowired
    private VetRepository vetRepository;

    @GetMapping
    public List<veterinarian> getAll(){
        return vetRepository.findAll();
    }

    @PostMapping
    public veterinarian create(@RequestBody veterinarian Veterinarian){
        return  vetRepository.save(Veterinarian);
    }

    @PostMapping
    public veterinarian create(@RequestBody veterinarian Veterinarian){
        return  vetRepository.save(Veterinarian);
    }

    @GetMapping("/{id}")
    public veterinarian getById(@PathVariable Long id){
        return  vetRepository.findById(id).orElseThrow();
    }

    @PutMapping("/id")
    public veterinarian update(@PathVariable Long id, @RequestBody veterinarian updated){
        veterinarian Veterinarian = vetRepository.findById(id).orElseThrow();
        Veterinarian.setFirstName(updated.getFirstName());
        Veterinarian.setLastName(updated.getLastName());
        return vetRepository.save(Veterinarian);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        vetRepository.deleteById(id);
    }


}
