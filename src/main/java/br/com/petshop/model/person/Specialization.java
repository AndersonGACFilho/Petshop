package br.com.petshop.model.person;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Specialization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	@OneToMany
	private List<Veterinarian> veterinarians = new ArrayList<Veterinarian>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public List<Veterinarian> getVeterinarians() {
		return veterinarians;
	}
	public void setVeterinarians(List<Veterinarian> veterinarians) {
		this.veterinarians = veterinarians;
	}
	public void addVeterinarians(Veterinarian veterinarian) {
		veterinarians.add(veterinarian);
	}
}
