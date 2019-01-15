package com.groupone.databaseproject.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=Department.TABLE_NAME)
public class Department {
    public static final String TABLE_NAME="DEPARTMENT";
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
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy = "uuid2")
    private String departmentId;
    private String departmentName;

}
