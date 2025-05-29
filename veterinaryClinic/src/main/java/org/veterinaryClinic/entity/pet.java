package org.veterinaryClinic.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;



@Entity
public class pet {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  String species;
    private String breed;
    private  int birthDate;
    private String ownerName;
    private int ownerPhone;

    public pet() {
    }

    public pet(Long id, String name, String species, String breed, int birthDate, String ownerName, int ownerPhone) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.birthDate = birthDate;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(int ownerPhone) {
        this.ownerPhone = ownerPhone;
    }
}
