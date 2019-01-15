package com.groupone.databaseproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Professor.TABLE_NAME)
public class Professor {

    public static final String TABLE_NAME = "PROFESSOR";

    @Id
    private String professorId;
    private String professorName;
    private String primaryDepartmentId;
    private String secondaryDepartmentId;

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getPrimaryDepartmentId() {
        return primaryDepartmentId;
    }

    public void setPrimaryDepartmentId(String primaryDepartmentId) {
        this.primaryDepartmentId = primaryDepartmentId;
    }

    public String getSecondaryDepartmentId() {
        return secondaryDepartmentId;
    }

    public void setSecondaryDepartmentId(String secondaryDepartmentId) {
        this.secondaryDepartmentId = secondaryDepartmentId;
    }
}
