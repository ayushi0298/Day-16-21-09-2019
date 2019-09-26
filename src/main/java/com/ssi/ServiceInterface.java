package com.ssi;

import java.util.List;

public interface ServiceInterface {
	public void insertEmployee(DetailsModel emp);

	public void deleteEmployee(int eno);
	public DetailsModel getEmployee(int eno);
	public void updateEmployee(DetailsModel emp);
	public List<DetailsModel > getAllEmployee();
	

}
