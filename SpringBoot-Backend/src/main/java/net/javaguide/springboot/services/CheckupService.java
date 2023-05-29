package net.javaguide.springboot.services;

import java.util.List;

import net.javaguide.springboot.model.CheckUP;


public interface CheckupService {
		
	public CheckUP saveDetails(CheckUP details);
	public List<CheckUP> getAllDetails();
	public CheckUP getc_id(int c_id);
	public void deletec_id(Integer c_id);
	

	

}
