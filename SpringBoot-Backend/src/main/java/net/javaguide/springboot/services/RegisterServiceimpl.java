package net.javaguide.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguide.springboot.model.Register;
import net.javaguide.springboot.repository.RegisterRepository;

@Service
public class RegisterServiceimpl implements RegisterService {

	@Autowired
	private RegisterRepository registerrepository;

	@Override
	public Register savePatient(Register patient) {
		return registerrepository.save(patient);
	}

	@Override
	public List<Register> getAllPatiens() {
		return registerrepository.findAll();
	}

	@Override
	public Register getid(int id) {
		return registerrepository.findById(id).get();
	}

	@Override
	public void deleteid(Integer id) {
		registerrepository.deleteById(id);
	}

	
}
