package com.xrjj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xrjj.entity.User;
import com.xrjj.mapper.UserMapper;
import com.xrjj.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getById(String id) {		
		return userMapper.selectById(id);
	}

	@Override
	public List<User> list(User user) {		
		QueryWrapper<User> wrapper = new QueryWrapper<>(user);
		return userMapper.selectList(wrapper);
	}

	@Override
	public void delete(String id) {		
		userMapper.deleteById(id);
	}

	@Override
	public void updateById(User user) {
		userMapper.updateById(user);
	}

	@Override
	public void insert(User user) {
		userMapper.insert(user);		
	}
	
}
