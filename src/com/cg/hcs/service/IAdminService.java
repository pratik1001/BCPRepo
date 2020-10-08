package com.cg.hcs.service;

import java.util.List;

import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.Test;

public interface IAdminService 
{
	public String addCenter(DiagnosticCenter center);
	
	public List<DiagnosticCenter> viewAllCenters();
	
	public String addTest(Test test);
	
	
}
