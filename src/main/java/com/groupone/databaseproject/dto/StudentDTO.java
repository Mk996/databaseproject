package com.groupone.databaseproject.dto;

public class StudentDTO {
    private String studentId;
    private String studentName;
    private String departmentId;
    private String currentSemesterId;

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
