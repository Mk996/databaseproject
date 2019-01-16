package com.groupone.databaseproject.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = Semester.TABLE_NAME)
public class Semester {
    public static final String TABLE_NAME = "SEMESTER";


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Subject> subjectList = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY)
    private List<Grades> gradesList = new ArrayList<>();


    public List<Grades> getGradesList() {
        return gradesList;
    }

    public void setGradesList(List<Grades> gradesList) {
        this.gradesList = gradesList;
    }


    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
   }

    @Id
    @Column(name = "SEMESTER_ID")
    private String semesterId;

    public String getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(String semesterId) {
        this.semesterId = semesterId;
    }

    public Semester get() {
        return this;
    }
}
