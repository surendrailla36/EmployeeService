package com.example.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelclass.Employee;

@RestController

public class Employecontroler {
	
	@GetMapping("/greet")
public String greeting() {
    return "Hello - RESTFul webservices";


}

@PostMapping("/employee")
public String saveEmployee(@RequestBody Employee employee){
	return "Reached controler and name ="+employee.getEMP_Name();

}



}






