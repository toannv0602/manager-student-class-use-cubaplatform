alter table DEMOMANGER_CLAZZ add constraint FK_DEMOMANGER_CLAZZ_ON_TEACHER foreign key (TEACHER_ID) references DEMOMANGER_TEACHER(ID);
create unique index IDX_DEMOMANGER_CLAZZ_UK_CLAZZ_NAME on DEMOMANGER_CLAZZ (CLAZZ_NAME);
create index IDX_DEMOMANGER_CLAZZ_ON_TEACHER on DEMOMANGER_CLAZZ (TEACHER_ID);