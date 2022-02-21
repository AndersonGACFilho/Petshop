package br.com.petshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.petshop.cart.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
	
}
