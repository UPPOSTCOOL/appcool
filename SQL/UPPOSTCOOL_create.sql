-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2017-05-21 22:58:09.425

-- tables
-- Table: Asign_Mater
CREATE TABLE Asign_Mater (
    Asignatura_id int  NOT NULL,
    Materia_codigo varchar  NOT NULL,
    CONSTRAINT Asign_Mater_pk PRIMARY KEY (Asignatura_id,Materia_codigo)
);

-- Table: Asignatura
CREATE TABLE Asignatura (
    nombre varchar  NOT NULL,
    Posgrado_id int  NOT NULL,
    id int  NOT NULL,
    CONSTRAINT Asignatura_ak_1 UNIQUE (nombre) NOT DEFERRABLE  INITIALLY IMMEDIATE,
    CONSTRAINT Asignatura_pk PRIMARY KEY (id)
);

-- Table: Clase
CREATE TABLE Clase (
    id int  NOT NULL,
    fecha timestamp  NOT NULL,
    horaFin time  NOT NULL,
    salon varchar  NOT NULL,
    Mater_Perio_Materia_id varchar  NOT NULL,
    Mater_Perio_cohorte int  NOT NULL,
    CONSTRAINT Clase_pk PRIMARY KEY (id)
);

-- Table: Clase_Recur
CREATE TABLE Clase_Recur (
    Clase_id int  NOT NULL,
    Recurso_id int  NOT NULL,
    CONSTRAINT Clase_Recur_pk PRIMARY KEY (Clase_id,Recurso_id)
);

-- Table: Comit_Profe
CREATE TABLE Comit_Profe (
    Profesor_id int  NOT NULL,
    Comite_id int  NOT NULL,
    CONSTRAINT Comit_Profe_pk PRIMARY KEY (Profesor_id,Comite_id)
);

-- Table: Comite
CREATE TABLE Comite (
    id int  NOT NULL,
    fecha timestamp  NOT NULL,
    CONSTRAINT Comite_pk PRIMARY KEY (id)
);

-- Table: Corequisito
CREATE TABLE Corequisito (
    Materia_id varchar  NOT NULL,
    Materia_id_co varchar  NOT NULL,
    Programa_id int  NOT NULL,
    CONSTRAINT Corequisito_pk PRIMARY KEY (Materia_id,Materia_id_co,Programa_id)
);

-- Table: Corequisito_A
CREATE TABLE Corequisito_A (
    Asignatura_id int  NOT NULL,
    Asignatura_id_co int  NOT NULL,
    CONSTRAINT Corequisito_A_pk PRIMARY KEY (Asignatura_id,Asignatura_id_co)
);

-- Table: HorarioProf
CREATE TABLE HorarioProf (
    id int  NOT NULL,
    dia int  NOT NULL,
    hora time  NOT NULL,
    Profesor_id int  NOT NULL,
    CONSTRAINT HorarioProf_pk PRIMARY KEY (id)
);

-- Table: Mater_Perio
CREATE TABLE Mater_Perio (
    Profesor_id int  NOT NULL,
    Materia_id varchar  NOT NULL,
    Periodo_id int  NOT NULL,
    cohorte int  NOT NULL,
    CONSTRAINT Mater_Perio_pk PRIMARY KEY (Materia_id,cohorte)
);

-- Table: Materia
CREATE TABLE Materia (
    codigo varchar  NOT NULL,
    nombre varchar  NOT NULL,
    descripcion varchar  NOT NULL,
    CONSTRAINT Materia_pk PRIMARY KEY (codigo)
);

-- Table: Periodo
CREATE TABLE Periodo (
    id int  NOT NULL,
    ano int  NOT NULL,
    semestre int  NOT NULL,
    CONSTRAINT Periodo_pk PRIMARY KEY (id)
);

-- Table: Prerequisito
CREATE TABLE Prerequisito (
    Materia_id varchar  NOT NULL,
    Materia_id_pre varchar  NOT NULL,
    Programa_id int  NOT NULL,
    CONSTRAINT Prerequisito_pk PRIMARY KEY (Materia_id,Materia_id_pre,Programa_id)
);

-- Table: Prerequisito_A
CREATE TABLE Prerequisito_A (
    Asignatura_id int  NOT NULL,
    Asignatura_id_pre int  NOT NULL,
    CONSTRAINT Prerequisito_A_pk PRIMARY KEY (Asignatura_id,Asignatura_id_pre)
);

-- Table: Profesor
CREATE TABLE Profesor (
    id int  NOT NULL,
    nombre varchar  NOT NULL,
    CONSTRAINT Profesor_pk PRIMARY KEY (id)
);

-- Table: Programa
CREATE TABLE Programa (
    id int  NOT NULL,
    nombre varchar  NOT NULL,
    CONSTRAINT Programa_ak_1 UNIQUE (nombre) NOT DEFERRABLE  INITIALLY IMMEDIATE,
    CONSTRAINT Programa_pk PRIMARY KEY (id)
);

