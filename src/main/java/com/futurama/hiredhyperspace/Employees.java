package com.futurama.hiredhyperspace;

import org.bson.types.ObjectId;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hiredhyperspace")
/* connects java to spring to pull data through IDE */
@SpringBootApplication
public class Employees {
	public Employees(String string, String string2, String string3, String string4, int i, int j, String string5,
			String string6, int k, String string7, String string8, String string9, int l, String string10,
			String string11, int m) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SpringApplication.run(Employees.class, args);
	}

	public void set_id(ObjectId id) {
		// TODO Auto-generated method stub

	}

	public Employees orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

//	fix me
	@Id
	private String id;
	private String name;
	private String address;
	private Double salary;

	public Employees(String name, String address, Double salary) {
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
}