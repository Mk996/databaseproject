package com.groupone.databaseproject.services.impl;

import com.groupone.databaseproject.dto.ProfessorDTO;
import com.groupone.databaseproject.entity.Department;
import com.groupone.databaseproject.entity.Professor;
import com.groupone.databaseproject.entity.Subject;
import com.groupone.databaseproject.repository.DepartmentRepository;
import com.groupone.databaseproject.repository.ProfessorRepository;
import com.groupone.databaseproject.repository.SubjectRepository;
import com.groupone.databaseproject.services.ProfessorServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by maharshigor on 15/01/19
 **/

@Service
public class ProfessorServicesImpl implements ProfessorServices {

    @Autowired
    ProfessorRepository professorRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Professor add(ProfessorDTO professorDTO) {
        String subjects [] = professorDTO.getSubjectList().split(";");

        Set<Subject> subjectSet = new HashSet<>();

        for (String subject :
                subjects) {
            subjectSet.add(subjectRepository.findOne(subject));
        }

        Department primaryDepartment = departmentRepository.findOne(professorDTO.getPrimaryDepartmentId());
        Department secondaryDepartment = null;
        if(professorDTO.getSecondaryDepartmentId() != null){
            secondaryDepartment = departmentRepository.findOne(professorDTO.getSecondaryDepartmentId());
        }
        Professor professor = new Professor();
        BeanUtils.copyProperties(professorDTO, professor);
        professor.setSubjects(subjectSet);
        professor.setPrimaryDepartment(primaryDepartment);
        professor.setSecondaryDepartment(secondaryDepartment);
        return professorRepository.save(professor);
    }

    @Override
    public Professor select(String professorId) {
        return professorRepository.findOne(professorId);
    }

    @Override
    public Professor update(ProfessorDTO professorDTO) {
        String subjects [] = professorDTO.getSubjectList().split(";");

        Set<Subject> subjectSet = new HashSet<>();

        for (String subject :
                subjects) {
            subjectSet.add(subjectRepository.findOne(subject));
        }

        Department primaryDepartment = departmentRepository.findOne(professorDTO.getPrimaryDepartmentId());
        Department secondaryDepartment = null;
        if(professorDTO.getSecondaryDepartmentId() != null){
            secondaryDepartment = departmentRepository.findOne(professorDTO.getSecondaryDepartmentId());
        }
        Professor professor = new Professor();
        BeanUtils.copyProperties(professorDTO, professor);
        professor.setSubjects(subjectSet);
        professor.setPrimaryDepartment(primaryDepartment);
        professor.setSecondaryDepartment(secondaryDepartment);
        return professorRepository.save(professor);
    }

    @Override
    public void delete(String professorId) {
        professorRepository.delete(professorId);
    }
}
