
package com.example.demo;

//import java.security.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// import org.springframework.data.annotation.Id;
// import org.springframework.data.mongodb.core.mapping.Document;
// import org.springframework.data.mongodb.repository.*;



@Entity
@Table(name="user")
public class User {
	// id int

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;

	
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {

		return this.id;
	}
	public String getFirstname() {
    	return firstname;
    }
    public void setFirstname(String firstname) {
    	this.firstname = firstname;
    }
    public String getLastname() {
    	return lastname;
    }
    public void setLastname(String lastname) {
    	this.lastname = lastname;
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

    

}