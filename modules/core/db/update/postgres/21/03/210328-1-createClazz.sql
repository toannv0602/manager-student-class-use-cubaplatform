create table DEMOMANGER_CLAZZ (
    ID bigserial,
    UUID uuid,
    --
    CLAZZ_NAME varchar(20) not null,
    TEACHER_ID bigint not null,
    --
    primary key (ID)
);