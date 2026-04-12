package com.umfrancisco.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.umfrancisco.model.JobPost;
import com.umfrancisco.service.JobService;

@RestController
public class JobRestController {
	
	@Autowired
	private JobService service;
	
	@GetMapping("posts")
	public List<JobPost> getAllJobs() {
		return service.getAllJobs(); 
	}
}
