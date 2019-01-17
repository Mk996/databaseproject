package com.groupone.databaseproject.controller;

import com.groupone.databaseproject.dto.GradesDTO;
import com.groupone.databaseproject.entity.Grades;
import com.groupone.databaseproject.entity.GradesId;
import com.groupone.databaseproject.services.GradesServices;
import com.groupone.databaseproject.services.SemesterServices;
import com.groupone.databaseproject.services.StudentServices;
import com.groupone.databaseproject.services.SubjectServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by maharshigor on 17/01/19
 **/


@RestController
@RequestMapping(value = "/grades")
public class GradesController {

    @Autowired
    GradesServices gradesServices;

    @Autowired
    StudentServices studentServices;

    @Autowired
    SubjectServices subjectServices;

    @Autowired
    SemesterServices semesterServices;

    @PostMapping(value = "/add")
    public GradesDTO add(@RequestBody GradesDTO GradesDTO){
        Grades grades = new Grades();
        BeanUtils.copyProperties(GradesDTO, grades);

        GradesId gradesId =  new GradesId();
        gradesId.setStudent(studentServices.select(GradesDTO.getStudentId()));
        gradesId.setSubject(subjectServices.select((GradesDTO.getSubjectId())));
        gradesId.setSemester(semesterServices.read(GradesDTO.getSemseterId()));

        grades.setGradesId(gradesId);

        Grades newGrades =  gradesServices.add(grades);
        GradesDTO newGradesDTO = new GradesDTO();
        BeanUtils.copyProperties(newGrades, newGradesDTO);
        return newGradesDTO;
    }

    @GetMapping(value = "/read")
    public GradesDTO read(@RequestParam GradesId gradesId){
        GradesDTO GradesDTO = new GradesDTO();
        BeanUtils.copyProperties(gradesServices.select(gradesId), GradesDTO);
        return GradesDTO;
    }

    @PutMapping(value = "/update")
    public GradesDTO update(@RequestBody GradesDTO GradesDTO){
        Grades grades = new Grades();
        BeanUtils.copyProperties(GradesDTO, grades);
        Grades newGrades =  gradesServices.update(grades);
        GradesDTO newGradesDTO = new GradesDTO();
        BeanUtils.copyProperties(newGrades, newGradesDTO);
        return newGradesDTO;
    }

    @DeleteMapping(value = "/delete")
    public void delete(@RequestParam GradesId gradesId){
        gradesServices.delete(gradesId);
    }

    @RequestMapping(value = "/getcgpa" , method = RequestMethod.GET)
    public double getCgpa(@RequestParam String studentId){
        return gradesServices.getCgpa(studentId);
    }

    @RequestMapping(value = "/getgpa" , method = RequestMethod.GET)
    public double getGpa(@RequestParam String studentId){

        return gradesServices.getGpa(studentId , studentServices.select(studentId).getCurrentSemester().getSemesterId());
    }
}
