package com.khauminhduy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khauminhduy.model.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {

	List<Friend> findByFirstNameAndLastName(String firstName, String lastName);
	
	List<Friend> findByFirstName(String firstname);
	
	List<Friend> findByLastName(String lastName);
	
	
}
