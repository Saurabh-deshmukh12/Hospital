package net.javaguide.springboot.services;

import java.util.List;

import net.javaguide.springboot.model.Bill;


public interface BillService {
		
	public Bill saveAmount(Bill amount);	
	public List<Bill> getAllAmount();
	public Bill getb_id(int b_id);
	public void deleteb_id(Integer b_id);

}
