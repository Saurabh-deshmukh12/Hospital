package net.javaguide.springboot.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Name",unique=true,length=45)
	private String name;
	@Column(name="Post",length=45)
	private String post;
	@Column(name="Email_id",unique=true,length=24)
	private String email;
	@Column(name="Number")
	private Long number;
//	@Column(name="Age")
//	private Integer age;
	@Column(name="Gender")
	private String gender;
	@Column(name="Address")
	private String address;
	@Column(name="Password",unique=true,length=20)
	private String password;
	
	
	public Doctors() {
		
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
	
	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getEmail_id() {
		return email;
	}
	public void setEmail_id(String email_id) {
		this.email = email_id;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

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
