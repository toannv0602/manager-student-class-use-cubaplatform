package com.company.demomanger.service;

import com.company.demomanger.entity.Clazz;
import com.company.demomanger.entity.Student;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(StudentService.NAME)
public class StudentServiceBean implements StudentService {

    @Inject
    private DataManager dataManager;

    @Override
    public List<Student> getStudentByClass(Clazz clazz) {
        LoadContext<Student> ctx = new LoadContext<>(Student.class);
        LoadContext.Query query = new LoadContext.Query("select s from demomanger_Student s where s.clazz = :clazz");
        query.setParameter("clazz",clazz);

        ctx.setQuery(query);
        ctx.setView("student-view");
        List<Student> studentList = dataManager.loadList(ctx);
        return studentList;
    }
}