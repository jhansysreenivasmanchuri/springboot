package com.wipro.sprintboot.usecase1;

/**
 * 
 */
//package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@RequestMapping("/employees") 

public class EmployeeController {
	private List<Employee> emplist=new ArrayList<>();
	@RequestMapping("/addEmployee")
    public String addEmployee(
            @RequestParam int id,
            @RequestParam String name,
            @RequestParam String role) {

        Employee employee = new Employee(id,name,role);
        emplist.add(employee);
        return "Employee added: " + employee.toString();
    }
	@GetMapping("/searchEmployee")
    public String searchById(@RequestParam int id) {
        for (Employee emp : emplist) {
            if (emp.getId() == id) {
                return "Found Employee: " + emp.toString();
            }
        }
        return "Employee with ID " + id + " not found!";
    } 
	@GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return emplist;
    }
	
}