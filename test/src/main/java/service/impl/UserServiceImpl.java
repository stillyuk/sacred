package service.impl;

import service.UserService;
import dao.UserDao;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public boolean login(String userid, String username) {
		return userDao.login(userid, username);
	}
	
}
