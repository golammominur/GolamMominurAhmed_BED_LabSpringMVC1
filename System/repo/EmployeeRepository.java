package com.greatlearning.lab.session.Employee.Management.System.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.lab.session.Employee.Management.System.entity.Employee;
@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
