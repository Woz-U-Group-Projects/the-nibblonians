package com.futurama.hiredhyperspace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.futurama.hiredhyperspace.repositories.EmployeeRepository;


@SpringBootApplication
public class MongoBootApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository repository;

	@Autowired
	MongoRepository crepo;

	public static void main(String[] args) {
		SpringApplication.run(MongoBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		deleteAll();
		addSampleData();
		listAll();
		findByReportsTo();
		findByRegex();
	}

	public void deleteAll() {
		System.out.println("Deleting all records..");
		repository.deleteAll();
	}

	public void addSampleData() {
		System.out.println("Adding sample data");
		repository.save(new Employees("Helena", "Bonham", "Carter", "Bon Cart", 53, 5 / 26 / 1966, "Female", "Married",
				808 - 554 - 3789, "54 Diagon Alley Lane", "Brooklyn", "NY", 11215, "Asthma", "null", 8 / 3 / 2019));
		repository.save(new Employees("Steven", "Vincent", "Buscemi", "Steve Buscemi", 61, 12 / 13 / 1957, "Male",
				"Widowed", 727 - 443 - 3957, "832 Candy Cane Court", "New York", "NY", 11425, "None", "null",
				8 / 5 / 2019));
		repository.save(new Employees("Ellen", "Grace", "Page", "Ellen Page", 32, 2 / 21 / 1987, "Female", "Married",
				813 - 216 - 7431, "2081 Laughing Man Loop", "Flushing", "NY", 11367, "None", "Air Force",
				8 / 7 / 2019));
	}

	public void listAll() {
		System.out.println("Listing sample data");
		repository.findAll().forEach(u -> System.out.println(u));
	}

	public void findByReportsTo() {
		System.out.println("Find by Reports To");
		Employees u = repository.findByReportsTo("Louise Litt");
		System.out.println(u);
	}

	public void findByRegex() {
		System.out.println("Finding by Regex - All with role starting with ^New");
		repository.findCustomByRegExRole("^New").forEach(u -> System.out.println(u));
	}
}