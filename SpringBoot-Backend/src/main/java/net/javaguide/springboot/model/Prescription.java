package net.javaguide.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Prescription")
public class Prescription {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int p_id;
		@Column(name = "Medecin")
		private String medecin;
		@Column(name = "Medecin1")
		private String medecin1;
		@Column(name = "Medecin2")
		private String medecin2;
		@Column(name = "Medecin3")
		private String medecin3;
		
		public Prescription() {
			// TODO Auto-generated constructor stub
		}
	
		public int getP_id() {
			return p_id;
		}
		public void setP_id(int p_id) {
			p_id = this.p_id;
		}
		public String getMedecin() {
			return medecin;
		}
		public void setMedecin(String medecin) {
			this.medecin = medecin;
		}
		public String getMedecin1() {
			return medecin1;
		}
		public void setMedecin1(String medecin1) {
			this.medecin1 = medecin1;
		}
		public String getMedecin2() {
			return medecin2;
		}
		public void setMedecin2(String medecin2) {
			this.medecin2 = medecin2;
		}
		public String getMedecin3() {
			return medecin3;
		}
		public void setMedecin3(String medecin3) {
			this.medecin3 = medecin3;
		}
		
		
		
		
		
		
		
}
