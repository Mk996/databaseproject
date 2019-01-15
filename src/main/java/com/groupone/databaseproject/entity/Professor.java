package com.groupone.databaseproject.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = Professor.TABLE_NAME)
public class Professor {

    public static final String TABLE_NAME = "PROFESSOR";

    @Id
    private String professorId;
    private String professorName;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID")
    private String primaryDepartmentId;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID")
    private String secondaryDepartmentId;

    private Set<Subject> subjects = new HashSet<>(0);


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "SUBJECT_TUTOR", joinColumns = {@JoinColumn(name = "PROFESSOR_ID")}, inverseJoinColumns = {@JoinColumn(name = "SUBJECT_ID")})
    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

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
