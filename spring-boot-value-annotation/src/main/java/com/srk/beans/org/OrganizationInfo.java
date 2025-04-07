package com.srk.beans.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrganizationInfo {
	
	// not configured in properties file
	
	//@Value("${org.emp.count:100}")
	@Value("${org.emp.count}")
	private int orgEmpCount;
	
	// can we define default values for List type also...
	//@Value("${org.dept.names:[Admin, Developer, Operations]}")
	@Value("${org.dept.names}")
	private List<String> deptNames;

	public int getOrgEmpCount() {
		return orgEmpCount;
	}

	public void setOrgEmpCount(int orgEmpCount) {
		this.orgEmpCount = orgEmpCount;
	}

	public List<String> getDeptNames() {
		return deptNames;
	}

	public void setDeptNames(List<String> deptNames) {
		this.deptNames = deptNames;
	}
	

}
