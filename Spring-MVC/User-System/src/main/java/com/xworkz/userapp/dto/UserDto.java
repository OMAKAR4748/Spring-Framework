package com.xworkz.userapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Long phoneNumber;
}
