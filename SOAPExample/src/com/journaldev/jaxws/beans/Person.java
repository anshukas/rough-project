package com.journaldev.jaxws.beans;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = -9070022768212675538L;
	private String name;
	private int age;
	private int id;
	private Beer beer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Person() {
		super();
	}

	public Person(String name, int age, int id, Beer beer) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public Beer getBeer() {
		return beer;
	}

	public void setBeer(Beer beer) {
		this.beer = beer;
	}

}
