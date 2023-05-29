package net.javaguide.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguide.springboot.model.Appoinment;
import net.javaguide.springboot.repository.AppoinmentRepository;


@Service
public class AppoinmentServiceImpl implements AppoinmentService {

	@Autowired
	private AppoinmentRepository appoinmentRepository;

	@Override
	public Appoinment saveBooking(Appoinment booking) {
		return  appoinmentRepository.save(booking);
	}
	
	@Override
	public List<Appoinment> getAllBooking(){
		return appoinmentRepository.findAll();
	}
	
	@Override
	public Appoinment geta_id(int a_id) {
		return appoinmentRepository.findById(a_id).get();
	}
	
	@Override
	public void deletea_id(Integer a_id) {
		appoinmentRepository.deleteById(a_id);
	}
	
	
}
