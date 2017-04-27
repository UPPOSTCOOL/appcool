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
  values---------
  (1,"redes 1",1),
  (2,"redes 2",1),
  (3,"Seguridad 1",1),
  (4,"Seguridad 2",1),
  (5,"DNS",1),
  (6,"datos gerenciales",2),
  (7,"datos admon",2),
  (8,"gestion correcta",2),
  (9,"datos completos",2);
