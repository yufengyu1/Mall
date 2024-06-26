package com.project.mall.search.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Source {
    private int account_number;
    private int balance;
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private String address;
    private String employer;
    private String email;
    private String city;
    private String state;
}