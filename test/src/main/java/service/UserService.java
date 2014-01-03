package service;

import domain.User;

public interface UserService {
	boolean login(User user);
	boolean registe(User user);
}
