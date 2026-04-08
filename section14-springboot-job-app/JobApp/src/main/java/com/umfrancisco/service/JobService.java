package com.umfrancisco.service;

import java.util.List;

import com.umfrancisco.model.JobPost;
import com.umfrancisco.repository.JobRepository;

public class JobService {
	
	private JobRepository repository;
	
	public void addJob(JobPost job) {
		repository.addJob(job);
	}
	
	public List<JobPost> getAllJobs() {
		return null;
	}
}
