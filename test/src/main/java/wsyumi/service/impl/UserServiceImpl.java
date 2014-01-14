package  wsyumi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import wsyumi.dao.UserDao;
import wsyumi.domain.User;
import wsyumi.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public boolean login(User user) {
		userDao.transaction("insert into user(userid, username, password) values('11', '1', '1')");
//		userDao.transaction("xxx");
		return true;
	}

	public boolean registe(User user) {
		return userDao.registe(user);
	}
}