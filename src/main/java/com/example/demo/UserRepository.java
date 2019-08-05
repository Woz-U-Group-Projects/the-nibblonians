package com.example.demo;
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;
// import org.springframework.data.mongodb.repository;

 @Repository
 public interface UserRepository extends JpaRepository<User, Integer> {
 }

// package com.example.demo;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;
// import com.example.demo.User;
// import org.bson.types.ObjectId;
// import org.springframework.data.mongodb.repository.MongoRepository;
// public interface UserRepository extends MongoRepository<User, String> {
// User findBy_id(ObjectId _id);
// }

// import org.springframework.data.repository.Repository;
 
// import java.util.List;
// import java.util.Optional;

 
// interface UserRepository extends Repository<User, String> {
 
//     void delete(User deleted);
 
//     List<User> findAll();
 
//     Optional<User> findOne(String id);
 
//     User save(User saved);

//     User findBy_id(Integer id);
// }
