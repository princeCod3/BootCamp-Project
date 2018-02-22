package org.reverside.bootcamp.ubereats.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	
	 
	@Id//identifies primary key for JPA
	@GeneratedValue(strategy = GenerationType.IDENTITY)// auto-generated attribute
	private int id;
	private String name;
	private String description;
	@Column(name="is_active") //Ensures attribute is linked to relative column
	private boolean active = true;
	
	//getter and setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	 //to-String method to help with error handling
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", active=" + active + "]";
	}
	

}
