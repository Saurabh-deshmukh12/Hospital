package net.javaguide.springboot.services.login;

import net.javaguide.springboot.model.Register;

public interface LoginService {

		public Register authenticateRegister(String email,String number);

		
	
}


