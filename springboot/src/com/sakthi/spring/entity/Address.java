package com.sakthi.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ADDRESS")
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "seq_address", sequenceName = "seq_address", allocationSize = 100)
    private Long id;
   
	@Column(name = "TYPE")
	private String type;
    
	@Column(name = "FULL_ADDRESS")
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
