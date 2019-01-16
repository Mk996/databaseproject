package com.groupone.databaseproject.services;

import com.groupone.databaseproject.dto.SubjectDTO;
import com.groupone.databaseproject.entity.Subject;
import org.springframework.stereotype.Service;

@Service
public interface SubjectServices {
    Subject add(Subject subject);
    Subject select(String id);
    Subject update(Subject subject);
    void delete(String id);


}
