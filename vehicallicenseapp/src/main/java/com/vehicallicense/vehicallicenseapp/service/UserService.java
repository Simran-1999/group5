package com.vehicallicense.vehicallicenseapp.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicallicense.vehicallicenseapp.entity.User;
import com.vehicallicense.vehicallicenseapp.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	public User creatUser(User user) {
		
		return userRepo.save(user);
	}


	public User getUserById(int userId) {
		
		Optional<User> userContainer=userRepo.findById(userId);
		
		if(userContainer.isPresent()) {
			
			return userContainer.get();
		}
		else {
			return null;
		}
		
	}

	public String deleteUserById(int userId) {
		Optional<User> userContainer=userRepo.findById(userId);
		if(userContainer.isPresent()) {
			User oldObj=userContainer.get();
			userRepo.delete(oldObj);
		return "Deleted Successfully";
	}
		else {
			return "The spesified id is not present:"+userId;
		}
}

	public User updateUser(int userId, User obj) {
		
		Optional<User> userContainer=userRepo.findById(userId);
		if(userContainer.isPresent()) {
			User oldObj=userContainer.get();
			
			oldObj.setEmail(obj.getEmail());
			oldObj.setPassword(obj.getPassword());
		
			System.out.println("Successfully Updated!!");
			return userRepo.saveAndFlush(oldObj);
			
		}
		else
		{
			System.out.println("Successfully Inserted");
			return userRepo.save(obj);
		}
	}


	

}