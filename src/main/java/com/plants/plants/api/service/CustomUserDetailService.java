package com.plants.plants.api.service;

import com.plants.plants.api.entity.User;
import com.plants.plants.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);
        CustomUserDetails customUserDetails = null;

        if (user != null) {
            customUserDetails = new CustomUserDetails();
            customUserDetails.setUser(user);
        } else{
            throw new  UsernameNotFoundException("User Not found with name "+username);
        }
            return customUserDetails;

    }
}
