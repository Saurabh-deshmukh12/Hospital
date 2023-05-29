package net.javaguide.springboot.services;

import java.util.List;

import net.javaguide.springboot.model.Doctors;



public interface DoctorService {
	
	public Doctors saveDoctor(Doctors doctor);
	public List<Doctors> getAllDoctor();
	public Doctors getId(int id);
	public void deleteId(Integer customer_id);
	


}
