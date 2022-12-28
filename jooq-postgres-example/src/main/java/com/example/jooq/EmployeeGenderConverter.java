package com.example.jooq;

import com.example.model.Gender;
import org.jooq.impl.EnumConverter;

public class EmployeeGenderConverter extends EnumConverter<String, Gender> {
    public EmployeeGenderConverter() {
        super(String.class, Gender.class);
    }
}
