create table DEMOMANGER_STUDENT (
    ID bigserial,
    UUID uuid,
    --
    STUDENT_CODE varchar(50) not null,
    FULL_NAME varchar(255) not null,
    GENDER varchar(10) not null,
    ADDRESS varchar(255) not null,
    PHONE_NUMBER varchar(255) not null,
    EMAIL varchar(255) not null,
    CLAZZ_ID bigint not null,
    --
    primary key (ID)
);