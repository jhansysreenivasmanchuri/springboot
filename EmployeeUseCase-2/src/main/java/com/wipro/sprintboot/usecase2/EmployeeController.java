package com.wipro.sprintboot.usecase2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Endpoint to fetch data from TreeMap and store it in HashMap
    @GetMapping("/convert")
    public Map<Integer, Employee> convertAndFetch() {
        return employeeService.convertTreeMapToHashMap();
    }
}
