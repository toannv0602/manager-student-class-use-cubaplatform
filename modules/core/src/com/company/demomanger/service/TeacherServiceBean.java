package com.company.demomanger.service;

import com.company.demomanger.entity.Major;
import com.company.demomanger.entity.Teacher;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

@Service(TeacherService.NAME)
public class TeacherServiceBean implements TeacherService {

    @Inject
    private DataManager dataManager;


    @Override
    public boolean checkMajor(Teacher teacher, Major major) {
        if(teacher.getMajor().equals(major)){
            return true;
        }
        return false;
    }

    @Override
    public Teacher getByUUID(UUID uuid) {
        LoadContext<Teacher> ctx = new LoadContext<>(Teacher.class);

        LoadContext.Query query = new LoadContext.Query("select t from demomanger_Teacher t where t.uuid = :uuid_teacher ");
        query.setParameter("uuid_teacher",uuid);

        ctx.setQuery(query);
        ctx.setView("teacher-view");

        List<Teacher> teacherList = dataManager.loadList(ctx);
        if(!teacherList.isEmpty()){
            return teacherList.get(0);
        }
        return null;
    }
}