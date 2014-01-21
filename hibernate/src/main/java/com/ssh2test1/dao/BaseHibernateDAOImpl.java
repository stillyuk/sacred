package com.ssh2test1.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hibtest1.entity.Question;

public class BaseHibernateDAOImpl extends HibernateDaoSupport implements BaseHibernateDAO {
	@SuppressWarnings("rawtypes")
	public List search(final Question condition) {
		return super.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Criteria c = session.createCriteria(Question.class);
				if (condition != null) {
					if (condition.getQid() != null) {
						c.add(Restrictions.eq("qid", condition.getQid()));
					}
				}
				return c.list();
			}
		});
	}
}