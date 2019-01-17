package com.groupone.databaseproject.services.impl;

import com.groupone.databaseproject.entity.Grades;
import com.groupone.databaseproject.entity.GradesId;
import com.groupone.databaseproject.repository.GradesRepository;
import com.groupone.databaseproject.services.GradesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by maharshigor on 16/01/19
 **/

@Service
public class GradesServicesImpl implements GradesServices {

    @Autowired
    GradesRepository gradesRepository;

    @Override
    public Grades add(Grades grades) {
        return gradesRepository.save(grades);
    }

    @Override
    public Grades select(GradesId grades) {
        return gradesRepository.findOne(grades);
    }

    @Override
    public Grades update(Grades grades) {
        return gradesRepository.save(grades);
    }

    @Override
    public void delete(GradesId gradesId) {
        gradesRepository.delete(gradesId);
    }
}
