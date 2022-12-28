package com.example.jooq;

import com.example.model.PhoneType;
import org.jooq.impl.EnumConverter;

public class PhoneTypeConverter extends EnumConverter<String, PhoneType> {
    public PhoneTypeConverter() {
        super(String.class, PhoneType.class);
    }
}
