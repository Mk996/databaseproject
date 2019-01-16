package com.groupone.databaseproject.repository;

import com.groupone.databaseproject.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,String> {
}
