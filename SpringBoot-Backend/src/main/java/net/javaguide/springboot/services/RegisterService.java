package net.javaguide.springboot.services;

import java.util.List;

import net.javaguide.springboot.model.Register;

public interface RegisterService {

	public Register savePatient(Register patient);

	public List<Register> getAllPatiens();

	public Register getid(int id);

	public void deleteid(Integer id);
	



}
