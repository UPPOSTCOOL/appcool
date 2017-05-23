insert into Programa
  (id,nombre)
  values
  (1,'Seguridad'),
  (2,'Gestion de datos');

insert into Asignatura 
  (id,nombre,Posgrado_id)
  values
  (1,'red',1),
  (2,'Seguridad informatica',1),
  (3,'datos',2),
  (4,'gestion',2);

insert into Prerequisito_A
  (Asignatura_id,Asignatura_id_pre)
  values
  (3,4);

insert into Corequisito_A
  (Asignatura_id,Asignatura_id_co)
  values
  (1,2);

insert into Materia 
  (codigo,nombre,descripcion)
  values
  ('RED1','redes 1','bases de redes'),						--1,2
  ('RED2','redes 2','avanzado de redes'),						--1,2
  ('SEG1','Seguridad 1','avanzado de seg'),					--3
  ('SEG2','Seguridad 2','avanzado de seg'),					--3
  ('DNSS','DNS','Domain Name Server'),						--1
  ('DAGE','datos gerenciales','bases de gerencia'),			--4
  ('DAAD','datos admon','avanzado de administracion'),		--5
  ('GECO','gestion correcta','correcta gestion de proyectos'),--3,4
  ('DACO','datos completos','avanzado datos informaticos');	--2,5

insert into Asign_Mater
  (Materia_codigo,Asignatura_id)
  values
	('RED1',1),
	('RED2',1),
	('SEG1',2),
	('SEG2',2),
	('DNSS',2),
	('DAGE',3),
	('DAAD',3),
	('GECO',4),
	('DACO',4);

insert into Prerequisito
  (Materia_id,Materia_id_pre,programa_id)
  values
  ('RED2','RED1',1),
  ('SEG2','SEG1',1),
  ('DNSS','SEG1',2),
  ('GECO','DAGE',2);
  
insert into Corequisito
  (Materia_id,Materia_id_co,programa_id)
  values
  ('DAGE','SEG1',1);

insert into Periodo
  (id,ano,semestre)
  values
  (1,2016,1),
  (2,2016,3),
  (3,2016,2),
  (4,2017,1);

insert into Profesor
  (id,nombre)
  values
  (1,'Claudia Santiago'),	--RED1,RED2,DNSS
  (2,'Gerardo Ospina'),		--RED1,RED2,DACO
  (3,'Patricia alvarez'),	--SEG1,SEG2,GECO
  (4,'Oswaldo Castillo'),	--DAGE,GECO
  (5,'Rodrigo Lopez');		--DAAD,DACO

insert into Mater_Perio
  (Materia_id,cohorte,Profesor_id,Periodo_id)
  values
	--semestre 2016-1
	('RED1',1,1,1),
	('RED2',1,1,1),
	('SEG1',1,3,1),
	('SEG2',1,3,1),
	('DNSS',1,1,1),
	('DAGE',1,4,1),
	('DAAD',1,5,1),
	('GECO',1,3,1),
	('DACO',1,2,1),
	--semestre 2016-3
	('RED1',2,1,2),
	('RED1',3,1,2),
	('RED2',2,1,2),
	('SEG1',2,3,2),
	('SEG1',3,3,2),
	('SEG2',2,3,2),
	('DNSS',2,1,2),
	('DAGE',2,4,2),
	('DAAD',2,5,2),
	('GECO',2,3,2),
	('DACO',2,2,2),
	('DACO',3,2,2),
	--semestre 2016-2
	('RED1',4,1,3),
	('RED2',3,1,3),
	('SEG1',4,3,3),
	('SEG2',3,3,3),
	('DNSS',3,1,3),
	('DAGE',3,4,3),
	('DAAD',3,5,3),
	('GECO',3,3,3),
	('DACO',4,2,3),
	--semestre 2017-1
	('RED1',5,1,4),
	('RED1',6,2,4),
	('RED2',4,1,4),
	('RED2',5,2,4),
	('SEG1',5,3,4),
	('SEG2',4,3,4),
	('DNSS',4,1,4),
	('DAGE',4,4,4),
	('DAAD',4,5,4),
	('GECO',4,3,4),
	('GECO',5,4,4),
	('DACO',5,2,4),
	('DACO',6,5,4);

