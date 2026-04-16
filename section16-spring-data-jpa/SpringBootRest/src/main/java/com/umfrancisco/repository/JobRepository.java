package com.umfrancisco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.umfrancisco.model.JobPost;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {
	
	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}
