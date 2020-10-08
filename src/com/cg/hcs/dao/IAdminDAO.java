package com.cg.hcs.dao;

import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.exception.HCSException;

public interface IAdminDAO 
{
	public String addCenter(DiagnosticCenter center) throws HCSException;
}
