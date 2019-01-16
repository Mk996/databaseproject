package com.groupone.databaseproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name=Department.TABLE_NAME)
public class Department {
    public static final String TABLE_NAME="DEPARTMENT";

    @Id
    private String departmentId;
    private String departmentName;

    /*@OneToMany(
            mappedBy = "departement",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnore
    private List<Student> studentList;

    @OneToMany(
            mappedBy = "departement",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnore
    private List<Subject> subjectList;

    @OneToMany(
            mappedBy = "primaryDepartement",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnore
    private List<Professor> primaryProfessorList;

    @OneToMany(
            mappedBy = "secondaryDepartement",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnore
    private List<Professor> secondaryProfessorList;*/

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


}