insert into Clase
  (id,fecha,horaFin,salon,Mater_Perio_Materia_id,Mater_Perio_cohorte)
  values
	--semestre 2016-1
	(1,'2016-02-01 10:00:00','11:00:00','101','RED1',1),
	(2,'2016-02-02 11:00:00','12:00:00','102','RED2',1),
	(3,'2016-02-03 12:00:00','13:00:00','103','SEG1',1),
	(4,'2016-02-04 13:00:00','14:00:00','104','SEG2',1),
	(5,'2016-02-05 14:00:00','15:00:00','201','DNSS',1),
	(6,'2016-02-06 15:00:00','16:00:00','202','DAGE',1),
	(7,'2016-02-07 16:00:00','17:00:00','203','DAAD',1),
	(8,'2016-02-08 17:00:00','18:00:00','204','GECO',1),
	(9,'2016-02-09 18:00:00','19:00:00','301','DACO',1),
	--semestre 2016-3
	(10,'2016-06-01 07:00:00','08:00:00','101','RED1',2),
	(11,'2016-06-02 08:00:00','09:00:00','102','RED1',3),
	(12,'2016-06-03 09:00:00','10:00:00','103','RED2',2),
	(13,'2016-06-04 10:00:00','11:00:00','104','SEG1',2),
	(14,'2016-06-05 11:00:00','12:00:00','201','SEG1',3),
	(15,'2016-06-06 12:00:00','13:00:00','202','SEG2',2),
	(16,'2016-06-07 13:00:00','14:00:00','203','DNSS',2),
	(17,'2016-06-08 14:00:00','15:00:00','204','DAGE',2),
	(18,'2016-06-09 15:00:00','16:00:00','301','DAAD',2),
	(19,'2016-06-10 16:00:00','17:00:00','302','GECO',2),
	(20,'2016-06-11 17:00:00','18:00:00','303','DACO',2),
	(21,'2016-06-12 18:00:00','19:00:00','304','DACO',3),
	--semestre 2016-2
	(22,'2016-09-01 10:00:00','11:00:00','101','RED1',4),
	(23,'2016-09-02 11:00:00','12:00:00','102','RED2',3),
	(24,'2016-09-03 12:00:00','13:00:00','103','SEG1',4),
	(25,'2016-09-04 13:00:00','14:00:00','104','SEG2',3),
	(26,'2016-09-05 14:00:00','15:00:00','201','DNSS',3),
	(27,'2016-09-06 15:00:00','16:00:00','202','DAGE',3),
	(28,'2016-09-07 16:00:00','17:00:00','203','DAAD',3),
	(29,'2016-09-08 17:00:00','18:00:00','204','GECO',3),
	(30,'2016-09-09 18:00:00','19:00:00','301','DACO',4),
	--semestre 2017-1
	(31,'2017-02-01 07:00:00','08:00:00','101','RED1',5),
	(32,'2017-02-02 08:00:00','09:00:00','102','RED1',6),
	(33,'2017-02-03 09:00:00','10:00:00','103','RED2',4),
	(34,'2017-02-04 10:00:00','11:00:00','104','RED2',5),
	(35,'2017-02-05 11:00:00','12:00:00','201','SEG1',5),
	(36,'2017-02-06 12:00:00','13:00:00','202','SEG2',4),
	(37,'2017-02-07 13:00:00','14:00:00','203','DNSS',4),
	(38,'2017-02-08 14:00:00','15:00:00','204','DAGE',4),
	(39,'2017-02-09 15:00:00','16:00:00','301','DAAD',4),
	(40,'2017-02-10 16:00:00','17:00:00','302','GECO',4),
	(41,'2017-02-11 17:00:00','18:00:00','303','GECO',5),
	(42,'2017-02-12 18:00:00','19:00:00','304','DACO',5),
	(43,'2017-02-13 19:00:00','20:00:00','401','DACO',6);