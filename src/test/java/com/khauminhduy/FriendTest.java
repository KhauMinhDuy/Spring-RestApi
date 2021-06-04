package com.khauminhduy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.khauminhduy.model.Friend;
import com.khauminhduy.service.FriendService;

@SpringBootTest
class FriendTest {

	@Autowired
	private FriendService friendService;
	
	@Test
	void testList() {
		List<Friend> friends = friendService.lists();
		assertTrue(friends.size() > 0);
	}

}
