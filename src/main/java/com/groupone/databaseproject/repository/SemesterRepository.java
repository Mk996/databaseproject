package com.groupone.databaseproject.repository;

import com.groupone.databaseproject.entity.Semester;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SemesterRepository extends CrudRepository<Semester,String> {
}
