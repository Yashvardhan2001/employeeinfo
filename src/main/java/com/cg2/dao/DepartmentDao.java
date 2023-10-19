package com.cg2.dao;

import java.util.List;

import com.cg2.entity.Department;

public interface DepartmentDao {

	

	Department saveDepartment(Department department); 

	

	List<Department> fetchDepartmentList();           

	

	Department updateDepartment(Department department , long departmentId); 

	

	void deleteDepartment(Department department); 

 

}