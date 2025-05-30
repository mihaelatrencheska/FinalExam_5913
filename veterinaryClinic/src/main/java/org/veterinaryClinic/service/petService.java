package org.veterinaryClinic.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.veterinaryClinic.entity.pet;
import org.veterinaryClinic.repository.PetRepository;

import java.util.Optional;

@Service
public class petService {

    @Autowired
    private PetRepository petRepository;
    public Optional<pet> getById(Long id){
        return PetRepository.findById(id);
    }
}
