package com.groupone.databaseproject.repository;

import com.groupone.databaseproject.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,String> {
}
