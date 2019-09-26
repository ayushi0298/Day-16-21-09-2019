package com.ssi;

import java.util.List;

public interface BankDAOInterface {
	public void insertEmployee(DetailsModel emp);

	public void deleteEmployee(int eno);

	public void updateEmployee(DetailsModel emp);

	public DetailsModel getEmployee(int eno);

	public List<DetailsModel> getAllEmployee();

}
