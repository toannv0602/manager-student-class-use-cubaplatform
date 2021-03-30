package com.company.demomanger.web.screens.teacher;

import com.haulmont.cuba.gui.screen.*;
import com.company.demomanger.entity.Teacher;

@UiController("demomanger_Teacher.browse")
@UiDescriptor("teacher-browse.xml")
@LookupComponent("teachersTable")
@LoadDataBeforeShow
public class TeacherBrowse extends StandardLookup<Teacher> {
}