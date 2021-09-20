package com.htc.userservice.persistance;

import org.springframework.data.jpa.repository.JpaRepository;



public interface IUser  extends JpaRepository<IUser, Long>{
	
	

}
