package com.groupone.databaseproject.controller;

import com.groupone.databaseproject.dto.StudentDTO;
import com.groupone.databaseproject.entity.Student;
import com.groupone.databaseproject.services.DeparmentServices;
import com.groupone.databaseproject.services.SemesterServices;
import com.groupone.databaseproject.services.StudentServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    StudentServices studentServices;

    @Autowired
    SemesterServices semesterServices;

    @Autowired
    DeparmentServices deparmentServices;

    @PostMapping("/add")
    public StudentDTO add(@RequestBody  StudentDTO studentDTO){
        Student student = new Student();
        BeanUtils.copyProperties(studentDTO,student);
        student.setDepartmentStud(deparmentServices.select(studentDTO.getDepartmentId()));
        student.setCurrentSemester(semesterServices.read(studentDTO.getCurrentSemesterId()));
        student = studentServices.add(student);
        StudentDTO studentDTO1 = new StudentDTO();
        BeanUtils.copyProperties(student,studentDTO1);
        return studentDTO1;

    }

    @RequestMapping("/select")
    public StudentDTO select(@RequestParam String studentId){
        Student student = studentServices.select(studentId);
        StudentDTO studentDTO = new StudentDTO();
        BeanUtils.copyProperties(student,studentDTO);
        return studentDTO;
    }

    @PutMapping("/update")
    public StudentDTO update(@RequestBody StudentDTO studentDTO){
        Student student = new Student();
        BeanUtils.copyProperties(studentDTO,student);
        student.setDepartmentStud(deparmentServices.select(studentDTO.getDepartmentId()));
        student.setCurrentSemester(semesterServices.read(studentDTO.getCurrentSemesterId()));
        student = studentServices.add(student);
        StudentDTO studentDTO1 = new StudentDTO();
        BeanUtils.copyProperties(student,studentDTO1);
        return studentDTO1;
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam String studentId){
        studentServices.delete(studentId);
    }
}
