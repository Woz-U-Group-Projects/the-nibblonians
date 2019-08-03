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

		// TODO Auto-generated constructor stub

	public static void main(String[] args) {
		SpringApplication.run(Employees.class, args);}

	public void set_id(ObjectId id) {
		// TODO Auto-generated method stub
	}

	public Employees orElse(Object object) {
		// TODO Auto-generated method stub
		return null;}

//	fix me
	@Id
	private Double id;
	private String division;
	private String team;
	private String role;
	private String reportsTo;
	private Double schedule;
	private Double floor;
	private Double desk;
	private String firstName;
	private String middleName;
	private String lastName;
	private String preferredName;
	private Double age;
	private Double dob;
	private String gender;
	private String maritalStatus;
	private String email;
	private Double phone;
	private String address;
	private String city;
	private String state;
	private Double zip;
	private String medicalConditions;
	private String military;

	public Employees(Double id, String division, String team, String role, String reportsTo, Double schedule, Double floor, Double desk, String firstName, String middleName, String lastName, String preferredName, Double age, Double dob, String gender,String maritalStatus, String email, Double phone, String address, String city, String state, Double zip, String medicalConditions, String military) {
		this.id = id;
		this.division = division;
		this.team = team;
		this.role = role;
		this.reportsTo = reportsTo;
		this.schedule = schedule;
		this.floor = floor;
		this.desk = desk;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.preferredName = preferredName;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.medicalConditions = medicalConditions;
		this.military = military;
	}

	public Employees(String string, String string2, String string3, String string4, int i, int j, String string5,
			String string6, int k, String string7, String string8, String string9, int l, String string10,
			String string11, int m) {
		// TODO Auto-generated constructor stub
	}
}