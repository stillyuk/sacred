package dao;

import domain.User;

public interface UserDao {
	boolean login(User user);
	boolean registe(User user);
}
