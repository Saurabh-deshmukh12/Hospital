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


import net.javaguide.springboot.model.Register;
import net.javaguide.springboot.repository.CheckUpRepository;
import net.javaguide.springboot.repository.PrescriptionRepository;
import net.javaguide.springboot.repository.RegisterRepository;
import net.javaguide.springboot.services.RegisterService;

//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/patient")

public class RegisterController {
	
	
		@Autowired
		private RegisterService registerservice;
	
		@PostMapping("/add")
		public String add(@RequestBody Register patient) {
			registerservice.savePatient(patient);
			return "Patient Save";
			
		}
		
		@GetMapping("/getall")
		public List<Register> getAllPatients(){
			return registerservice.getAllPatiens();
		}
		
		@GetMapping("/getid/{id}")
		public ResponseEntity<Register> getid(@PathVariable Integer id){
			try {
				Register register= registerservice.getid(id);
				return new ResponseEntity<Register>(register,HttpStatus.OK);
			}
			catch(NoSuchElementException e) {
				return new ResponseEntity<Register>(HttpStatus.NOT_FOUND);
			}
		}
		
		@DeleteMapping("/deletebyid/{id}")
		public String deleteid(@PathVariable Integer id) {
			registerservice.deleteid(id);
			return "Deleted customer of id : "+id;
		}
}
