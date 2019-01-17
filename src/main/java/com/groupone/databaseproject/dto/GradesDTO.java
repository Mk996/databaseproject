package com.groupone.databaseproject.dto;

/**
 * Created by maharshigor on 17/01/19
 **/
public class GradesDTO {

    private String studentId;
    private String subjectId;
    private String semseterId;
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }



    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSemseterId() {
        return semseterId;
    }

    public void setSemseterId(String semseterId) {
        this.semseterId = semseterId;
    }
}
