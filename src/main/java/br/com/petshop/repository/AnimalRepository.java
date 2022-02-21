package br.com.petshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.petshop.model.animal.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{
	
}
