insert into Postgrado 
  (id,nombre)
  values
  (1,"Seguridad"),
  (2,"Gestión de datos");

insert into Asignatura 
  (id,nombre,Posgrado_id)
  values
  (1,"red",1),
  (2,"Seguridad informática",1),
  (3,"datos",2),
  (4,"gestión",2);

insert into Materia 
  (codigo,nombre,Asignatura_id,descripcion)
  values
  ("RED1","redes 1",1,"bases de redes"),
  ("RED2","redes 2",1,"avanzado de redes"),
  ("SEG1","Seguridad 1",2,"avanzado de seg"),
  ("SEG2","Seguridad 2",2,"avanzado de seg"),
  ("DNSS","DNS",2,"Domain Name Server"),
  ("DAGE","datos gerenciales",3,"bases de gerencia"),
  ("DAAD","datos admon",3,"avanzado de administración"),
  ("GECO","gestion correcta",4,"correcta gestión de proyectos"),
  ("DACO","datos completos",4,"avanzado datos informáticos");

insert into Prerequisito
  (Materia_id,Materia_id_pre)
  values
  ("RED2","RED1"),
  ("SEG2","SEG1"),
  ("DNSS","SEG1"),
  ("GECO","DAGE");
  
insert into Corequisito
  (Materia_id,Materia_id_co)
  values
  ("DAGE","SEG1");