-- Table: Recurso
CREATE TABLE Recurso (
    id int  NOT NULL,
    nombre varchar  NOT NULL,
    CONSTRAINT Recurso_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: Asign_Mater_Asignatura (table: Asign_Mater)
ALTER TABLE Asign_Mater ADD CONSTRAINT Asign_Mater_Asignatura
    FOREIGN KEY (Asignatura_id)
    REFERENCES Asignatura (id)
    ON DELETE  RESTRICT 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Asign_Mater_Materia (table: Asign_Mater)
ALTER TABLE Asign_Mater ADD CONSTRAINT Asign_Mater_Materia
    FOREIGN KEY (Materia_codigo)
    REFERENCES Materia (codigo)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Asignatura_Programa (table: Asignatura)
ALTER TABLE Asignatura ADD CONSTRAINT Asignatura_Programa
    FOREIGN KEY (Posgrado_id)
    REFERENCES Programa (id)
    ON DELETE  RESTRICT 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Asing_Cohor_Profesor (table: Mater_Perio)
ALTER TABLE Mater_Perio ADD CONSTRAINT Asing_Cohor_Profesor
    FOREIGN KEY (Profesor_id)
    REFERENCES Profesor (id)
    ON DELETE  RESTRICT 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Clase_Mater_Perio (table: Clase)
ALTER TABLE Clase ADD CONSTRAINT Clase_Mater_Perio
    FOREIGN KEY (Mater_Perio_Materia_id, Mater_Perio_cohorte)
    REFERENCES Mater_Perio (Materia_id, cohorte)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Clase_Recur_Clase (table: Clase_Recur)
ALTER TABLE Clase_Recur ADD CONSTRAINT Clase_Recur_Clase
    FOREIGN KEY (Clase_id)
    REFERENCES Clase (id)
    ON DELETE  RESTRICT 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Clase_Recur_Recurso (table: Clase_Recur)
ALTER TABLE Clase_Recur ADD CONSTRAINT Clase_Recur_Recurso
    FOREIGN KEY (Recurso_id)
    REFERENCES Recurso (id)
    ON DELETE  RESTRICT 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Comit_Profe_Comite (table: Comit_Profe)
ALTER TABLE Comit_Profe ADD CONSTRAINT Comit_Profe_Comite
    FOREIGN KEY (Comite_id)
    REFERENCES Comite (id)
    ON DELETE  RESTRICT 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Comit_Profe_Profesor (table: Comit_Profe)
ALTER TABLE Comit_Profe ADD CONSTRAINT Comit_Profe_Profesor
    FOREIGN KEY (Profesor_id)
    REFERENCES Profesor (id)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Corequisito_Asignatura (table: Corequisito_A)
ALTER TABLE Corequisito_A ADD CONSTRAINT Corequisito_Asignatura
    FOREIGN KEY (Asignatura_id)
    REFERENCES Asignatura (id)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Corequisito_Asignatura_2 (table: Corequisito_A)
ALTER TABLE Corequisito_A ADD CONSTRAINT Corequisito_Asignatura_2
    FOREIGN KEY (Asignatura_id_co)
    REFERENCES Asignatura (id)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Corequisito_Materia (table: Corequisito)
ALTER TABLE Corequisito ADD CONSTRAINT Corequisito_Materia
    FOREIGN KEY (Materia_id)
    REFERENCES Materia (codigo)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Corequisito_Materia2 (table: Corequisito)
ALTER TABLE Corequisito ADD CONSTRAINT Corequisito_Materia2
    FOREIGN KEY (Materia_id_co)
    REFERENCES Materia (codigo)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Corequisito_Programa (table: Corequisito)
ALTER TABLE Corequisito ADD CONSTRAINT Corequisito_Programa
    FOREIGN KEY (Programa_id)
    REFERENCES Programa (id)
    ON DELETE  RESTRICT 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: HorarioProf_Profesor (table: HorarioProf)
ALTER TABLE HorarioProf ADD CONSTRAINT HorarioProf_Profesor
    FOREIGN KEY (Profesor_id)
    REFERENCES Profesor (id)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Mater_Cohor_Materia (table: Mater_Perio)
ALTER TABLE Mater_Perio ADD CONSTRAINT Mater_Cohor_Materia
    FOREIGN KEY (Materia_id)
    REFERENCES Materia (codigo)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Mater_Cohor_Periodo (table: Mater_Perio)
ALTER TABLE Mater_Perio ADD CONSTRAINT Mater_Cohor_Periodo
    FOREIGN KEY (Periodo_id)
    REFERENCES Periodo (id)
    ON DELETE  RESTRICT 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Prerequisito_Asignatura (table: Prerequisito_A)
ALTER TABLE Prerequisito_A ADD CONSTRAINT Prerequisito_Asignatura
    FOREIGN KEY (Asignatura_id_pre)
    REFERENCES Asignatura (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Prerequisito_Asignatura_2 (table: Prerequisito_A)
ALTER TABLE Prerequisito_A ADD CONSTRAINT Prerequisito_Asignatura_2
    FOREIGN KEY (Asignatura_id)
    REFERENCES Asignatura (id)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Prerequisito_Materia (table: Prerequisito)
ALTER TABLE Prerequisito ADD CONSTRAINT Prerequisito_Materia
    FOREIGN KEY (Materia_id)
    REFERENCES Materia (codigo)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Prerequisito_Materia2 (table: Prerequisito)
ALTER TABLE Prerequisito ADD CONSTRAINT Prerequisito_Materia2
    FOREIGN KEY (Materia_id_pre)
    REFERENCES Materia (codigo)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Prerequisito_Programa (table: Prerequisito)
ALTER TABLE Prerequisito ADD CONSTRAINT Prerequisito_Programa
    FOREIGN KEY (Programa_id)
    REFERENCES Programa (id)
    ON DELETE  RESTRICT 
    ON UPDATE  CASCADE 
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

