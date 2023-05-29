package net.javaguide.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguide.springboot.model.Bill;
import net.javaguide.springboot.repository.BillRepository;


@Service
public class BillServiceImpl implements BillService{
	@Autowired
	private BillRepository billRepository;

	@Override
	public Bill saveAmount(Bill amount) {
		return  billRepository.save(amount);
	}
	
	@Override
	public List<Bill> getAllAmount(){
		return billRepository.findAll();
	}
	
	@Override
	public Bill getb_id(int p_id) {
		return billRepository.findById(p_id).get();
	}
	
	@Override
	public void deleteb_id(Integer b_id) {
		billRepository.deleteById(b_id);
	}
	

}
