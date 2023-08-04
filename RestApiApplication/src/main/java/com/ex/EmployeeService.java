package com.ex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmployeeService {
	@Autowired
	 EmployeeRepository er;
	public List<employee>  getallemps() {
	return er.findAll();
}
	public void createemployee(employee e) {
	     er.save(e);
		
	}
	
}
