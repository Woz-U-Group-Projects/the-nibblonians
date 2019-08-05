package com.example.demo;

// import com.example.demo.User;
// import com.example.demo.UserRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RestController;
// import javax.validation.Valid;
// import java.util.List;

// @RestController
// @RequestMapping("/user")
// public class UserController {
//   @Autowired
//   private UserRepository repository;
 

  
//   @GetMapping("/")
//   public List<User> getAllUser() {
//     return repository.findAll();
//   }
//   @RequestMapping(value ="/{id}", method = RequestMethod.GET)
//   public User getUserById(@PathVariable("id") ObjectId id) {
//     return repository.findBy_id(id);
//   }
 
//   @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//   public void modifyUserById(@PathVariable("id") ObjectId id, @Valid @RequestBody User User) {
//     User.set_id(id);
//     repository.save(User);
//   }
 
//   @RequestMapping(value = "/", method = RequestMethod.POST)
//   public User createUser(@Valid @RequestBody User User) {
//     User.set_id(ObjectId.get());
//     repository.save(User);
//     return User;
//   }
 
//   @RequestMapping("/{id}")
//   public String deleteUser(@PathVariable ObjectId _id) {
//     repository.delete(repository.findBy_id(id));
//   }


// }




import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.data.repository.CrudRepository;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.example.demo.UserRepository;
import com.example.demo.User;
import com.example.demo.PostRepository;


import java.util.List;


 @Controller
 @RestController
 @RequestMapping("/User")
 
 public class UserController {

// 	// the counter used for IDs
     private final AtomicLong counter = new AtomicLong();
 		@Autowired 
 		PostRepository postRepository;
	    UserRepository repository;

 		@GetMapping("/")
 		public @ResponseBody String greeting() {
 	        return "Hello World";
 	    }
 	    public String index() {
 	        return "index.html";
 	    }
		
 	    public String style() {
 	        return "style.css";
 	    }
 	    public String indexjs() {
 	        return "index.js";
 	    }

 		public List<Post> getPosts(){
 		return postRepository.findAll();
		 }

		//  public List<User> getUsers(){
		//  return repository.findAll();
		// }
		 
 		@RequestMapping
 		private String getLocalDateTime() {
 	        String result = "";
 	        LocalDateTime now = LocalDateTime.now();
 	        result = now.toString();
 	        System.out.println(result);
			 return result;
		 }


	@GetMapping("/Users")
	public ResponseEntity getAllUsers() {
		List Users = new ArrayList<>();
		try {
			repository.findAll().forEach(Users::add);
			
			if (Users.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Users, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// @GetMapping("/Users/{id}")
	// public ResponseEntity getUserById(@PathVariable("id") long id) {
	// 	Optional UserData = repository.findById(id);

	// 	if (UserData.isPresent()) {
	// 		return new ResponseEntity<>(UserData.get(), HttpStatus.OK);
	// 	} else {
	// 		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	// 	}
	// }

	// @PostMapping(value = "/Users")
	// public ResponseEntity postUser(@RequestBody User User) {
	// 	try {
	// 		User _User = repository.save(new User(User.getName(), User.getAge()));
	// 		return new ResponseEntity<>(_User, HttpStatus.CREATED);
	// 	} catch (Exception e) {
	// 		return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
	// 	}
	// }

	// @DeleteMapping("/Users/{id}")
	// public ResponseEntity deleteUser(@PathVariable("id") long id) {
	// 	try {
	// 		repository.deleteById(id);
	// 		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	// 	} catch (Exception e) {
	// 		return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
	// 	}
	// }

	// @DeleteMapping("/Users")
	// public ResponseEntity deleteAllUsers() {
	// 	try {
	// 		repository.deleteAll();
	// 		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	// 	} catch (Exception e) {
	// 		return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
	// 	}

	// }

	// @GetMapping(value = "Users/age/{age}")
	// public ResponseEntity> findByAge(@PathVariable int age) {
	// 	try {
	// 		List Users = repository.findByAge(age);

	// 		if (Users.isEmpty()) {
	// 			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	// 		}
	// 		return new ResponseEntity<>(Users, HttpStatus.OK);
	// 	} catch (Exception e) {
	// 		return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
	// 	}
	// }

	// @PutMapping("/Users/{id}")
	// public ResponseEntity updateUser(@PathVariable("id") long id, @RequestBody User User) {
	// 	Optional UserData = repository.findById(id);

	// 	if (UserData.isPresent()) {
	// 		User _User = UserData.get();
	// 		_User.setName(User.getName());
	// 		_User.setAge(User.getAge());
	// 		_User.setActive(User.isActive());
	// 		return new ResponseEntity<>(repository.save(_User), HttpStatus.OK);
	// 	} else {
	// 		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	// 	}
	// }
}