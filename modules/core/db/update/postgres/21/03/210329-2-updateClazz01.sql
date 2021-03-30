-- alter table DEMOMANGER_CLAZZ add column MAJOR_ID bigint ^
-- update DEMOMANGER_CLAZZ set MAJOR_ID = <default_value> ;
-- alter table DEMOMANGER_CLAZZ alter column MAJOR_ID set not null ;
alter table DEMOMANGER_CLAZZ add column MAJOR_ID bigint not null ;
