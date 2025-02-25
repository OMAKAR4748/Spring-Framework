package com.xworkz.userapp.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_details")
@NamedQuery(name = "getAllUser",query = "select u from UserEntity u")
@NamedQuery(name = "deleteById", query = "delete from UserEntity u where u.id=:id")
@NamedQuery(name = "UpdateData",query = "UPDATE UserEntity u SET u.firstName = :firstName, u.lastName = :lastName, u.email = :email, u.phoneNumber = :phoneNumber WHERE u.id = :id")
@Component
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Long phoneNumber;
}
