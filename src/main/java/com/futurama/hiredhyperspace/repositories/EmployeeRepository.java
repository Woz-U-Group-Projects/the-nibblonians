package com.example.gtommee.rest_tutorial.repositories;

import com.example.gtommee.rest_tutorial.models.Employees;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeesRepository extends MongoRepository<Employees, String> {
  Employees findBy_id(ObjectId _id);
}