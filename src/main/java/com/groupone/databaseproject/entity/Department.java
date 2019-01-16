package com.groupone.databaseproject.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name=Department.TABLE_NAME)
public class  Department {

    public static final String TABLE_NAME="DEPARTMENT";

    @Id
    private String departmentId;
    private String departmentName;

    @OneToMany(
            mappedBy = "primaryDepartment",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Professor> primaryOptedDepartment = new ArrayList<>();

    @OneToMany(
            mappedBy = "secondaryDepartment",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Professor> secondaryOptedDepartment = new ArrayList<>();

    @OneToMany(
            mappedBy = "departmentStud",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
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


    public List<Professor> getPrimaryOptedDepartment() {
        return primaryOptedDepartment;
    }

    public void setPrimaryOptedDepartment(List<Professor> primaryOptedDepartment) {
        this.primaryOptedDepartment = primaryOptedDepartment;
    }


    public List<Professor> getSecondaryOptedDepartment() {
        return secondaryOptedDepartment;
    }

    public void setSecondaryOptedDepartment(List<Professor> secondaryOptedDepartment) {
        this.secondaryOptedDepartment = secondaryOptedDepartment;
    }


    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
