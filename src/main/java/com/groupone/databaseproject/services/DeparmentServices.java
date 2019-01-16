package com.groupone.databaseproject.services;

import com.groupone.databaseproject.entity.Department;

import java.util.List;

public interface DeparmentServices {

    Department add(Department department);
    void delete(String departmentId);
    Department select(String departmentId);
    Department update(Department departement);
}
