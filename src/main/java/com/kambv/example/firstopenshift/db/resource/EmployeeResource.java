package com.kambv.example.firstopenshift.db.resource;

import com.kambv.example.firstopenshift.db.model.Employee;
import com.kambv.example.firstopenshift.db.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeResource {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "all")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping(value = "load")
    public List<Employee> persist(@RequestBody final Employee employee){
        employeeRepository.save(employee);
        return employeeRepository.findAll();
    }
}
