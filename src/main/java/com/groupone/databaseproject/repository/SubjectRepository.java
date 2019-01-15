package com.groupone.databaseproject.repository;

import com.groupone.databaseproject.entity.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends CrudRepository<Subject,String> {
}
