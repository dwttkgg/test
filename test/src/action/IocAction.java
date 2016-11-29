package action;

import model.User;
import dao.IUserDao;

public class IocAction {
	private IUserDao userDao;
	public IocAction(){}
	public IocAction(IUserDao userDao){
		super();
		//System.out.println("sssssssssss");
		this.userDao =userDao;
	}
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	public String execute(){
		userDao.addUser(new User());
		return "success";
	}
}
