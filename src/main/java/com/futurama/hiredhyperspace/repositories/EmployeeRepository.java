package com.futurama.hiredhyperspace.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository<Employees> extends MongoRepository<Employees, String> {
  Employees findBy_id(ObjectId _id);
}