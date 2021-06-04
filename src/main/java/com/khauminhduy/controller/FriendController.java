package com.khauminhduy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khauminhduy.model.Friend;
import com.khauminhduy.service.FriendService;

@RestController
@RequestMapping(value = {"/api/friend"})
public class FriendController {

	@Autowired
	private FriendService friendService;
	
	@GetMapping(value = {""})
	public List<Friend> getLists() {
		return friendService.lists();
	}

	@PostMapping(value = {""})
	public Friend create(@RequestBody Friend friend) {
		return friendService.save(friend);
	}
	
	@PutMapping(value = {""})
	public Friend update(@RequestBody Friend friend) {
		return friendService.save(friend);
	}
	
	@DeleteMapping(value = {"{id}"})
	public void delete(@PathVariable(value = "id") String id) {
		friendService.delete(Long.parseLong(id));
	}
}
