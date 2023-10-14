package com.employee.employee_application.EmployeeService;

import com.employee.employee_application.EmployeeRepository.EmployeeRepo;
import com.employee.employee_application.Model.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImplementation implements ServiceInterface{
    EmployeeRepo employeeRepo;
    public ServiceImplementation(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    @Override
    public String RegisterEmployee(EmployeeEntity employeeEntity) {
        employeeRepo.save(employeeEntity);
        return "success";
    }

    @Override
    public EmployeeEntity GetEmployee(long employeeId) {
        return employeeRepo.findById(employeeId).get();
    }

    @Override
    public List<EmployeeEntity> GetAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public String UpdateEmployeeDetails(EmployeeEntity employeeEntity) {
        employeeRepo.save(employeeEntity);
        return "Employee Update successfully";
    }

    @Override
    public String DeleteEmployee(long employeeId) {
        employeeRepo.deleteById(employeeId);
        return "Employee deleted successfully";
    }
}
