package com.cg.hcs.service;



import com.cg.hcs.entity.DiagnosticCenter;

import com.cg.hcs.entity.Users;

public interface IUserService {
	
	

	public String makeAppointment(Users user, DiagnosticCenter test, String datetime);

	
	public String register(Users user);
	
	public boolean validateUser(String userId, String password);
	
	public String getRoleCode(String userId);

}
