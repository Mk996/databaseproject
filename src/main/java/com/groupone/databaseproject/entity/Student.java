package com.groupone.databaseproject.entity;

import javax.persistence.*;

@Entity
@Table(name = Student.TABLE_NAME)
public class Student {
    public static final String TABLE_NAME = "STUDENT";

    @Id
    private String studentId;
    private String studentName;
    private String departmentId;
    private String currentSemesterId;

    @OneToOne(fetch = FetchType.LAZY)
    @Column(name = "department_id")
    private Department departmentStud;

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

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getCurrentSemesterId() {
        return currentSemesterId;
    }

    public void setCurrentSemesterId(String currentSemesterId) {
        this.currentSemesterId = currentSemesterId;
    }
}
