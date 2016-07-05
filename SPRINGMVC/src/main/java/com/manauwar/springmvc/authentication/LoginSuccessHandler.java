package com.manauwar.springmvc.authentication;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;



public class LoginSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		System.out.println("Inside LoginSuccessHandler start");

		Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
    
		if (roles.contains("admin"))
		{
			System.out.println("Inside LoginSuccessHandler role admin");
			response.sendRedirect(request.getContextPath()+"/supersecured/superUser");
		}

		else if(roles.contains("user"))
		{
			System.out.println("Inside LoginSuccessHandler role user");
			response.sendRedirect(request.getContextPath() + "/secured/normalUser");
		}

		else 
		{
			System.out.println("Inside LoginSuccessHandler role others");
			response.sendRedirect(request.getContextPath() + "/login");
		}


		System.out.println("Inside LoginSuccessHandler end");

	}


}
