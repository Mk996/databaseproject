package com.groupone.databaseproject.entity;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by maharshigor on 16/01/19
 **/

@Embeddable
public class GradesId {

    @ManyToOne
    @JoinColumn(name = "STUDENT_ID" , table = "STUDENT")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "SUBJECT_ID", table = "SUBJECT")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "SEMESTER_ID" , table = "SEMESTER")
    private Semester semester;


}
