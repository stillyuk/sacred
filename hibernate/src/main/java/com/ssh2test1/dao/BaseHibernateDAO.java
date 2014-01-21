package com.ssh2test1.dao;

import java.util.List;

import com.hibtest1.entity.Question;;

public interface BaseHibernateDAO {
	public List search(Question condition);

}
