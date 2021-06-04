package com.khauminhduy.service;

import java.util.List;

import com.khauminhduy.model.Friend;

public interface FriendService {

	List<Friend> lists();
	
	Friend get(Long id);
	
	List<Friend> findByFirstNameAndLastName(String firstName, String lastName);
	
	List<Friend> findByFirstName(String firstname);
	
	List<Friend> findByLastName(String lastName);
	
	Friend save(Friend friend);
	
	void delete(Long id);
	
}
