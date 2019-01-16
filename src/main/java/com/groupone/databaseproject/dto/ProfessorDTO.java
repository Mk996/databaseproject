package com.groupone.databaseproject.dto;

/**
 * Created by maharshigor on 15/01/19
 **/
public class ProfessorDTO {

    private String professorId;
    private String professorName;
    private String primaryDepartmentId;
    private String secondaryDepartmentId;

    private String subjectList;

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

    public String getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(String subjectList) {
        this.subjectList = subjectList;
    }
}
