package net.javaguide.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import net.javaguide.springboot.model.Register;

public interface LoginRepository extends JpaRepository<Register, Integer> {

	Register findByEmailAndPassword(String email,String password);
}
