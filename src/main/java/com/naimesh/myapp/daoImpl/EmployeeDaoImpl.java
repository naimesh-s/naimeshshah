package com.naimesh.myapp.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naimesh.myapp.dao.EmployeeDao;
import com.naimesh.myapp.domain.EmployeeDetail;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addEmployee(EmployeeDetail employeeDetails) {
		sessionFactory.getCurrentSession().saveOrUpdate(employeeDetails);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeDetail> listOfEmployees() {
		return (List<EmployeeDetail>)sessionFactory.getCurrentSession().createCriteria(EmployeeDao.class).list();
	}

	@Override
	public EmployeeDetail getEmployee(String eId) {
		return (EmployeeDetail) sessionFactory.getCurrentSession().get(EmployeeDao.class, eId);
	}

	@Override
	public void deleteEmployee(String empId) {
		String query = "DELETE FROM EmployeeDetail WHERE empId = "+empId;
		sessionFactory.getCurrentSession().createQuery(query).executeUpdate();
	}


}
