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

import net.javaguide.springboot.model.CheckUP;

import net.javaguide.springboot.services.CheckupService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/checkup")
public class CheckUPController {

	

	@Autowired
	private CheckupService checkupService;

	@PostMapping("/add")
	public String add(@RequestBody CheckUP details) {
		checkupService.saveDetails(details);
		return "Details Save";
		
	}
	
	@GetMapping("/getall")
	public List<CheckUP> getAllPatient(){
		return checkupService.getAllDetails();
	}
	
	@GetMapping("/getid/{id}")
	public ResponseEntity<CheckUP> getc_id(@PathVariable Integer c_id){
		try {
			CheckUP checkup= checkupService.getc_id(c_id);
			return new ResponseEntity<CheckUP>(checkup,HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<CheckUP>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deletec_id(@PathVariable Integer c_id) {
		checkupService.deletec_id(c_id);
		return "Deleted Details of id : "+c_id;
	}
}
