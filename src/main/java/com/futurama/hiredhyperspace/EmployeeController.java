package com.example.gtommee.rest_tutorial;
import com.example.gtommee.rest_tutorial.models.Pets;
import com.example.gtommee.rest_tutorial.repositories.PetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(“/hiredhyperspace”)
public class HiredHyperspaceController {
  @Autowired
  private EmployeesRepository repository;
}
@RequestMapping(value = “/”, method = RequestMethod.GET)
public List<Employees> getAllEmployees() {
  return repository.findAll();
}
@RequestMapping(value = “/{id}”, method = RequestMethod.GET)
public Employees getEmployeesById(@PathVariable(“id”) ObjectId id) {
  return repository.findBy_id(id);
}
@RequestMapping(value = “/{id}”, method = RequestMethod.PUT)
public void modifyEmployeesById(@PathVariable(“id”) ObjectId id, @Valid 
@RequestBody Employees employees) {
  employees.set_id(id);
  repository.save(employees);
}
@RequestMapping(value = “/”, method = RequestMethod.POST)
public Employees createEmployees(@Valid @RequestBody Employees employees) {
  employees.set_id(ObjectId.get());
  repository.save(employees);
  return employees;
}
@RequestMapping(value = “/{id}”, method = RequestMethod.DELETE)
public void deleteEmployees(@PathVariable ObjectId id) {
  repository.delete(repository.findBy_id(id));
}