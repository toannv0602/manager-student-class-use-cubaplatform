package com.company.demomanger.web.screens.clazz;

import com.company.demomanger.entity.Major;
import com.company.demomanger.entity.Teacher;
import com.company.demomanger.service.ClazzService;
import com.company.demomanger.service.TeacherService;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.screen.*;
import com.company.demomanger.entity.Clazz;
import com.vaadin.ui.Notification;

import javax.inject.Inject;

@UiController("demomanger_Clazz.edit")
@UiDescriptor("clazz-edit.xml")
@EditedEntityContainer("clazzDc")
@LoadDataBeforeShow
public class ClazzEdit extends StandardEditor<Clazz> {
    @Inject
    private LookupPickerField<Major> majorField;

    @Inject
    private LookupPickerField<Teacher> teacherField;

    @Inject
    private Notifications notifications;

    @Inject
    private TeacherService teacherService;

    @Inject
    private ClazzService clazzService;

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        Teacher teacher = teacherService.getByUUID(teacherField.getValue().getUuid());
        Major major = majorField.getValue();
        boolean check = teacherService.checkMajor(teacher,major);
        if(!check){
            notifications.create().withCaption("Lớp không đúng ngành của giảng viên").show();
            event.preventCommit();
        }
    }


}