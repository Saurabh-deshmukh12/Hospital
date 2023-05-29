package net.javaguide.springboot.services;

import net.javaguide.springboot.model.Doctors;

public interface DoctorLoginService {

	Doctors authenticateDoctor(String email,String password);
}
