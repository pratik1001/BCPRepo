package com.cg.hcs.dao;

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
