package com.ssi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceImp implements ServiceInterface {
	@Autowired
	private BankDAOInterface bank;

	public void insertEmployee(DetailsModel emp) {
		bank.insertEmployee(emp);
	}
	public void deleteEmployee(int eno) {
		bank.deleteEmployee(eno);
	}
	
	public List<DetailsModel> getAllEmployee() {

		return bank.getAllEmployee();
	}
	
	public DetailsModel getEmployee(int eno) {
		return bank.getEmployee(eno);
	}
	public void updateEmployee(DetailsModel emp) {
		bank.updateEmployee(emp);
		
	}
	
}
