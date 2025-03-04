package com.xworkz.bank.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "BankAccount_info")

@NamedQuery(name = "getAllUser",query = "SELECT b FROM BankAccountEntity b")
@NamedQuery(name = "deleteById",query = "delete from BankAccountEntity u where u.id=:id")
@NamedQuery(name = "findById",query = "select u from BankAccountEntity u where u.id=:id")
public class BankAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
}
