package net.javaguide.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import net.javaguide.springboot.model.CheckUP;



public interface CheckUpRepository  extends  JpaRepository<CheckUP,Integer>{

}
