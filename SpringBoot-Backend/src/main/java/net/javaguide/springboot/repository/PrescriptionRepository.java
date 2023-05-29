package net.javaguide.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguide.springboot.model.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {

	
	
}
