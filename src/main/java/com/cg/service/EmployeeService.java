package com.cg.service;

import com.cg.model.Employee;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findByLastNameOrderBySeatNumberAsc(String lastName);

    Iterable<Employee> findAll(PageRequest age);
    Optional<Employee> findById(Long id);
    Employee save(Employee employee);
    void remove(Long id);

}
