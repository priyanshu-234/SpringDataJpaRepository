package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id; 
@Entity 
public class User {
	@Id
	private int id ;
	private  String  name ;
	private  String  sirname  ;
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
	public String getSirname() {
		return sirname;
	}
	public void setSirname(String sirname) {
		this.sirname = sirname;
	}
	public User(int id, String name, String sirname) {
		super();
		this.id = id;
		this.name = name;
		this.sirname = sirname;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sirname=" + sirname + "]";
	}
	

}
