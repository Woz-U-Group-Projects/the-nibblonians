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
// @RequestMapping(/user)
// public class UserController {
//   @Autowired
//   private UserRepository repository;
 

  
//   @GetMapping(“/”)
//   public List<User> getAllUser() {
//     return repository.findAll();
//   }
//   @RequestMapping(value = “/{id}”, method = RequestMethod.GET)
//   public User getUserById(@PathVariable(“id”) ObjectId id) {
//     return repository.findBy_id(id);
//   }
 
//   @RequestMapping(value = “/{id}”, method = RequestMethod.PUT)
//   public void modifyUserById(@PathVariable(“id”) ObjectId id, @Valid @RequestBody User User) {
//     User.set_id(id);
//     repository.save(User);
//   }
 
//   @RequestMapping(value = “/”, method = RequestMethod.POST)
//   public User createUser(@Valid @RequestBody User User) {
//     User.set_id(ObjectId.get());
//     repository.save(User);
//     return User;
//   }
 
//   @RequestMapping(“/{id}”)
//   public String deleteUser(@PathVariable ObjectId _id) {
//     repository.delete(repository.findBy_id(id));
//   }


// }




import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


 @Controller
 @RestController
 @RequestMapping("/User")
 public class UserController {

// 	// the counter used for IDs
     private final AtomicLong counter = new AtomicLong();

// 	//repository
// 		//get all methods
// 		//post for posts
// 		//delet for posts
// 		//put for posts
 		@Autowired 
 		PostRepository postRepository;
		
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
 		@RequestMapping
 		private String getLocalDateTime() {
 	        String result = "";
 	        LocalDateTime now = LocalDateTime.now();
 	        result = now.toString();
 	        System.out.println(result);
 	        return result;
 	}
 	}



