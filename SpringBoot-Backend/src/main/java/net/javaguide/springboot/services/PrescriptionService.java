package net.javaguide.springboot.services;

import java.util.List;

import net.javaguide.springboot.model.Prescription;

public interface PrescriptionService {

	public Prescription saveInfo(Prescription info);	
	public List<Prescription> getAllInfo();
	public Prescription getp_id(int p_id);
	public void deletep_id(Integer p_id);

}
