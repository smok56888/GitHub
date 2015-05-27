package smok.springmvc.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import smok.springmvc.dao.IUserDao;
import smok.springmvc.model.tmodel.User;

public class UserDao implements IUserDao {

	private SqlSessionTemplate sessionTemplate;

	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}

	@Override
	public User getUserById(long id) {
		return sessionTemplate.selectOne("UserMapper.getUserById", id);
	}

	@Override
	public void insertUser(User user) {
		int code = sessionTemplate.insert("UserMapper.insertUser", user);
		System.out.println("insert code : " + code);
	}

	@Override
	public void deleteUser(long id) {
		int code = sessionTemplate.delete("UserMapper.deleteUser", id);
		System.out.println("delete code : " + code);

	}

	@Override
	public void updateUser(User user) {
		int code = sessionTemplate.update("UserMapper.updateUser", user);
		System.out.println("update code : " + code);
	}

}
