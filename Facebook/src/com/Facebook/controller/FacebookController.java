package com.Facebook.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FacebookController
 */
public class FacebookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FacebookController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	FacebookServiceInterface fs= FacebookService.createObject("fservice");
	
	FacebookEmployee fe=new FacebookEmployee();
	fe.setName("SreeHari");
	fe.setPassword("12345");
	fe.setEmail("gkhari@zensar.com");
	fe.setAddress("adoni");
	int i=fs.createProfile(fe);
		fs.createProfile();
	}

}
