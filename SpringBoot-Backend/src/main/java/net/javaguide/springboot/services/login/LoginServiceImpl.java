package net.javaguide.springboot.services.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguide.springboot.model.Register;
import net.javaguide.springboot.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

		@Autowired
		private LoginRepository loginrepository;

		@Override
		public Register authenticateRegister(String email,String password) {
			
			Register a=loginrepository.findByEmailAndPassword(email, password);
				
			System.out.println(a);
			return a;
		}
		
		
	}

