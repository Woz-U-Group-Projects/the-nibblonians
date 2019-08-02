package com.futurama.hiredhyperspace;

import org.bson.types.ObjectId;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*connects java to spring to pull data through IDE*/
@SpringBootApplication
public class Employees {

	public static void main(String[] args) {
		SpringApplication.run(Employees.class, args);
	}

	public void set_id(ObjectId id) {
		// TODO Auto-generated method stub
		
	}

}
