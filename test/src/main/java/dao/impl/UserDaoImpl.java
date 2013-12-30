package dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import dao.UserDao;
import domain.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("rawtypes")
	public boolean login(String userid, String username) {
		Session session = sessionFactory.openSession();
		Criteria c = session.createCriteria(User.class);
		List lists = c.list();
		session.close();
		if (lists.size() == 1) {
			return true;
		}
		return false;
	}
}
