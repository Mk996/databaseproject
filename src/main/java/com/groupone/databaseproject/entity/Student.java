package com.groupone.databaseproject.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = Student.TABLE_NAME)
public class Student {
    public static final String TABLE_NAME = "STUDENT";

    @Id
    private String studentId;
    private String studentName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURRENT_SEMESTER_ID")
    private Semester currentSemester;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department departmentStud;


    public List<Grades> getGradesList() {
        return gradesList;
    }

    public void setGradesList(List<Grades> gradesList) {
        this.gradesList = gradesList;
    }

    @OneToMany(fetch = FetchType.LAZY)
    private List<Grades> gradesList = new ArrayList<>();


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Semester getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(Semester currentSemester) {
        this.currentSemester = currentSemester;
    }

    public Department getDepartmentStud() {
        return departmentStud;
    }

    public void setDepartmentStud(Department departmentStud) {
        this.departmentStud = departmentStud;
    }
}
