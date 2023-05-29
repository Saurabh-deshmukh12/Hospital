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


import net.javaguide.springboot.model.Prescription;

import net.javaguide.springboot.services.PrescriptionService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/prescription")

public class PrescriptionController {


	@Autowired
	private PrescriptionService prescriptionService;

	@PostMapping("/add")
	public String add(@RequestBody Prescription info) {
		prescriptionService.saveInfo(info);
		return "Prescription Save";
		
	}
	
	@GetMapping("/getall")
	public List<Prescription> getAllInfo(){
		return prescriptionService.getAllInfo();
	}
	
	@GetMapping("/getid/{id}")
	public ResponseEntity<Prescription> getp_id(@PathVariable Integer p_id){
		try {
			Prescription precritption= prescriptionService.getp_id(p_id);
			return new ResponseEntity<Prescription>(precritption,HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<Prescription>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deletep_id(@PathVariable Integer p_id) {
		prescriptionService.deletep_id(p_id);
		return "Deleted Details of id : "+p_id;
	}

}
