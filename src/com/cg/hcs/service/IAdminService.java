package com.cg.hcs.service;

import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.Test;
import com.cg.hcs.exception.HCSException;

public interface IAdminService 
{
	public String addCenter(DiagnosticCenter center);
	
	public boolean deleteCenter(DiagnosticCenter center) throws HCSException;
	
	String addTest(Test test);

	boolean removeTest(Test test);

	boolean approveAppointment();
	
}
