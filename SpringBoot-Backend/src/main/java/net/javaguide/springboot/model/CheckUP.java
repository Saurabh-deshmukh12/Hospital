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
@Table(name="CheckUp")
public class CheckUP {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
	@Column(name = "BP")
	private float bp;
	@Column(name = "Temp")
	private float temp;
	@Column(name = "Weight")
	private float weight;
	@Column(name = "Test_Report")
	private String test_report;
	
	@OneToOne
	@JoinColumn(name = "id")
	private Register id;
	
	@OneToOne
	@JoinColumn(name = "p_id")
	private Prescription p_id;
	
	public CheckUP() {
		// TODO Auto-generated constructor stub
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public float getBP() {
		return bp;
	}

	public void setBP(float bP) {
		this.bp = bP;
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getTest_report() {
		return test_report;
	}

	public void setTest_report(String test_report) {
		this.test_report = test_report;
	}

	public Register getId() {
		return id;
	}

//	public void setId(Register id) {
//		this.id = id;
//	}
//
//	public Prescription getP_id() {
//		return p_id;
//	}
//
//	public void setP_id(Prescription p_id) {
//		this.p_id = p_id;
//	}
//	
	
	
	
	
	
 }
