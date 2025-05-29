package org.veterinaryClinic.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.veterinaryClinic.entity.pet;


@Repository
public interface PetRepository extends JpaRepository<pet, Long>{

}

