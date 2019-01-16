package com.groupone.databaseproject.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name=Department.TABLE_NAME)
public class Department {
    public static final String TABLE_NAME="DEPARTMENT";

    @Id
    private String departmentId;
    private String departmentName;

    @OneToMany(
            mappedBy = "department",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )

    @OneToOne(
            mappedBy = "departmentStud",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


}
