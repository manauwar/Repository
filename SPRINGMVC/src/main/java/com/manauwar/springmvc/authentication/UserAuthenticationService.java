package com.manauwar.springmvc.authentication;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class UserAuthenticationService implements UserDetailsService {
	
	

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		
System.out.println("Inside UserAuthenticationService");
		
		if(username.equals("admin")){
			System.out.println("Inside UserAuthenticationService username: admin");
			return new User("admin", "password", true, true, true, true, AuthorityUtils.createAuthorityList("admin"));
        }
		else if(username.equals("user")){
			System.out.println("Inside UserAuthenticationService username: user");
			return new User("user", "password", true, true, true, true, AuthorityUtils.createAuthorityList("user"));
        }
		else
		{
			System.out.println("Inside UserAuthenticationService username: other");
			 throw new UsernameNotFoundException(username + " not found");
		}
		
		
		
	}
}
