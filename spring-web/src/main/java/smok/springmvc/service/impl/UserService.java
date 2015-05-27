package smok.springmvc.service.impl;

import java.util.Random;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import smok.springmvc.dao.IUserDao;
import smok.springmvc.dao.impl.UserDao;
import smok.springmvc.model.tmodel.User;
import smok.springmvc.service.IUserService;
import smok.springmvc.utils.StringUtil;

public class UserService implements IUserService {

	private static IUserDao userDao;

	@Override
	public User getUser() {
		return null;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	private static ApplicationContext ac;
	static {
		ac = new ClassPathXmlApplicationContext("configs/spring-config.xml");
	}

	public static void main(String[] args) {
		System.out.println(1111);
		// User user = userDao.getUserById(1L);

//		for (int i = 0; i < 10; i++) {
//			User user = new User();
//			user.setName("test_" + i + "_" + StringUtil.getRandomString(5));
//			user.setAge(RandomUtils.nextInt(25));
//			user.setSex(RandomUtils.nextInt(2));
//			user.setAddress(StringUtil.getRandomString(20));
//			userDao.insertUser(user);
//
//		}
		
		//userDao.deleteUser(1L);
		
		User user = userDao.getUserById(2L);
		if(user!=null){
			user.setName("updateanem");
			user.setAge(100);
			user.setSex(0);
			user.setAddress(StringUtil.getRandomString(10));
			user.setComment("for update");
			userDao.updateUser(user);
		}
	}
}
