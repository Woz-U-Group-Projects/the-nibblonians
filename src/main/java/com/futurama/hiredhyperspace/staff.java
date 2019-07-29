package com.futurama.hiredhyperspace;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*connects java to spring to pull data through IDE*/
@SpringBootApplication
public class Employees {

	public static void main(String[] args) {
		SpringApplication.run(Employees.class, args);
	}

}

public class QuickReport1 {
  @Id
  public ObjectId _id;
  public String firstName;
  public String lastName;
  public String role;
  public Number floor;
  public Number desk;

  // Constructors
  public Management() {}
 
  public Management(ObjectId _id, String firstName, String lastName, String role, Number floor, Number desk) {
 
    this._id = id;
    this.firstName = firstName
    this.lastName = lastName;
    this.role = role;
    this.floor = floor;
    this.desk = desk;
  }
 
  // ObjectId needs to be converted to string
  public String get_id() { return _id.toHexString(); }
  public void set_id(ObjectId _id) { this._id = _id; }
  
  public String getFirstName() { return firstName; }
  public void setFirstName(String firstName) { this.firstName = firstName; }
 
  public String getLastName() { return lastName; }
  public void setLastName(String lastName) { this.lastName = lastName }

  public String getSpecies() { return role; }
  public void setSpecies(String role) { this.role = role; }
 
  public String getfloor() { return floor; }
  public void setfloor(String floor) { this.floor = floor; }

  public String getdesk() { return desk; }
  public void setdesk(Number desk) { this.desk = desk; }

}
