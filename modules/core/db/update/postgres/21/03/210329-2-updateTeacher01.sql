alter table DEMOMANGER_TEACHER add constraint FK_DEMOMANGER_TEACHER_ON_MAJOR foreign key (MAJOR_ID) references DEMOMANGER_MAJOR(ID);
create index IDX_DEMOMANGER_TEACHER_ON_MAJOR on DEMOMANGER_TEACHER (MAJOR_ID);
