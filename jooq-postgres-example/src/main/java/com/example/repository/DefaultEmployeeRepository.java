package com.example.repository;

import com.example.model.EmployeeInfo;
import com.example.model.Gender;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.pojos.Employee;
import org.jooq.DSLContext;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static nu.studer.sample.tables.Company.COMPANY;
import static nu.studer.sample.tables.Contact.CONTACT;
import static nu.studer.sample.tables.Employee.EMPLOYEE;
import static nu.studer.sample.tables.EmployeeContact.EMPLOYEE_CONTACT;

@RequiredArgsConstructor
public class DefaultEmployeeRepository {
    private final DSLContext dslContext;

    public Mono<Employee> findById(Long id) {
        return Mono.fromCallable(() -> dslContext.select(EMPLOYEE.asterisk())
                .from(EMPLOYEE)
                .where(EMPLOYEE.ID.eq(id))
                .fetchOneInto(Employee.class));
    }

    public Flux<Employee> findByGender(Gender gender) {
        return Flux.defer(() -> Flux.fromIterable(dslContext.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.GENDER.eq(gender))
                .fetchInto(Employee.class)));
    }

    public Flux<Employee> findByName(String name) {
        return Flux.defer(() -> Flux.fromIterable(dslContext.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.FIRST_NAME.contains(name))
                .fetchInto(Employee.class)));
    }

    public Flux<EmployeeInfo> findAll() {
        return Flux.defer(() -> Flux.fromIterable(dslContext
                .selectFrom(EMPLOYEE
                        .leftJoin(COMPANY).on(EMPLOYEE.COMPANY_ID.eq(COMPANY.ID))
                        .leftJoin(EMPLOYEE_CONTACT).on(EMPLOYEE.ID.eq(EMPLOYEE_CONTACT.EMPLOYEE_ID))
                        .leftJoin(CONTACT).on(EMPLOYEE_CONTACT.CONTACT_ID.eq(CONTACT.ID)))
                .fetchInto(EmployeeInfo.class)));
    }
}
