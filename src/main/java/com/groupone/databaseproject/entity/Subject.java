package com.groupone.databaseproject.entity;



import javax.persistence.*;

@Entity
@Table(name = Subject.TABLE_NAME)
public class Subject {
    public static final String TABLE_NAME = "SUBJECT";

    @Id
    private String subjectId;
    private String semesterId;
    private String departmentId;
    private String subjectName;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "semester_id")

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "department_id")*/

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
}
