package com.groupone.databaseproject.controller;

import com.groupone.databaseproject.dto.ProfessorDTO;
import org.springframework.web.bind.annotation.*;

/**
 * Created by maharshigor on 15/01/19
 **/
@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@RequestBody ProfessorDTO professorDTO){

    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public ProfessorDTO select(@RequestParam String professorIdDTO){
        return null;
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public void update(@RequestBody ProfessorDTO professorDTO){

    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(String professorIdDTO){

    }


}
