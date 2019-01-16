package com.groupone.databaseproject.entity;

import javax.persistence.*;


@Entity
@Table(name = Semester.TABLE_NAME)
public class Semester {
    public static final String TABLE_NAME = "SEMESTER";


    @OneToMany(
            mappedBy = "semester",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )

    @Id
    private String semesterID;

    public String getSemesterID() {
        return semesterID;
    }

    public void setSemesterID(String semesterID) {
        this.semesterID = semesterID;
    }
}
