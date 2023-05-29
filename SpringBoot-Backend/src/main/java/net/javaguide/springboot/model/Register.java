package net.javaguide.springboot.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Registers")
public class Register {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Column(name = "Name")
		private String name;
		@Column(name = "Address")
		private String address;
		@Column(name = "Email_Id",unique=true,length=24)
		private String email;
		@Column(name = "Number")
		private long number;
		@Column(name = "Age")
		private int age;
		
		@Column(name = "gender")
		private String gender;
		@Column(name = "Password" ,unique=true,length=24)
		private String password;
		
		public Register() {
			// TODO Auto-generated constructor stub
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getNumber() {
			return number;
		}
		public void setNumber(long number) {
			this.number = number;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

	
		
		
}
		
		
		
		
		
	


