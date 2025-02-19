package com.xworkz.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BackAccountDto {
    private Integer id;
    private double accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
}
