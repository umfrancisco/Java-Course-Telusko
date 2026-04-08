package com.umfrancisco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.umfrancisco.model.JobPost;
import com.umfrancisco.service.JobService;

@Controller
public class JobController {
	
	@Autowired
	private JobService service;
	
	@GetMapping({"/", "home"})
	public String home() {
		return "home";
	}
	
	@GetMapping("addjob")
	public String addJob() {
		return "addjob";
	}
	
	@PostMapping("handleForm")
	public String handleForm(JobPost jobPost) {
		service.addJob(jobPost);
		return "success";
	}
	
	@GetMapping("viewalljobs")
	public String viewJobs(Model model) {
		List<JobPost> jobs = service.getAllJobs();
		model.addAttribute("jobPosts", jobs);
		return "viewalljobs";
	}
}
