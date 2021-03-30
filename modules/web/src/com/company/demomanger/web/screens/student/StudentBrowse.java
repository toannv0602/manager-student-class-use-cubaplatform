package com.company.demomanger.web.screens.student;

import com.company.demomanger.entity.Clazz;
import com.company.demomanger.service.ClazzService;
import com.company.demomanger.service.StudentService;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.company.demomanger.entity.Student;

import javax.inject.Inject;

@UiController("demomanger_Student.browse")
@UiDescriptor("student-browse.xml")
@LookupComponent("studentsTable")
@LoadDataBeforeShow
public class StudentBrowse extends StandardLookup<Student> {
    @Inject
    private GroupTable<Student> studentsTable;

    @Inject
    private StudentService studentService;

    @Inject
    private ClazzService clazzService;

    @Subscribe("studentsTable")
    public void onStudentsTableSelection(Table.SelectionEvent<Student> event) {
        Student student = studentsTable.getSingleSelected();
        
    }



    @Subscribe("removeBtn")
    public void onRemoveBtnClick(Button.ClickEvent event) {
        updateCountStudent();
    }

    private void updateCountStudent(){
        Student student = studentsTable.getSingleSelected();
        Clazz clazz = clazzService.getById(student.getClazz().getUuid());
        int count  = studentService.getStudentByClass(clazz).size();
        clazzService.changeCountStudent(count,clazz);
    }

    
}