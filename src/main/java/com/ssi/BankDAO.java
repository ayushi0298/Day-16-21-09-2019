package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BankDAO implements BankDAOInterface {
	@Autowired
	private SessionFactory sessionfactory;

	public void insertEmployee(DetailsModel emp) {
		Session session = sessionfactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(emp);
		tr.commit();
		session.close();
	}

	public void deleteEmployee(int eno) {

		Session session = sessionfactory.openSession();
		DetailsModel emp = session.get(DetailsModel.class, eno);
		Transaction tr = session.beginTransaction();
		session.delete(emp);
		tr.commit();
		session.close();
	}

	public void updateEmployee(DetailsModel emp) {
		Session session = sessionfactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(emp);
		tr.commit();
		session.close();

	}

	public List<DetailsModel> getAllEmployee() {

		Session session = sessionfactory.openSession();
		Criteria cr = session.createCriteria(DetailsModel.class);
		List<DetailsModel> emp = cr.list();
		session.close();
		return emp;
	}

	public DetailsModel getEmployee(int eno) {
		Session session = sessionfactory.openSession();
		DetailsModel emp = session.get(DetailsModel.class, eno);
		Transaction tr = session.beginTransaction();
		tr.commit();
		session.close();
		return emp;
		
	}

	

}
