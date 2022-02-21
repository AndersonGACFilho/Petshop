package br.com.petshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.petshop.model.person.Veterinarian;

@Repository
public interface VeterinarianRepository extends JpaRepository<Veterinarian, Long>{
	
}
