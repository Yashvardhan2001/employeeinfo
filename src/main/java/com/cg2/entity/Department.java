package com.cg2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long deparmentId;

	private String departmentName;

	private String departmentAddress;
	

	public Department(Long deparmentId, String departmentName, String departmentAddress, String departmentCode) {
		super();
		this.deparmentId = deparmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}

	public Long getDeparmentId() {
		return deparmentId;
	}

	public void setDeparmentId(Long deparmentId) {
		this.deparmentId = deparmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	private String departmentCode;
	
}
