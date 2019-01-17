package com.groupone.databaseproject.services.impl;

import com.groupone.databaseproject.entity.Grades;
import com.groupone.databaseproject.entity.GradesId;
import com.groupone.databaseproject.repository.GradesRepository;
import com.groupone.databaseproject.repository.StudentRepository;
import com.groupone.databaseproject.services.GradesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maharshigor on 16/01/19
 **/

@Service
public class GradesServicesImpl implements GradesServices {

    @Autowired
    GradesRepository gradesRepository;

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Grades add(Grades grades) {
        return gradesRepository.save(grades);
    }

    @Override
    public Grades select(GradesId grades) {
        return gradesRepository.findOne(grades);
    }

    @Override
    public Grades update(Grades grades) {
        return gradesRepository.save(grades);
    }

    @Override
    public void delete(GradesId gradesId) {
        gradesRepository.delete(gradesId);
    }



    @Override
    public double getCgpa(String studentId) {
        return calculateGrades(gradesRepository.findCgpa(studentId));

    }

    @Override
    public double getGpa(String studentId , String semesterId) {

        return calculateGrades(gradesRepository.findGpa(studentId, semesterId));

    }

    private double calculateGrades(List<Grades> gradesList){


        double cgpa = 0;
        double credits = 0;

        for (Grades grades :
                gradesList) {

            double creditsTemp = grades.getGradesId().getSubject().getCredits();
            credits += creditsTemp;
            switch (grades.getGrade()){
                case "A+":
                    cgpa += creditsTemp*10;
                    break;

                case "A":
                    cgpa += creditsTemp*9;
                    break;

                case "B+":
                    cgpa += creditsTemp*8;
                    break;

                case "B":
                    cgpa += creditsTemp*7;
                    break;

                case "C+":
                    cgpa += creditsTemp*6;
                    break;

                case "C":
                    cgpa += creditsTemp*5;
                    break;

            }

        }

        cgpa /= credits;

        return cgpa;
    }

}
