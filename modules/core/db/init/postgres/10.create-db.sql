-- begin DEMOMANGER_STUDENT
create table DEMOMANGER_STUDENT (
    ID bigserial,
    UUID uuid,
    --
    MAJOR_ID bigint not null,
    STUDENT_CODE varchar(50) not null,
    FULL_NAME varchar(255) not null,
    GENDER varchar(10) not null,
    ADDRESS varchar(255) not null,
    PHONE_NUMBER varchar(255) not null,
    EMAIL varchar(255) not null,
    CLAZZ_ID bigint not null,
    --
    primary key (ID)
)^
-- end DEMOMANGER_STUDENT
-- begin DEMOMANGER_TEACHER
create table DEMOMANGER_TEACHER (
    ID bigserial,
    UUID uuid,
    --
    MAJOR_ID bigint,
    TEACHER_CODE varchar(255) not null,
    FULL_NAME varchar(255) not null,
    ADRESS varchar(255),
    EMAIL varchar(255) not null,
    PHONE_NUMBER varchar(20),
    DOB timestamp,
    --
    primary key (ID)
)^
-- end DEMOMANGER_TEACHER
-- begin DEMOMANGER_CLAZZ
create table DEMOMANGER_CLAZZ (
    ID bigserial,
    UUID uuid,
    --
    COUNT integer,
    MAJOR_ID bigint not null,
    CLAZZ_NAME varchar(20) not null,
    TEACHER_ID bigint not null,
    --
    primary key (ID)
)^
-- end DEMOMANGER_CLAZZ
-- begin DEMOMANGER_MAJOR
create table DEMOMANGER_MAJOR (
    ID bigserial,
    UUID uuid,
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end DEMOMANGER_MAJOR
