package com.cg.hcs.dao;

<<<<<<< HEAD
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.cg.hcs.entity.Users;
import com.cg.hcs.utility.JpaUtility;



public class UserDAOImpl implements IUserDAO{


	
	@Override
	public String register(Users user) {
		
		EntityManagerFactory factory = JpaUtility.getFactory();
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		
		
		try {
			manager.persist(user);
			transaction.commit();
		} catch (RuntimeException e) {
			//transaction.rollback();
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			manager.close();
			factory.close();
		}
		return user.getUserId();
	}
	
}
=======
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.Test;
import com.cg.hcs.entity.Users;
import com.cg.hcs.utility.JpaUtility;



public class UserDAOImpl implements IUserDAO{
	
	EntityManagerFactory factory = null;
	
	EntityManager manager = null;
	EntityTransaction transaction = null;


	
	@Override
	public String register(Users user) {
		
		factory = JpaUtility.getFactory();
		
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

		transaction.begin();
		
		
		try {
			manager.persist(user);
			transaction.commit();
		} catch (RuntimeException e) {
			//transaction.rollback();
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			manager.close();
			factory.close();
		}
		return user.getUserId();
	}
	
	
	
	@Override
	public String getRoleCode(String userName, String password) {
		factory = JpaUtility.getFactory();
		manager = factory.createEntityManager();
		
		Users user = null;
		
		try {
				user = manager.find(Users.class, userName);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			manager.close();
			factory.close();
		}
		return user.getUserRole();
	}
	
	

	@Override
	public boolean addCenter(DiagnosticCenter center) {
		/*
		 * EntityManagerFactory factory = JpaUtility.getFactory(); EntityManager manager
		 * = factory.createEntityManager(); EntityTransaction transaction =
		 * manager.getTransaction();
		 * 
		 * transaction.begin(); manager.persist(center); transaction.commit();
		 */return false;
	}

	@Override
	public boolean removeCenter(DiagnosticCenter center) {
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

	@Override
	public String makeAppointment(Users user, DiagnosticCenter test, LocalDateTime datetime) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
>>>>>>> branch 'master' of https://github.com/UradiBhavani/HealthCareSystem
