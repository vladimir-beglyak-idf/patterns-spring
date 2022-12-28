package com.example.config;

import com.example.repository.DefaultEmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class RepositoryConfig {

    private final DSLContext dslContext;

    @Bean
    public DefaultEmployeeRepository defaultEmployeeRepository() {
        return new DefaultEmployeeRepository(dslContext);
    }
}
