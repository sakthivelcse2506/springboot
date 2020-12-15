package com.sakthi.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USER")
public class User {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "seq_user", sequenceName = "seq_user", allocationSize = 100)
    private Long id;
   
	@Column(name = "FIRST_NAME")
	private String firstName;
    
	@Column(name = "LAST_NAME")
	private String lastName;
    
	@Column(name = "MOBILE")
	private String mobile;
    
	@Column(name= "EMAIL")
    private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Role role;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}
