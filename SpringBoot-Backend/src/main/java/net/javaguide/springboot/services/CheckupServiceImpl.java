package net.javaguide.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguide.springboot.model.CheckUP;

import net.javaguide.springboot.repository.CheckUpRepository;

@Service
public class CheckupServiceImpl implements CheckupService{
	
	@Autowired
	private CheckUpRepository checkUpRepository;

	@Override
	public CheckUP saveDetails(CheckUP details) {
		return  checkUpRepository.save(details);
	}
	
	@Override
	public List<CheckUP> getAllDetails(){
		return checkUpRepository.findAll();
	}
	
	@Override
	public CheckUP getc_id(int c_id) {
		return checkUpRepository.findById(c_id).get();
	}
	
	@Override
	public void deletec_id(Integer c_id) {
		checkUpRepository.deleteById(c_id);
	}

}
