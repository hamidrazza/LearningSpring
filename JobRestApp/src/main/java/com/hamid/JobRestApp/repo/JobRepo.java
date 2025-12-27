package com.hamid.JobRestApp.repo;

import com.hamid.JobRestApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {
    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}

/*
public void addJob(JobPost post) {
    jobs.add(post);
    System.out.println();
}

public List<JobPost> getAllJobs(){
    return jobs;
}

public JobPost getJob(int postId) {
    for (JobPost job : jobs){
        if(job.getPostId() == postId){
            return job;
        }
    }
    return null;
}

public void updateJob(JobPost jobPost) {
    for (JobPost jobPost1 : jobs){
        if(jobPost1.getPostId() == jobPost.getPostId()){
            jobPost1.setPostProfile(jobPost.getPostProfile());
            jobPost1.setPostDesc(jobPost.getPostDesc());
            jobPost1.setReqExperience(jobPost.getReqExperience());
            jobPost1.setPostTechStack(jobPost.getPostTechStack());
        }
    }
}

public void deleteJob(int postId) {
    for (JobPost jobPost : jobs){
        if(jobPost.getPostId() == postId){
            jobs.remove(jobPost);
        }
    }
}*/
