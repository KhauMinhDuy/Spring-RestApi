package com.khauminhduy.service;

import java.util.List;

import com.khauminhduy.model.Friend;

public interface FriendService {

	List<Friend> lists();
	
	Friend get(Long id);
	
	Friend save(Friend friend);
	
	void delete(Long id);
	
}
