package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import org.springframework.data.mongodb.repository;


@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
	//id
	//authorID
	//message
	//timestamp
}



 