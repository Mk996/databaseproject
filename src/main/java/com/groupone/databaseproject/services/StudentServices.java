package com.groupone.databaseproject.services;

import com.groupone.databaseproject.entity.Student;

public interface StudentServices {


    Student add(Student student);
    Student select(String studentId);
    Student update(Student student);
    void delete(String studentId);

}
