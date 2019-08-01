
package com.example.demo;

//import java.security.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	// id int
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    private String first_name;
    private String last_name;
    private String username;
    private String password;

	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}
	public String getFirst_name() {
    	return first_name;
    }
    public void setFirst_name(String first_name) {
    	this.first_name = first_name;
    }
    public String getLast_name() {
    	return last_name;
    }
    public void setLast_name(String last_name) {
    	this.last_name = last_name;
    }
    public String getUsername() {
    	return username;
    }
    public void setUsername(String username) {
    	this.username = username;
    }
    public String getPassword() {
    	return password;
    }
    public void setPassword(String password) {
    	this.password = password;
    }
 

	
	//ID: int
	//firstName: String
	//lastName: String
	//username: String
	//password: String

}