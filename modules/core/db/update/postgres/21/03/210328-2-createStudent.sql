alter table DEMOMANGER_STUDENT add constraint FK_DEMOMANGER_STUDENT_ON_CLAZZ foreign key (CLAZZ_ID) references DEMOMANGER_CLAZZ(ID);
create unique index IDX_DEMOMANGER_STUDENT_UK_EMAIL on DEMOMANGER_STUDENT (EMAIL);
create unique index IDX_DEMOMANGER_STUDENT_UK_PHONE_NUMBER on DEMOMANGER_STUDENT (PHONE_NUMBER);
create unique index IDX_DEMOMANGER_STUDENT_UK_STUDENT_CODE on DEMOMANGER_STUDENT (STUDENT_CODE);
create index IDX_DEMOMANGER_STUDENT_ON_CLAZZ on DEMOMANGER_STUDENT (CLAZZ_ID);
