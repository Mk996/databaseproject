package com.groupone.databaseproject.services;

import com.groupone.databaseproject.dto.ProfessorDTO;
import com.groupone.databaseproject.entity.Professor;

/**
 * Created by maharshigor on 15/01/19
 **/

public interface ProfessorServices {
    Professor add(ProfessorDTO professorDTO);

    Professor select(String professorId);

    Professor update(ProfessorDTO professorDTO);

    void delete(String professorId);
}
