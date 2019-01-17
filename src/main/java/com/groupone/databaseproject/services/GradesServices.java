package com.groupone.databaseproject.services;

import com.groupone.databaseproject.entity.Grades;
import com.groupone.databaseproject.entity.GradesId;

/**
 * Created by maharshigor on 16/01/19
 **/
public interface GradesServices {

    Grades add(Grades grades);
    Grades select(GradesId grades);
    Grades update(Grades grades);
    void delete(GradesId gradesId);

    double getCgpa(String studentId);
    double getGpa(String studentId, String semesterId);


}
