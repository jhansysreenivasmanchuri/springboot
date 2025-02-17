package com.wipro.sprintboot.usecase2;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    // Method to fetch data from TreeMap and store it in HashMap
    public Map<Integer, Employee> convertTreeMapToHashMap() {
        // Creating a TreeMap
        TreeMap<Integer, Employee> employeeTreeMap = new TreeMap<>();

        // Adding sample data to TreeMap
        employeeTreeMap.put(1, new Employee(1, "Sree", "Developer"));
        employeeTreeMap.put(2, new Employee(2, "Mani", "Tester"));
        employeeTreeMap.put(3, new Employee(3, "Kiran", "HR"));

        // Converting TreeMap to HashMap
        Map<Integer, Employee> employeeHashMap = new HashMap<>(employeeTreeMap);

        return employeeHashMap;
    }
}
