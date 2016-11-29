package test;

import model.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.IUserDao;

public class test {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("spring-bean.xml");
		IUserDao userDao=(IUserDao) context.getBean("userDao");
		userDao.addUser(new User());
	}
}
