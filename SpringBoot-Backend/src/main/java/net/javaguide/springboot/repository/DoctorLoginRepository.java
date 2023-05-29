package net.javaguide.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguide.springboot.model.Doctors;





public interface DoctorLoginRepository extends JpaRepository<Doctors, Integer>{

	


	Doctors findByEmailAndPassword(String email, String password);

}
