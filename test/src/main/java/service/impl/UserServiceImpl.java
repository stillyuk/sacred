package service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import service.UserService;
import dao.UserDao;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public boolean login(String username, String password) {
		return userDao.login(username, password);
	}
	
	public boolean registe(String username, String password) {
		return userDao.registe(username, password);
	}
}
