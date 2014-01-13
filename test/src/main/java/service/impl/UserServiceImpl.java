package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.UserService;
import dao.UserDao;
import domain.User;

@Component
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public boolean login(User user) {
		return userDao.login(user);
	}
	
	public boolean registe(User user) {
		return userDao.registe(user);
	}
}
