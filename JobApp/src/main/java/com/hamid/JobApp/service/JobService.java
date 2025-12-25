package com.hamid.JobApp.service;

import com.hamid.JobApp.model.JobPost;
import com.hamid.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost post){
        repo.addJob(post);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
}
