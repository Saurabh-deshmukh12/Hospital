package net.javaguide.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguide.springboot.model.Doctors;
import net.javaguide.springboot.repository.DoctorsRipository;



@Service
public class DoctorsServiceImplimentation implements DoctorService{
	@Autowired
	private DoctorsRipository doctorRepository;
	
	@Override
	public Doctors saveDoctor(Doctors doctor) {
		return doctorRepository.save(doctor);
	}
	
	@Override
	public List<Doctors> getAllDoctor() {
		return doctorRepository.findAll();
	}
	
	@Override
	public Doctors getId(int id) {
		return doctorRepository.findById(id).get();
	}
	
	@Override
	public void deleteId(Integer id) {
		doctorRepository.deleteById(id);
	}


}
