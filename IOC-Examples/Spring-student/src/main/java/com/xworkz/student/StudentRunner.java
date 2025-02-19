package com.xworkz.student;

import com.xworkz.student.config.SpringStudent;
import com.xworkz.student.dto.StudentDto;
import com.xworkz.student.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringStudent.class);
        StudentService studentService = applicationContext.getBean(StudentService.class);

        StudentDto dto = new StudentDto();
       // dto.setId(1);
        dto.setName("Abhishek");
        dto.setAge(23);
        dto.setCourse("Java Full Stack Development");

        studentService.validateAndSaved(dto);
    }
}
