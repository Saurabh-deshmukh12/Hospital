package net.javaguide.springboot.services;

import java.util.List;

import net.javaguide.springboot.model.Appoinment;

public interface AppoinmentService {

	public Appoinment saveBooking(Appoinment booking);	
	public List<Appoinment> getAllBooking();
	public Appoinment geta_id(int a_id);
	public void deletea_id(Integer a_id);
	

}
