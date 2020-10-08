package com.cg.hcs.service;

import java.time.LocalDateTime;

import com.cg.hcs.dao.IUserDAO;
import com.cg.hcs.dao.UserDAOImpl;
import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.Test;
import com.cg.hcs.entity.Users;

public class UserServiceImpl implements IUserService{
	IUserDAO userDaoInterface = new UserDAOImpl();
	

	public String makeAppointment(Users user, DiagnosticCenter test, String datetime) {
		return userDaoInterface.makeAppointment(user, test, datetime);
	}
	public String register(Users user) {
		return userDaoInterface.register(user);
	}
	public String getRoleCode(String userName, String password) {
		// TODO Auto-generated method stub
		return userDaoInterface.getRoleCode(userName, password);
	}
}