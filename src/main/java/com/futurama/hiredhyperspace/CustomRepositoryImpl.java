package com.futurama.hiredhyperspace;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.mongodb.client.result.UpdateResult;

@Component
public class CustomRepositoryImpl {

	@Autowired
	MongoTemplate mongoTemplate;

	public long updateUser(String reportsTo, String firstName, String middleName, String lastName, String preferredName,
			Number age, Number dob, String gender, String maritalStatus, Number phone, String address, String city,
			String state, Number zip, String medicalConditions, String military, Number hireDate) {

		// potential need to update Number to String
		// ^ causes need to update age & other Number to parseInt
		Query query = new query();
		Update update = new Update();
		update.set("firstName", firstName);
		update.set("middleName", middleName);
		update.set("lastName", lastName);
		update.set("preferredName", preferredName);
		update.set("age", age);
		update.set("dob", dob);
		update.set("gender", gender);
		update.set("maritalStatus", maritalStatus);
		update.set("phone", phone);
		update.set("address", address);
		update.set("city", city);
		update.set("state", state);
		update.set("zip", zip);
		update.set("medicalConditions", medicalConditions);
		update.set("military", military);

		UpdateResult result = mongoTemplate.updateFirst((org.springframework.data.mongodb.core.query.Query) query, update, Employees.class);

		if (result != null)
			return result.getModifiedCount();
		else
			return 0;
	}

	private void query(Criteria criteria) {}
		// TODO Auto-generated method stub

	public Object save(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable saveAll(Iterable entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional findById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsById(Object id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable findAllById(Iterable ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteById(Object id) {
		// TODO Auto-generated method stub		
	}

	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub	
	}
}
