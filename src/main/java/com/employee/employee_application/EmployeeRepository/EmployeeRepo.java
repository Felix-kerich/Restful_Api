package com.employee.employee_application.EmployeeRepository;

import com.employee.employee_application.Model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Long> {

}
