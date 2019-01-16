package com.groupone.databaseproject.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = Semester.TABLE_NAME)
public class Semester {
    public static final String TABLE_NAME = "SEMESTER";



    private List<Subject> subjectList = new ArrayList<>();


    private List<Grades> gradesList = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "SEMESTER")
    public List<Grades> getGradesList() {
        return gradesList;
    }

    public void setGradesList(List<Grades> gradesList) {
        this.gradesList = gradesList;
    }

    @OneToMany(
            mappedBy = "SEMESTER",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Id
    private String semesterID;

    public String getSemesterID() {
        return semesterID;
    }

    public void setSemesterID(String semesterID) {
        this.semesterID = semesterID;
    }
}
