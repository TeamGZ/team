package com.team.service.impl;

import java.util.List;

import com.team.dao.UserDao;
import com.team.entity.User;
import com.team.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public int countAll() {
		return this.userDao.countAll();
	}

	public int delete(String userName) {
		return this.userDao.delete(userName);
	}

	public User findByUserName(String userName) {
		return this.userDao.findByUserName(userName);
	}

	public int insert(User user) {
		return this.userDao.insert(user);
	}

	public List<User> selectAll() {
		return this.userDao.selectAll();
	}

	public int update(User user) {
		return this.userDao.update(user);
	}

}
