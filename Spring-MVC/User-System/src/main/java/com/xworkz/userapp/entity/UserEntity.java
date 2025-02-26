
package com.xworkz.userapp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "User_Information")
@Data

@NamedQuery(name = "findAll", query = "SELECT u FROM UserEntity u")
@NamedQuery(name="deleteUser", query = "Delete From UserEntity where id = :id")
@NamedQuery(name = "findById", query = "select u From UserEntity u where u.id = :id")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private Long phoneNumber;
}
