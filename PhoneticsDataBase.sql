create database Project;
use Project;

create table Phonetics (

tagId  char(5) not null, 

sentencetext text,
sentencetranscription text,

audiosample longblob,

primary key (tagId)
);
select * from Phonetics;

drop table Phonetics;

SELECT CCSA.character_set_name FROM information_schema.`TABLES` T,
information_schema.`COLLATION_CHARACTER_SET_APPLICABILITY` CCSA WHERE CCSA.collation_name = T.table_collation 
AND T.table_schema = "Project" AND T.table_name = "Phonetics";

ALTER DATABASE PROJECT CHARACTER SET utf8_general_ci;


