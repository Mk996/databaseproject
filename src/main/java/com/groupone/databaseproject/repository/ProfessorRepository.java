package com.groupone.databaseproject.repository;

import com.groupone.databaseproject.entity.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by maharshigor on 16/01/19
 **/
@Repository
public interface ProfessorRepository extends CrudRepository<Professor, String> {
}
