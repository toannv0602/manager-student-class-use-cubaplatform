create table DEMOMANGER_TEACHER (
    ID bigserial,
    UUID uuid,
    --
    TEACHER_CODE varchar(255) not null,
    FULL_NAME varchar(255) not null,
    ADRESS varchar(255),
    EMAIL varchar(255) not null,
    PHONE_NUMBER varchar(20),
    DOB timestamp,
    --
    primary key (ID)
);