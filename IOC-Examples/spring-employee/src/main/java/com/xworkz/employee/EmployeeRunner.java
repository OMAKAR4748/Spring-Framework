package com.xworkz.employee;

import com.xworkz.employee.config.SpringEmployee;
import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringEmployee.class);
       EmployeeService service= applicationContext.getBean(EmployeeService.class);

        EmployeeDto dto = new EmployeeDto();
//        dto.setId(1);
        dto.setName("Deekshit");
        dto.setDepartment("Software Engineer");
        dto.setSalary(500000d);

        service.ValidateDataSaved(dto);
    }
}
