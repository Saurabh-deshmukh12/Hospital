package net.javaguide.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import net.javaguide.springboot.model.Appoinment;

public interface AppoinmentRepository extends JpaRepository<Appoinment, Integer> {

}
