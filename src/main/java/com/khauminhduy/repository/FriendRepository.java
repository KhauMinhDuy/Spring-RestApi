package com.khauminhduy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khauminhduy.model.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {

}
