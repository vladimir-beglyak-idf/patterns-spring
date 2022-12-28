package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nu.studer.sample.tables.pojos.Company;
import nu.studer.sample.tables.pojos.Contact;
import nu.studer.sample.tables.pojos.Employee;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInfo {
    private Employee employee;
    private Contact contact;
    private Company company;
}
