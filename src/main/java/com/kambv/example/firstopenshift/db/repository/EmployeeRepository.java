package com.kambv.example.firstopenshift.db.repository;

import com.kambv.example.firstopenshift.db.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
