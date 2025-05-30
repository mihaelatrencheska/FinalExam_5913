package org.veterinaryClinic.service;
import org.veterinaryClinic.entity.pet;
import org.veterinaryClinic.repository.PetRepository;
import org.veterinaryClinic.entity.veterinarian;
import org.veterinaryClinic.repository.VetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class dataInitializer {

    @Bean
    CommandLineRunner dataInitialize(PetRepository petRepository, VetRepository vetRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String[] args) {
                List<pet> savedPet = petRepository.saveAll(
                        List.of(
                                new pet("", ""),
                                new pet(""),
                                new pet("")
                        )
                );
                List<veterinarian> savedVeterinarien = vetRepository.saveAll(
                        List.of(
                                new pet("", ""),
                                new pet(""),
                                new pet("")
                        )
                );

                //need to put data
            }
        };
    }
}