package com.futurama.hiredhyperspace.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.futurama.hiredhyperspace.repositories.QuickReport;

public interface EmployeeRepository<Employees> extends MongoRepository<Employees, String> {
	Employees findBy_id(ObjectId _id);

	Employees findFirstByName(String name);

	@Query("{address:'?0'}")
	QuickReport findCustomByAddress(String address);

	@Query("{address : { $regex: ?0 } }")
	QuickReport findCustomByRegExAddress(String domain);

	Iterable findCustomByRegExRole(String string);

	com.futurama.hiredhyperspace.Employees findByReportsTo(String string);

}