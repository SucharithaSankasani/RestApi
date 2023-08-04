package com.ex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class EmployeeController {
	@Autowired
	
	private  EmployeeService es;
	@GetMapping("/employee")
	public  List<employee> getallemps()
	{
		return es.getallemps();
		
		
		}
	@PostMapping("/employee")
	public void createemployee(@RequestBody employee e ) {
		es.createemployee(e);
		
	}
	
		
		
	

}
