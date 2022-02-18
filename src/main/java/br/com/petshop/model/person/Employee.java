package br.com.petshop.model.person;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import br.com.petshop.model.animal.Role;

@Entity
public class Employee extends Person{
	private String password;
	private BigDecimal salary;
	@ManyToOne(fetch = FetchType.EAGER) 
	private Role role;

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
}
