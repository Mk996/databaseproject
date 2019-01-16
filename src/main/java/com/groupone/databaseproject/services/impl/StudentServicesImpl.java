package com.groupone.databaseproject.services.impl;

import com.groupone.databaseproject.entity.Student;
import com.groupone.databaseproject.repository.StudentRepository;
import com.groupone.databaseproject.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServicesImpl implements StudentServices {

    @Autowired
    StudentRepository studentRepository

    @Override
    public Student add(Student student) {
        studentRepository.save(student);
    }
}
