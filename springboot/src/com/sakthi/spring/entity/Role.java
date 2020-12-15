package com.sakthi.spring.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ROLE")
public class Role {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "seq_role", sequenceName = "seq_role", allocationSize = 100)
    private Long id;
   
	@Column(name = "NAME")
	private String name;
    
	@Column(name = "DESCRIPTION")
	private String description;
	
	public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
