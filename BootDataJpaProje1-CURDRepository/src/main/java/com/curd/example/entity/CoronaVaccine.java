package com.curd.example.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "CORONA_VACCINE_TAB") :- Optional if we want to take db table name same as entity class name.
public class CoronaVaccine implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id // to make as the singular Id property and map with singular PK col of the
		// table.
	@Column(name = "regNo") // option if we want to take property name as the col name.
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long regNo;

	@Column(name = "name", length = 20)
	private String name;

	@Column(name = "company", length = 20)
	private String company;

	@Column(name = "country", length = 20)
	private String country;

	private Double price;

	private Integer requiredDosesCount;

	/*public CoronaVaccine() {

	}

	public CoronaVaccine(Long regNo, String name, String company, String country, Double price,
			Integer requiredDosesCount) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.company = company;
		this.country = country;
		this.price = price;
		this.requiredDosesCount = requiredDosesCount;
	}

	public Long getRegNo() {
		return regNo;
	}

	public void setRegNo(Long regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getRequiredDosesCount() {
		return requiredDosesCount;
	}

	public void setRequiredDosesCount(Integer requiredDosesCount) {
		this.requiredDosesCount = requiredDosesCount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}*/

}
