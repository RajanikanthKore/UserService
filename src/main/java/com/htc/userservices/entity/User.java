package com.htc.userservices.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="Users")
public class User {
	@Column
	private Long userName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long phoneNumber;
	@Column
	private String emailAddress;
	@Column 
	private String age;
	@Column 
	private String gender;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Long userName, Long phoneNumber, String emailAddress, String age, String gender) {
		super();
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.age = age;
		this.gender = gender;
	}

	public Long getUserName() {
		return userName;
	}

	public void setUserName(Long userName) {
		this.userName = userName;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(phoneNumber, other.phoneNumber);
	}

	@Override
	public String toString() {
		return "Users [userName=" + userName + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress
				+ ", age=" + age + ", gender=" + gender + "]";
	}

	public User get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
