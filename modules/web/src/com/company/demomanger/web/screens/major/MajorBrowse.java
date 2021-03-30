package com.company.demomanger.web.screens.major;

import com.haulmont.cuba.gui.screen.*;
import com.company.demomanger.entity.Major;

@UiController("demomanger_Major.browse")
@UiDescriptor("major-browse.xml")
@LookupComponent("majorsTable")
@LoadDataBeforeShow
public class MajorBrowse extends StandardLookup<Major> {
}