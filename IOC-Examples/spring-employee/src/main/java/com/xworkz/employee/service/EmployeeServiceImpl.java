package com.xworkz.employee.service;

import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.entity.EmployeeEntity;
import com.xworkz.employee.repositary.EmployeeRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepositary employeeRepositary;
    @Override
    public boolean ValidateDataSaved(EmployeeDto dto) {
        EmployeeEntity entity = new EmployeeEntity();

        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);

        boolean save = employeeRepositary.savedData(entity);
        System.out.println("Data saved");
        return false;
    }
}
