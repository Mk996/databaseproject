package com.groupone.databaseproject.services.impl;

import com.groupone.databaseproject.entity.Semester;
import com.groupone.databaseproject.repository.SemesterRepository;
import com.groupone.databaseproject.services.SemesterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemesterServicesImpl implements SemesterServices {

    @Autowired
    SemesterRepository semesterRepository;

    public Semester add(Semester sem) {
        return semesterRepository.save(sem);
    }

    @Override
    public Semester read(String semID) {
        return semesterRepository.findOne(semID);
    }

    @Override
    public Semester update(Semester semester) {
        return semesterRepository.save(semester);
    }

    @Override
    public void deleteById(String semID) {
        semesterRepository.delete(semID);
    }




}
