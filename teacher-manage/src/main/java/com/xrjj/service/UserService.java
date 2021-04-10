package com.xrjj.service;

import java.util.List;

import com.xrjj.entity.User;

public interface UserService {

	User getById(String id);

	List<User> list(User user);

	void delete(String id);

	void updateById(User user);

	void insert(User user);

}
