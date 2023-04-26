package com.example.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
