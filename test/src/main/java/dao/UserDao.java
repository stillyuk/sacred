package dao;

public interface UserDao {
	boolean login(String username, String password);
	boolean registe(String username, String password);
}
