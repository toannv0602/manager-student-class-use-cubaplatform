-- alter table DEMOMANGER_STUDENT add column MAJOR_ID bigint ^
-- update DEMOMANGER_STUDENT set MAJOR_ID = <default_value> ;
-- alter table DEMOMANGER_STUDENT alter column MAJOR_ID set not null ;
alter table DEMOMANGER_STUDENT add column MAJOR_ID bigint not null ;
