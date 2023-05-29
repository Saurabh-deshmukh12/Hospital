package net.javaguide.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.javaguide.springboot.model.Register;


public interface RegisterRepository extends JpaRepository<Register,Integer>{
	
	
}
