package com.in28minutes.login;

public class LoginService {
	
	public boolean isUserValid(String user, String password) {
		
		if(user.equals("filipe") && password.equals("123")) 
			return true;
		
		return false;
		
	}

}
