package com.cg.hcs.dao;


import com.cg.hcs.entity.Users;
import java.time.LocalDateTime;


import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.Test;
import com.cg.hcs.entity.Users;

public interface IUserDAO {

	public String register(Users user);
	
	public String getRoleCode(String userName,String password);
	


	String makeAppointment(Users user, DiagnosticCenter test, String datetime);

}

