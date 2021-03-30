package com.company.demomanger.web.screens.teacher;

import com.haulmont.cuba.gui.screen.*;
import com.company.demomanger.entity.Teacher;

@UiController("demomanger_Teacher.edit")
@UiDescriptor("teacher-edit.xml")
@EditedEntityContainer("teacherDc")
@LoadDataBeforeShow
public class TeacherEdit extends StandardEditor<Teacher> {
}