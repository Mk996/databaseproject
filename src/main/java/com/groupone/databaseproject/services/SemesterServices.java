package com.groupone.databaseproject.services;

import com.groupone.databaseproject.entity.Semester;

public interface SemesterServices {
    Semester add(Semester semester);

    Semester read(String semID);

    Semester update(Semester semester);

    void deleteById(String semID);
}
