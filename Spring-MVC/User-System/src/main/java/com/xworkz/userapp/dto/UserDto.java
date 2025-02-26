
package com.xworkz.userapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private Long phoneNumber;

    public UserDto(Integer id, String firstName, String lastName, String email, Long phoneNumber) {
    }
}
