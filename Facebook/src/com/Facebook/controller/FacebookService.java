package com.Facebook.controller;

public class FacebookService implements FacebookServiceInterface 
{

	public static FacebookServiceInterface createObject(String string) {
		// TODO Auto-generated method stub
		return new FacebookService();
	}

	public int createProfile(FacebookEmployee fe)
	
	{
	FacebookDAOInterface fd= FacebookDAO.createObjectDAO("facebook");
	
	return fd.createProfileDAO(fe);
			
		
	}

	public void createProfile() {
		// TODO Auto-generated method stub
		
	}

}
