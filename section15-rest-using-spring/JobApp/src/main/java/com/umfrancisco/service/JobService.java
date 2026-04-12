package com.umfrancisco.service;

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
		repository.addJob(job);
	}
	
	public List<JobPost> getAllJobs() {
		return repository.getAllJobs();
	}
}
