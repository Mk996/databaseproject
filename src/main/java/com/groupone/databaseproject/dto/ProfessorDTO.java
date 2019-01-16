package com.groupone.databaseproject.dto;

import com.groupone.databaseproject.entity.Subject;

import java.util.Set;

/**
 * Created by maharshigor on 15/01/19
 **/
public class ProfessorDTO {

    private String professorId;
    private String professorName;
    private String primaryDepartmentId;
    private String secondaryDepartmentId;

    private Set<Subject> subjectList;

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

    public Set<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(Set<Subject> subjectList) {
        this.subjectList = subjectList;
    }
}
