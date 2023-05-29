package net.javaguide.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguide.springboot.model.Prescription;

import net.javaguide.springboot.repository.PrescriptionRepository;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {
			
	@Autowired
	private PrescriptionRepository prescriptionRepository;

	@Override
	public Prescription saveInfo(Prescription info) {
		return  prescriptionRepository.save(info);
	}
	
	@Override
	public List<Prescription> getAllInfo(){
		return prescriptionRepository.findAll();
	}
	
	@Override
	public Prescription getp_id(int p_id) {
		return prescriptionRepository.findById(p_id).get();
	}
	
	@Override
	public void deletep_id(Integer p_id) {
		prescriptionRepository.deleteById(p_id);
	}
	
}
