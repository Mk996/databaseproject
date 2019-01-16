package com.groupone.databaseproject.repository;

import com.groupone.databaseproject.entity.Grades;
import com.groupone.databaseproject.entity.GradesId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by maharshigor on 16/01/19
 **/

@Repository
public interface GradesRepository extends CrudRepository<Grades,GradesId> {
}
