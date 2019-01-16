package com.groupone.databaseproject.services.impl;

import com.groupone.databaseproject.entity.Department;
import com.groupone.databaseproject.repository.DepartmentRepository;
import com.groupone.databaseproject.services.DeparmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true,propagation = Propagation.REQUIRES_NEW)
public class DepartmentServicesImpl implements DeparmentServices {
    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    @Transactional(readOnly = false)
    public Department add(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String departmentId) {
         departmentRepository.delete(departmentId);
    }

    @Override
    public Department select(String departmentId) {
        return departmentRepository.findOne(departmentId);
    }

    @Override
    @Transactional(readOnly = false)
    public Department update(Department departement) {
        return departmentRepository.save(departement);
    }
}
