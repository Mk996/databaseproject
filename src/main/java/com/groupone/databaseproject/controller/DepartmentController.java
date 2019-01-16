package com.groupone.databaseproject.controller;

import com.groupone.databaseproject.dto.DepartmentDTO;
import com.groupone.databaseproject.entity.Department;
import com.groupone.databaseproject.services.impl.DepartmentServicesImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
    @Autowired
    private DepartmentServicesImpl departmentServices;

    @RequestMapping(value= "/add",method = RequestMethod.POST)
    public ResponseEntity<String> add(@RequestBody DepartmentDTO departmentDTO) {
        Department department=new Department();
        BeanUtils.copyProperties(departmentDTO, department);
        Department createdDepartment=departmentServices.add(department);
        return new ResponseEntity<>(createdDepartment.getDepartmentId(),HttpStatus.CREATED);
    }

    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public DepartmentDTO select(@RequestParam String departmentId) {
        DepartmentDTO departmentDTO=new DepartmentDTO();
        Department selectedDepartment=departmentServices.select(departmentId);
        BeanUtils.copyProperties(selectedDepartment, departmentDTO);
        return departmentDTO;
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<String> update(@RequestBody DepartmentDTO departmentDTO) {
        Department department=new Department();
        BeanUtils.copyProperties(departmentDTO, department);
        Department createdDepartement=departmentServices.add(department);
        return new ResponseEntity<>(createdDepartement.getDepartmentId(),HttpStatus.CREATED);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@RequestParam String departmentId)
    {
        departmentServices.delete(departmentId);
        return new ResponseEntity<Boolean>(Boolean.TRUE,HttpStatus.CREATED);
    }
}
