package com.company.demomanger.service;

import com.company.demomanger.entity.Clazz;

import java.util.List;
import java.util.UUID;

public interface ClazzService {
    String NAME = "demomanger_ClazzService";

    public void changeCountStudent(Integer count, Clazz tmpClazz);

    public Clazz getById(UUID uuid);
}