-- begin DEMOMANGER_STUDENT
alter table DEMOMANGER_STUDENT add constraint FK_DEMOMANGER_STUDENT_ON_MAJOR foreign key (MAJOR_ID) references DEMOMANGER_MAJOR(ID)^
alter table DEMOMANGER_STUDENT add constraint FK_DEMOMANGER_STUDENT_ON_CLAZZ foreign key (CLAZZ_ID) references DEMOMANGER_CLAZZ(ID)^
create unique index IDX_DEMOMANGER_STUDENT_UK_EMAIL on DEMOMANGER_STUDENT (EMAIL)^
create unique index IDX_DEMOMANGER_STUDENT_UK_PHONE_NUMBER on DEMOMANGER_STUDENT (PHONE_NUMBER)^
create unique index IDX_DEMOMANGER_STUDENT_UK_STUDENT_CODE on DEMOMANGER_STUDENT (STUDENT_CODE)^
create index IDX_DEMOMANGER_STUDENT_ON_MAJOR on DEMOMANGER_STUDENT (MAJOR_ID)^
create index IDX_DEMOMANGER_STUDENT_ON_CLAZZ on DEMOMANGER_STUDENT (CLAZZ_ID)^
-- end DEMOMANGER_STUDENT
-- begin DEMOMANGER_TEACHER
alter table DEMOMANGER_TEACHER add constraint FK_DEMOMANGER_TEACHER_ON_MAJOR foreign key (MAJOR_ID) references DEMOMANGER_MAJOR(ID)^
create unique index IDX_DEMOMANGER_TEACHER_UK_TEACHER_CODE on DEMOMANGER_TEACHER (TEACHER_CODE)^
create unique index IDX_DEMOMANGER_TEACHER_UK_EMAIL on DEMOMANGER_TEACHER (EMAIL)^
create index IDX_DEMOMANGER_TEACHER_ON_MAJOR on DEMOMANGER_TEACHER (MAJOR_ID)^
-- end DEMOMANGER_TEACHER
-- begin DEMOMANGER_CLAZZ
alter table DEMOMANGER_CLAZZ add constraint FK_DEMOMANGER_CLAZZ_ON_MAJOR foreign key (MAJOR_ID) references DEMOMANGER_MAJOR(ID)^
alter table DEMOMANGER_CLAZZ add constraint FK_DEMOMANGER_CLAZZ_ON_TEACHER foreign key (TEACHER_ID) references DEMOMANGER_TEACHER(ID)^
create unique index IDX_DEMOMANGER_CLAZZ_UK_CLAZZ_NAME on DEMOMANGER_CLAZZ (CLAZZ_NAME)^
create index IDX_DEMOMANGER_CLAZZ_ON_MAJOR on DEMOMANGER_CLAZZ (MAJOR_ID)^
create index IDX_DEMOMANGER_CLAZZ_ON_TEACHER on DEMOMANGER_CLAZZ (TEACHER_ID)^
-- end DEMOMANGER_CLAZZ
-- begin DEMOMANGER_MAJOR
create unique index IDX_DEMOMANGER_MAJOR_UK_NAME on DEMOMANGER_MAJOR (NAME)^
-- end DEMOMANGER_MAJOR
