package br.com.petshop.model.person;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public abstract class Person {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String CPF;
	private Date registrationDate;
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		this.name = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
}
