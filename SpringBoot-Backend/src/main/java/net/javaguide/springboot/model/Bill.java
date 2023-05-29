package net.javaguide.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Bill")
public class Bill {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int b_id;
	@Column(name = "M_Bill")
	private float m_bill;
	@Column(name = "D_Bill")
	private float d_bill;
	@Column(name = "Total")
	private float total;
	
	@OneToOne
	@JoinColumn(name = "id")
	private Register id;
	

	
	@OneToOne
	@JoinColumn(name = "a_id")
	private Appoinment a_id;

	public Bill() {
		
		// TODO Auto-generated constructor stub
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public float getM_bill() {
		return m_bill;
	}

	public void setM_bill(float m_bill) {
		this.m_bill = m_bill;
	}

	public float getD_bill() {
		return d_bill;
	}

	public void setD_bill(float d_bill) {
		this.d_bill = d_bill;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Register getId() {
		return id;
	}

	public void setId(Register id) {
		this.id = id;
	}

	public Appoinment getA_id() {
		return a_id;
	}

	public void setA_id(Appoinment a_id) {
		this.a_id = a_id;
	}

//	public Register getNmae() {
//		return nmae;
//	}
//
//	public void setNmae(Register nmae) {
//		this.nmae = nmae;
//	}

//	public Appoinment getDate() {
//		return date;
//	}
//
//	public void setDate(Appoinment date) {
//		this.date = date;
//	}
	
	
	
}
