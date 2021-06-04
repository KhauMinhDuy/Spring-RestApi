package com.khauminhduy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khauminhduy.model.Friend;
import com.khauminhduy.repository.FriendRepository;
import com.khauminhduy.service.FriendService;

@Service
public class FriendServiceImpl implements FriendService {

	@Autowired
	private FriendRepository friendRepository;
	
	@Override
	public List<Friend> lists() {
		return friendRepository.findAll();
	}

	@Override
	public Friend get(Long id) {
		return friendRepository.getOne(id);
	}

	@Override
	public Friend save(Friend friend) {
		return friendRepository.saveAndFlush(friend);
	}

	@Override
	public void delete(Long id) {
		friendRepository.deleteById(id);
	}

	@Override
	public List<Friend> findByFirstNameAndLastName(String firstName, String lastName) {
		return friendRepository.findByFirstNameAndLastName(firstName, lastName);
	}

	@Override
	public List<Friend> findByFirstName(String firstname) {
		return friendRepository.findByFirstName(firstname);
	}

	@Override
	public List<Friend> findByLastName(String lastName) {
		return friendRepository.findByLastName(lastName);
	}

}
