package dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import dao.UserDao;
import domain.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("rawtypes")
	public boolean login(String username, String password) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria c = session.createCriteria(User.class);
		Criterion username0 = Restrictions.eq("username", username);
		Criterion password0 = Restrictions.eq("password", password);
		c.add(username0);
		c.add(password0);
		List lists = c.list();
		tx.commit();
		session.close();
		if (lists.size() == 1) {
			return true;
		}
		return false;
	}
}
