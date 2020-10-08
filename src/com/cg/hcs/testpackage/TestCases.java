package com.cg.hcs.testpackage;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;


import com.cg.hcs.entity.DiagnosticCenter;

import com.cg.hcs.service.AdminServiceImpl;
import com.cg.hcs.service.IAdminService;

public class TestCases {

	
	
	@Test
	public void testAddCenter()
	{
		IAdminService adminService = new AdminServiceImpl();
		DiagnosticCenter center = new DiagnosticCenter("Sample Diagnostic Center");
		String centerId = adminService.addCenter(center);
		assertNotNull(centerId);
	}
}
