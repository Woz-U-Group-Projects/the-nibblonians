 package com.example.demo;
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;


 @Repository
 public interface UserRepository extends JpaRepository<Post, Integer> {
	
 }

// package com.example.demo;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;
// import com.example.demo.User;
// import org.bson.types.ObjectId;
// import org.springframework.data.mongodb.repository.MongoRepository;
// public interface UserRepository extends MongoRepository<User, String> {
//   User findBy_id(ObjectId _id);
// }
