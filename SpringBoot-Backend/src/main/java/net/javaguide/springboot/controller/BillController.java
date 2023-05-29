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

import net.javaguide.springboot.model.Appoinment;
import net.javaguide.springboot.model.Bill;
import net.javaguide.springboot.services.AppoinmentService;
import net.javaguide.springboot.services.BillService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/bill")

public class BillController {

	
	@Autowired
	private BillService billService;

	@PostMapping("/add")
	public String add(@RequestBody Bill amount) {
		billService.saveAmount(amount);
		return "Bill Save";
		
	}
	
	@GetMapping("/getall")
	public List<Bill> getAllAmount(){
		return billService.getAllAmount();
	}
	
	@GetMapping("/getid/{id}")
	public ResponseEntity<Bill> getb_id(@PathVariable Integer b_id){
		try {
			Bill bill= billService.getb_id(b_id);
			return new ResponseEntity<Bill>(bill,HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<Bill>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteb_id(@PathVariable Integer b_id) {
		billService.deleteb_id(b_id);
		return "Deleted Bill of id : "+b_id;
	}
}
