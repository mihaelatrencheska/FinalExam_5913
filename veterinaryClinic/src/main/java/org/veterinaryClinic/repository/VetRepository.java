package org.veterinaryClinic.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.veterinaryClinic.entity.veterinarian;

@Repository
public interface VetRepository extends JpaRepository<veterinarian, String> {
}
