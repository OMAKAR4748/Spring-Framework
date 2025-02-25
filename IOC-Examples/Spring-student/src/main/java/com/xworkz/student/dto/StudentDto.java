package com.xworkz.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Integer id;
    private String name;
    private Integer age;
    private String course;
}
