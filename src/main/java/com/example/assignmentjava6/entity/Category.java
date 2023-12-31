package com.example.assignmentjava6.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Entity 
@Table(name = "Categories")
public class Category implements Serializable{
	@Id
	private	String id;
	private	String name;
	@JsonIgnore
	@OneToMany(mappedBy = "category")
	List<Product> products;
	
}
