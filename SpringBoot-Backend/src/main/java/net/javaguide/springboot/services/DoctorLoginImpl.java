package net.javaguide.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguide.springboot.model.Doctors;
import net.javaguide.springboot.repository.DoctorLoginRepository;




@Service
public class DoctorLoginImpl implements DoctorLoginService{
	
	@Autowired
	private DoctorLoginRepository loginrepository;

	@Override
	public Doctors authenticateDoctor(String email,String password) {
		
		Doctors a=loginrepository.findByEmailAndPassword(email, password);
			
		System.out.println(a);
		return a;
	}
	
	
}
