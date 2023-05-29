package net.javaguide.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguide.springboot.model.Doctors;



public interface DoctorsRipository extends JpaRepository<Doctors, Integer>{

	
}