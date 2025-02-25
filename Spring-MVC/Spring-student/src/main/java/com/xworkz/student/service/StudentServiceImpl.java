package com.xworkz.student.service;

import com.xworkz.student.dto.StudentDto;
import com.xworkz.student.entity.StudentEntity;
import com.xworkz.student.repositary.StudentRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepositary studentRepositary;

    @Override
    public boolean validateAndSaved(StudentDto dto) {
        StudentEntity entity = new StudentEntity();
        BeanUtils.copyProperties(dto, entity);
        System.out.println(entity);
        boolean save = studentRepositary.saved(entity);
        System.out.println("Student data saved");
        return save;
    }
}
