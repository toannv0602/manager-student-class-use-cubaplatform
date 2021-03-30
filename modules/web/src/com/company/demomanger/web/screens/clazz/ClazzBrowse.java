package com.company.demomanger.web.screens.clazz;

import com.haulmont.cuba.gui.screen.*;
import com.company.demomanger.entity.Clazz;

@UiController("demomanger_Clazz.browse")
@UiDescriptor("clazz-browse.xml")
@LookupComponent("clazzesTable")
@LoadDataBeforeShow
public class ClazzBrowse extends StandardLookup<Clazz> {
}