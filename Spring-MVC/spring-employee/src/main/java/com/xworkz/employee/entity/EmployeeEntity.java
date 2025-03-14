package com.xworkz.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


 @Entity
 @Table(name = "employee")
 @Data
 @NoArgsConstructor
 @AllArgsConstructor
 public class EmployeeEntity {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
     private String name;
     private String department;
     private Double salary;
 }


