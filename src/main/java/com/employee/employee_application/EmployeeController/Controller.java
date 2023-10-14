package com.employee.employee_application.EmployeeController;

import com.employee.employee_application.EmployeeService.ServiceImplementation;
import com.employee.employee_application.Model.EmployeeEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")

public class Controller {
    EmployeeEntity employeeEntity;
    ServiceImplementation serviceImplementation;

    public Controller(ServiceImplementation serviceImplementation) {
        this.serviceImplementation = serviceImplementation;
    }
    @PostMapping("/create_Employee")
    public String RegisterEmployee(@RequestBody EmployeeEntity employeeEntity){
        serviceImplementation.RegisterEmployee(employeeEntity);
        return "Employee registered successfully";

    }
    @PutMapping("/update_Employee")
    public String UpdateEmployeeDetails(@RequestBody EmployeeEntity employeeEntity){
        serviceImplementation.UpdateEmployeeDetails(employeeEntity);
        return "Employee updated successfully";
    }
    @GetMapping("/employees")
    public List<EmployeeEntity> GetAllEmployees(){
        return serviceImplementation.GetAllEmployees();
    }
    @GetMapping("{employeeId}")
    public EmployeeEntity GetEmployee(@PathVariable("employeeId") long employeeId){
        return serviceImplementation.GetEmployee(employeeId);
    }
@DeleteMapping("{employeeId}")
    public String DeleteEmployee(@PathVariable("employeeId") long employeeId){
        serviceImplementation.DeleteEmployee(employeeId);
        return "Employee deleted successfully";
    }

}
