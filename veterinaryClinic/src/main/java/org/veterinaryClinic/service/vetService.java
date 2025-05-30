package org.veterinaryClinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.veterinaryClinic.entity.veterinarian;
import org.veterinaryClinic.repository.VetRepository;

import java.util.Optional;

@Service
public class vetService {

    @Autowired
    private VetRepository vetRepository;
    public Optional<veterinarian> getById(Long id){
        return VetRepository.findById(id);
    }
}