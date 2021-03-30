package com.company.demomanger.web.screens.major;

import com.haulmont.cuba.gui.screen.*;
import com.company.demomanger.entity.Major;

@UiController("demomanger_Major.edit")
@UiDescriptor("major-edit.xml")
@EditedEntityContainer("majorDc")
@LoadDataBeforeShow
public class MajorEdit extends StandardEditor<Major> {
}