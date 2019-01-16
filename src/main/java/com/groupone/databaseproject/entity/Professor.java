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
    private Department primaryDepartment;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department secondaryDepartment;

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

    public Department getPrimaryDepartment() {
        return primaryDepartment;
    }

    public void setPrimaryDepartment(Department primaryDepartment) {
        this.primaryDepartment = primaryDepartment;
    }

    public Department getSecondaryDepartment() {
        return secondaryDepartment;
    }

    public void setSecondaryDepartment(Department secondaryDepartment) {
        this.secondaryDepartment = secondaryDepartment;
    }
}
