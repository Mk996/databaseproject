package com.groupone.databaseproject.repository;

import com.groupone.databaseproject.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,String> {
    /*@Query(value = "SELECT ST.student_name,ST.student_id, G.grade, SB.credits FROM students ST, grades G," +
            "subject SB WHERE (ST.current_semester = G.semester AND ST.student_id = G.student AND " +
            "SB.subject_id = G.subject)", nativeQuery = true , name = "cgpaQuery")
    private Student student;
*/


}
