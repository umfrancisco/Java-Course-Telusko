package com.umfrancisco.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.umfrancisco.model.JobPost;
import com.umfrancisco.service.JobService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class JobRestController {
	
	@Autowired
	private JobService service;
	
	@GetMapping("posts")
	public List<JobPost> getAllJobs() {
		return service.getAllJobs(); 
	}
	
	@GetMapping("post/{id}")
	public JobPost getJob(@PathVariable("id") int id) {
		return service.getJob(id);
	}
	
	@PostMapping("post")
	public JobPost addJob(@RequestBody JobPost post) {
		service.addJob(post);
		return service.getJob(post.getPostId());
	}
}
