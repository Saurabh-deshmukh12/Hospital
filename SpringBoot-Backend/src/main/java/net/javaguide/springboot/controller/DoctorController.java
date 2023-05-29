package net.javaguide.springboot.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguide.springboot.model.Doctors;
import net.javaguide.springboot.services.DoctorService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/doctor")

public class DoctorController {
	@Autowired
	private DoctorService doctorservice;
	
	@PostMapping("/add")
	public String add(@RequestBody Doctors  doctor) {
		doctorservice.saveDoctor(doctor);
		return "doctor saved.";
	}
	
	@GetMapping("/getall")
	public List<Doctors> getAllDoctors(){
		return doctorservice.getAllDoctor();
	}
	
	@GetMapping("/getbyid/{customer_id}")
	public ResponseEntity<Doctors> getID(@PathVariable Integer id){
		try {
			Doctors doctors = doctorservice.getId(id);
			return new ResponseEntity<Doctors>(doctors, HttpStatus.OK);
		}
		catch(NoSuchElementException e){
			return new ResponseEntity<Doctors>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteId(@PathVariable Integer id) {
		doctorservice.deleteId(id);
		return "Deleted doctor of id : "+id ;
	}

}
