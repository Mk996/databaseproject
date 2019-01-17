package com.groupone.databaseproject.repository;

import com.groupone.databaseproject.entity.Grades;
import com.groupone.databaseproject.entity.GradesId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by maharshigor on 16/01/19
 **/

@Repository
public interface GradesRepository extends CrudRepository<Grades,GradesId> {

    @Query(value = "SELECT G.* FROM grades G WHERE student_id = :id", name = "cgpaquery" , nativeQuery = true)
    List<Grades> findCgpa(@Param("id") String studentId);

    @Query(value = "SELECT G.* FROM grades G WHERE student_id = :student_id AND semester_id = :semester_id", name = "gpaquery" , nativeQuery = true)
    List<Grades> findGpa(@Param("student_id") String studentId, @Param("semester_id")String semesterId);



}
