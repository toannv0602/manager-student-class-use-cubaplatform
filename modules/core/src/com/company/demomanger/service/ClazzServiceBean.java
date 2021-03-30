package com.company.demomanger.service;

import com.company.demomanger.entity.Clazz;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

@Service(ClazzService.NAME)
public class ClazzServiceBean implements ClazzService {

    @Inject
    private DataManager dataManager;

    @Override
    public Clazz getById(UUID uuid) {
        LoadContext<Clazz> ctx = new LoadContext<>(Clazz.class);

        LoadContext.Query query = new LoadContext.Query("select s from demomanger_Clazz s where s.uuid = :uuid_clazz");
        query.setParameter("uuid_clazz", uuid);

        ctx.setQuery(query);
        ctx.setView("clazz-view");

        List<Clazz> clazzList = dataManager.loadList(ctx);
        if (!clazzList.isEmpty()) {
            return clazzList.get(0);
        }
        return null;
    }

    @Override
    public void changeCountStudent(Integer count, Clazz tmpClazz) {
        Clazz clazz = getById(tmpClazz.getUuid());
        clazz.setCount(count);
        dataManager.commit(clazz);
    }
}