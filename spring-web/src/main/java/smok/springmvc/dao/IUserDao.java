package smok.springmvc.dao;

import smok.springmvc.model.tmodel.User;

public interface IUserDao {

	public User getUserById(long id);
	
	public void insertUser(User user);
	
	public void deleteUser(long id);
	
	public void updateUser(User user);
}
