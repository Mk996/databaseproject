package com.groupone.databaseproject.entity;

import javax.persistence.*;


@Entity
@Table(name = Subject.TABLE_NAME)
public class Subject {
    public static final String TABLE_NAME = "SUBJECT";

    @Id
    private String subjectId;
    private String subjectName;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "semester_id")
    private Semester semester;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "department_id")
    private Department department;

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
