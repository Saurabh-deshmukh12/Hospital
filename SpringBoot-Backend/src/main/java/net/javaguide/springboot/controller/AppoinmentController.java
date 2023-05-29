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

import net.javaguide.springboot.services.AppoinmentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/appoinment")

public class AppoinmentController {

	@Autowired
	private AppoinmentService appoinmentService;

	@PostMapping("/add")
	public String add(@RequestBody Appoinment booking) {
		appoinmentService.saveBooking(booking);
		return "Appoinment Save";

	}

	@GetMapping("/getall")
	public List<Appoinment> getAllBooking() {
		return appoinmentService.getAllBooking();
	}

	@GetMapping("/getid/{id}")
	public ResponseEntity<Appoinment> geta_id(@PathVariable Integer a_id) {
		try {
			Appoinment appoinment = appoinmentService.geta_id(a_id);
			return new ResponseEntity<Appoinment>(appoinment, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Appoinment>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deletebyid/{id}")
	public String deletea_id(@PathVariable Integer a_id) {
		appoinmentService.deletea_id(a_id);
		return "Deleted Booking of id : " + a_id;
	}

}
