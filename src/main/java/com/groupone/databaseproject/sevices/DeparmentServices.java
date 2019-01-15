package com.groupone.databaseproject.sevices;
import com.groupone.databaseproject.entity.Department;
import java.util.List;

public interface DeparmentServices {

    Department add(Department department);
    void delete(String departmentId);
    List<Department> getDepartment();
    Department update(Department department);
}
