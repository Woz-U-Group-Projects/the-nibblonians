package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/post")
public class PostController {
//repository
	//get all methods
	//post for posts
	//delet for posts
	//put for posts
	// the counter used for IDs
    private final AtomicLong counter = new AtomicLong();
	@Autowired 
	PostRepository postRepository;
	PostRepository dao;
	
	@CrossOrigin(origins = "http://localhost:3000")
	
	@GetMapping("/")
	public String[] getValues(){
		  return new String[] {"value1","value2"};
		}
	
	public List<Post> getPosts(){
	return postRepository.findAll();
	}
	
	@RequestMapping
	private  String getLocalDateTime() {
        String result = "";
        LocalDateTime now = LocalDateTime.now();
        result = now.toString();
        System.out.println(result);
        return result;
}
	@RequestMapping("/")
	    public String index() {
	        return "index.html";
	    }
		
	    public String style() {
	        return "style.css";
	    }
	 
	    public String indexjs() {
	        return "index.js";
	    }
	    
	    
	    
	    @PostMapping("/post")
	    public ResponseEntity<Post> postMessage(@RequestBody Post message) {

	// saving to DB using instance of the repo interface
	        Post createdPost = dao.save(message);

	// RespEntity crafts response to include correct status codes.
	        return ResponseEntity.ok(createdPost);
	    }

	@DeleteMapping("/post/{id}")	
	    public ResponseEntity<Post> deletePosts(@PathVariable(value="id") Integer id) {
	        Post foundPosts = dao.findById(id).orElse(null);
	if(foundPosts == null) {
	            return ResponseEntity.notFound().header("Message","Nothing found with that id").build();
	        }else {
	            dao.delete(foundPosts);
	        }
	        return ResponseEntity.ok().build();
	    }

}

