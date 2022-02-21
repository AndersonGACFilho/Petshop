package br.com.petshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.petshop.model.person.Employee;

@Repository
public interface RepositoryEmployee extends JpaRepository<Employee, Long>{
	
}
