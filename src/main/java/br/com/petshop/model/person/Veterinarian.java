package br.com.petshop.model.person;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Veterinarian extends Person{
	private String password;
	private BigDecimal salary;
	private List<String> specializations;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public List<String> getSpecializations() {
		return specializations;
	}
	public void setSpecializations(List<String> specializations) {
		this.specializations = specializations;
	}
}
