package com.groupone.databaseproject.services;

import com.groupone.databaseproject.entity.Department;

public interface DeparmentServices {

    Department add(Department department);
    void delete(String departmentId);
    Department select(String departmentId);
    Department update(Department departement);
}
