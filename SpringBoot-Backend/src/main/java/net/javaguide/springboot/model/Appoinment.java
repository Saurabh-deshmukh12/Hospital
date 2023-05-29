package net.javaguide.springboot.model;

import java.sql.Date;
import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Appoinment")
public class Appoinment {
			
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int a_id;
	@Column(name = "Date")
		private Date date;
	@Column(name = "Time")
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
		private Time time;
	@Column(name = "Slot")
		private String slot;
	
	@OneToOne
	@JoinColumn(name = "id")
	private Register id;
	
//	@OneToOne
//	@JoinColumn(name = "name")
//	private Register name;
//	
//	@OneToOne
//	@JoinColumn(name = "number")
//	private Register number;
	
	
	public Appoinment() {
		
	}


	public int getA_id() {
		return a_id;
	}


	public void setA_id(int a_id) {
		this.a_id = a_id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Time getTime() {
		return time;
	}


	public void setTime(Time time) {
		this.time = time;
	}


	public String getSlot() {
		return slot;
	}


	public void setSlot(String slot) {
		this.slot = slot;
	}


	public Register getId() {
		return id;
	}


	public void setId(Register id) {
		this.id = id;
	}


//	public Register getNmae() {
//		return name;
//	}
//
//
//	public void setNmae(Register name) {
//		this.nmae = name;
//	}
//
//
//	public Register getNumber() {
//		return number;
//	}
//
//
//	public void setNumber(Register number) {
//		this.number = number;
//	}
	
}
