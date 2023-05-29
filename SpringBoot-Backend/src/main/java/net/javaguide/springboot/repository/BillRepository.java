package net.javaguide.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguide.springboot.model.Bill;


public interface BillRepository extends  JpaRepository<Bill,Integer>{

}
