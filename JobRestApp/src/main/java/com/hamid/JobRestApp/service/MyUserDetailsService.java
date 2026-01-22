package com.hamid.JobRestApp.service;

import com.hamid.JobRestApp.model.JobPost;
import com.hamid.JobRestApp.model.User;
import com.hamid.JobRestApp.model.UserPrincipal;
import com.hamid.JobRestApp.repo.JobRepo;
import com.hamid.JobRestApp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);

        if(user == null){
            System.out.println("USER 404");
            throw new UsernameNotFoundException("USER 404");
        }
        return new UserPrincipal(user);
    }
}
