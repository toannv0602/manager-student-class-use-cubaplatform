package com.company.demomanger.service;

import com.company.demomanger.entity.Major;
import com.company.demomanger.entity.Teacher;

import java.util.UUID;

public interface TeacherService {
    String NAME = "demomanger_TeacherService";

    public boolean checkMajor(Teacher teacher, Major major);

    public Teacher getByUUID(UUID uuid);
}