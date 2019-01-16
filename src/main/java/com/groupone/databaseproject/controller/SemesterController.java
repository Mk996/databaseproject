package com.groupone.databaseproject.controller;

import com.groupone.databaseproject.dto.SemesterDTO;
import com.groupone.databaseproject.entity.Semester;
import com.groupone.databaseproject.services.SemesterServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/semester")
public class SemesterController {

    @Autowired
    SemesterServices semesterServices;

    @PostMapping(value = "/add")
    public SemesterDTO add(@RequestBody SemesterDTO semesterDTO){
        Semester semester = new Semester();
        BeanUtils.copyProperties(semesterDTO, semester);
        Semester newSemester =  semesterServices.add(semester);
        SemesterDTO newSemesterDTO = new SemesterDTO();
        BeanUtils.copyProperties(newSemester, newSemesterDTO);
        return newSemesterDTO;
    }

    @GetMapping(value = "/read")
    public SemesterDTO read(@RequestParam String semID){
        SemesterDTO semesterDTO = new SemesterDTO();
        BeanUtils.copyProperties(semesterServices.read(semID), semesterDTO);
        return semesterDTO;
    }

    @PutMapping(value = "/update")
    public SemesterDTO update(@RequestBody SemesterDTO semesterDTO){
        Semester semester = new Semester();
        BeanUtils.copyProperties(semesterDTO, semester);
        Semester newSemester =  semesterServices.update(semester);
        SemesterDTO newSemesterDTO = new SemesterDTO();
        BeanUtils.copyProperties(newSemester, newSemesterDTO);
        return newSemesterDTO;
    }

    @DeleteMapping(value = "/delete")
    public void delete(@RequestParam String semID){
        semesterServices.deleteById(semID);
    }
}
