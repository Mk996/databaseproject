package com.groupone.databaseproject.controller;

import com.groupone.databaseproject.dto.ProfessorDTO;
import com.groupone.databaseproject.entity.Professor;
import com.groupone.databaseproject.entity.Subject;
import com.groupone.databaseproject.services.ProfessorServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

/**
 * Created by maharshigor on 15/01/19
 **/
@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {

    @Autowired
    ProfessorServices professorServices;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ProfessorDTO add(@RequestBody ProfessorDTO professorDTO){

        ProfessorDTO newProfessorDTO = new ProfessorDTO();
        BeanUtils.copyProperties(professorServices.add(professorDTO), newProfessorDTO);
        return newProfessorDTO;

    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public ProfessorDTO select(@RequestParam String professorIdDTO){
        ProfessorDTO professorDTO = new ProfessorDTO();
        Professor professor = professorServices.select(professorIdDTO);
        BeanUtils.copyProperties( professor, professorDTO);
        Iterator<Subject> subjectIterator = professor.getSubjects().iterator();

        String subjects = "";
        while (subjectIterator.hasNext()){
            subjects += subjectIterator.next().getSubjectId() + ";";
        }

        String primaryDepartment = professor.getPrimaryDepartment().getDepartmentId();
        String secondaryDepartment = professor.getSecondaryDepartment().getDepartmentId();

        professorDTO.setSubjectList(subjects);
        professorDTO.setPrimaryDepartmentId(primaryDepartment);
        professorDTO.setSecondaryDepartmentId(secondaryDepartment);

        return professorDTO;
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public ProfessorDTO update(@RequestBody ProfessorDTO professorDTO){

        ProfessorDTO newProfessorDTO = new ProfessorDTO();
        BeanUtils.copyProperties(professorServices.update(professorDTO), newProfessorDTO);
        return newProfessorDTO;

    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(String professorIdDTO){
        professorServices.delete(professorIdDTO);
    }


}
