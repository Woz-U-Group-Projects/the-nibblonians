package com.example.demo;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class Post {
	//Id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Timestamp last_update;
	private String post;
	private String authorid;
	
	public void setId(Integer id) {
	this.id = id;
}
	public Integer getId() {
		return this.id;
	}
	
	public void setauthorId(String id) {
}
	public String getauthorId() {
		return this.authorid;
	}
	
	public void setPost(String post) {
		this.post = post;
	}
	public String getPost(String post) {
		return this.post = post;
	}
    public Timestamp getLast_update() {
    	return last_update;
    }
    public void setLast_update(Timestamp last_update) {
    	this.last_update = last_update;
    }

}
