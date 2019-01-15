package com.groupone.databaseproject.entity;

import javax.persistence.Embeddable;

/**
 * Created by maharshigor on 16/01/19
 **/

@Embeddable
public class GradesId {

    private String studentId;
    private String subjectId;
    private String semesterId;

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

    public String getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(String semesterId) {
        this.semesterId = semesterId;
    }
}
