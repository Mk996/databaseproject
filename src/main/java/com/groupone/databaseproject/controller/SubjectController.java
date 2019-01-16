package com.groupone.databaseproject.controller;


import com.groupone.databaseproject.dto.SubjectDTO;
import com.groupone.databaseproject.entity.Department;
import com.groupone.databaseproject.entity.Semester;
import com.groupone.databaseproject.entity.Subject;
import com.groupone.databaseproject.services.SemesterServices;
import com.groupone.databaseproject.services.SubjectServices;
import com.groupone.databaseproject.services.impl.DepartmentServicesImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/subject")
public class SubjectController {

    @Autowired
    private SubjectServices subjectServices;

    @Autowired
    private SemesterServices semesterServices;

    @Autowired
    private DepartmentServicesImpl departmentServices;

    @PostMapping("/add")
    private SubjectDTO add(@RequestBody SubjectDTO subject) {
        Subject newSubject = new Subject();
        BeanUtils.copyProperties(subject, newSubject);
        Semester semester = semesterServices.select(subject.getSemesterId());
        Department department = departmentServices.select(subject.getDepartmentId());
        newSubject.setSemester(semester);
        newSubject.setDepartment(department);
        Subject subCreated = subjectServices.add(newSubject);
        SubjectDTO newSubjectDto = new SubjectDTO();
        BeanUtils.copyProperties(subCreated, newSubjectDto);
        newSubjectDto.setSemesterId(subCreated.getSemester().getSemesterID());
        newSubjectDto.setDepartmentId(subCreated.getDepartment().getDepartmentId());
        return newSubjectDto;
    }

    @GetMapping("/select")
    private SubjectDTO select(@RequestParam String id) {
        Subject subject = subjectServices.select(id);
        SubjectDTO newSubjectDto = new SubjectDTO();
        BeanUtils.copyProperties(subject, newSubjectDto);
        return newSubjectDto;
    }

    @PutMapping("/update")
    private SubjectDTO update(@RequestBody SubjectDTO subject) {
        Subject newSubject = new Subject();
        BeanUtils.copyProperties(subject, newSubject);
        Subject subCreated = subjectServices.update(newSubject);
        SubjectDTO newSubjectDto = new SubjectDTO();
        BeanUtils.copyProperties(subCreated, newSubjectDto);
        return newSubjectDto;
    }

    @DeleteMapping("/delete")
    private void delete(@RequestParam String id){
        subjectServices.delete(id);
    }
}
