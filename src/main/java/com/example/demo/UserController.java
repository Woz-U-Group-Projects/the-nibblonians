package com.example.demo;

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

	// the counter used for IDs
    private final AtomicLong counter = new AtomicLong();

	//repository
		//get all methods
		//post for posts
		//delet for posts
		//put for posts
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



