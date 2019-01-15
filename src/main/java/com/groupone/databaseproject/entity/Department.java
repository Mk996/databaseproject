package com.groupone.databaseproject.entity;

<<<<<<< HEAD
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=Department.TABLE_NAME)
public class Department {
    public static final String TABLE_NAME="DEPARTMENT";

    @Id
    private String departmentId;
    private String departmentName;

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

=======

public class Department {
>>>>>>> b9ef737d577af4ccb9449c65a396738572e540df
}
