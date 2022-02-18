package br.com.petshop.model.person;

import javax.persistence.Entity;

@Entity
public class Client extends Person{
	private String zipCode;
	private String neighborhood;
	private String Street;
	private Integer adressNumber;
	
	public String getCEP() {
		return zipCode;
	}
	public void setCEP(String zip) {
		zipCode = zip;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public Integer getAdressNumber() {
		return adressNumber;
	}
	public void setAdressNumber(Integer adressNumber) {
		this.adressNumber = adressNumber;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	} 
}
