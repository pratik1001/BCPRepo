package com.cg.hcs.service;

import com.cg.hcs.dao.AdminDAOImpl;
import com.cg.hcs.dao.IAdminDAO;
import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.Test;
import com.cg.hcs.exception.HCSException;

public class AdminServiceImpl implements IAdminService 
{

	@Override
	public String addCenter(DiagnosticCenter center) 
	{
		IAdminDAO adminDAO = new AdminDAOImpl();
		
		try 
		{
			return adminDAO.addCenter(center);
		} 
		catch (HCSException e) 
		{
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	@Override
	public boolean deleteCenter(DiagnosticCenter center) throws HCSException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String addTest(Test test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeTest(Test test) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean approveAppointment() {
		// TODO Auto-generated method stub
		return false;
	}

}
