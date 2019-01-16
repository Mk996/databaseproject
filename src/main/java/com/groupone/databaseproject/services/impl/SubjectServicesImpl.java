package com.groupone.databaseproject.services.impl;

import com.groupone.databaseproject.entity.Subject;
import com.groupone.databaseproject.repository.SubjectRepository;
import com.groupone.databaseproject.services.SubjectServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
public class SubjectServicesImpl implements SubjectServices {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    @Transactional(readOnly = false)
    public Subject add(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject select(String id) {
        return subjectRepository.findOne(id);
    }

    @Override
    public Subject update(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void delete(String id) {
        subjectRepository.delete(id);
    }

}
