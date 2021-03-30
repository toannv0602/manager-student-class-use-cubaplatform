package com.company.demomanger.service;

import com.company.demomanger.entity.Clazz;
import com.company.demomanger.entity.Student;

import java.util.List;

public interface StudentService {
    String NAME = "demomanger_StudentService";

    public List<Student> getStudentByClass(Clazz clazz);
}