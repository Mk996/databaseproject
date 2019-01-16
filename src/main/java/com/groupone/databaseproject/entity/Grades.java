package com.groupone.databaseproject.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Grades.TABLE_NAME)
public class Grades {
    public static final String TABLE_NAME = "GRADES";

    @EmbeddedId
    private GradesId gradesId;

    public GradesId getGradesId() {
        return gradesId;
    }

    public void setGradesId(GradesId gradesId) {
        this.gradesId = gradesId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    private String grade;
}
