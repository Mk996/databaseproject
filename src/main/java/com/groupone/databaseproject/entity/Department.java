package com.groupone.databaseproject.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name=Department.TABLE_NAME)
public class Department {
    public static final String TABLE_NAME="DEPARTMENT";

    @Id
    private String departmentId;
    private String departmentName;


    private List<Professor> primaryOptedDepartment = new ArrayList<>();


    private List<Professor> secondaryOptedDepartment = new ArrayList<>();


    private List<Student> studentList = new ArrayList<>();

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

    @OneToMany(
            mappedBy = "PRIMARY_DEPARTMENT",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public List<Professor> getPrimaryOptedDepartment() {
        return primaryOptedDepartment;
    }

    public void setPrimaryOptedDepartment(List<Professor> primaryOptedDepartment) {
        this.primaryOptedDepartment = primaryOptedDepartment;
    }

    @OneToMany(
            mappedBy = "SECONDARY_DEPARTMENT",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public List<Professor> getSecondaryOptedDepartment() {
        return secondaryOptedDepartment;
    }

    public void setSecondaryOptedDepartment(List<Professor> secondaryOptedDepartment) {
        this.secondaryOptedDepartment = secondaryOptedDepartment;
    }

    @OneToMany(
            mappedBy = "departmentStud",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
