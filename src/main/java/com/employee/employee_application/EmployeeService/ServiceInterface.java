package com.employee.employee_application.EmployeeService;

import com.employee.employee_application.Model.EmployeeEntity;

import java.util.List;

public interface ServiceInterface {

    public String  RegisterEmployee(EmployeeEntity employeeEntity);
    public EmployeeEntity GetEmployee(long employeeId);
    public List<EmployeeEntity> GetAllEmployees();
    public String  UpdateEmployeeDetails(EmployeeEntity employeeEntity);
    public String  DeleteEmployee(long employeeId);

}
