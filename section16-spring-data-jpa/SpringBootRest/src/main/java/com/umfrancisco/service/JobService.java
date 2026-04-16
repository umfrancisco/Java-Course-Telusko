package com.umfrancisco.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.umfrancisco.model.JobPost;
import com.umfrancisco.repository.JobRepository;

@Service
public class JobService {
	
	@Autowired
	private JobRepository repository;
	
	public void addJob(JobPost job) {
		repository.save(job);
	}
	
	public List<JobPost> getAllJobs() {
		return repository.findAll();
	}
	
	public JobPost getJob(int id) {
		return repository.findById(id).orElse(new JobPost());
	}
	
	public void updateJob(JobPost job) {
		repository.save(job);
	}
	
	public void deleteJob(int id) {
		repository.deleteById(id);
	}
	
	public void load() {
		List<JobPost> jobs = 
			new ArrayList<>(List.of(
			new JobPost(1, "Software Engineer", "Exciting opportunity for a skilled software engineer.", 3, List.of("Java", "Spring", "SQL","API")),
			new JobPost(2, "Data Scientist", "Join our data science team and work on cutting-edge projects.", 5, List.of("Python", "Machine Learning", "TensorFlow","API")),
			new JobPost(3, "Frontend Developer", "Create API amazing user interfaces with our talented frontend team.", 2, List.of("JavaScript", "React", "CSS","API")),
			new JobPost(4, "Network Engineer", "Design and API maintain our robust network infrastructure.", 4, List.of("Cisco", "Routing", "Firewalls")),
			new JobPost(5, "UX Designer", "Shape the user experience with your creative design skills.", 3, List.of("UI/UX Design", "Adobe XD", "Prototyping"))
		));
		repository.saveAll(jobs);
	}
	
	public List<JobPost> search(String keyword) {
		return repository.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
	}
}
