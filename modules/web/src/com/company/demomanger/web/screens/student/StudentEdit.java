package com.company.demomanger.web.screens.student;

import com.company.demomanger.entity.Clazz;
import com.company.demomanger.service.ClazzService;
import com.company.demomanger.service.StudentService;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.screen.*;
import com.company.demomanger.entity.Student;

import javax.inject.Inject;

@UiController("demomanger_Student.edit")
@UiDescriptor("student-edit.xml")
@EditedEntityContainer("studentDc")
@LoadDataBeforeShow
public class StudentEdit extends StandardEditor<Student> {

    @Inject
    private LookupPickerField<Clazz> clazzField;

    @Inject
    private ClazzService clazzService;


    @Inject
    private StudentService studentService;

    private static boolean IS_CREATE = false;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Student> event) {
        IS_CREATE = true;
    }


    @Subscribe("commitAndCloseBtn")
    public void onCommitAndCloseBtnClick(Button.ClickEvent event) {
        if(IS_CREATE){
            updateCountStudent();
        }
    }

    private void updateCountStudent(){
        Clazz clazz = clazzField.getValue();
        int count = studentService.getStudentByClass(clazz).size();
        clazzService.changeCountStudent(count,clazz);
    }

}