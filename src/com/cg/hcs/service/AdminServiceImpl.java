package com.cg.hcs.service;

import com.cg.hcs.dao.AdminDAOImpl;
import com.cg.hcs.dao.IAdminDAO;
import com.cg.hcs.entity.DiagnosticCenter;
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

}
