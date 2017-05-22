# UPPOST-COOL 

Nombre del Proyecto: UPPOST-COOL
Asignatura: Proceso de Desarrollo de Sooftware 
Periodo Academico: 2017-1 (PDSW)

Rol - Integrante:                    
- Team: Carol Johana Meneses Pineda    
- Team: Maria Paula Pinzón Cardozo
- Team: Javier Fernando silva leon
- Scrum master: Juan felipe Ortiz Niño   
- Team: Kevin Julian Alavarado Pérez
- Team: Manuel Sergio Pérez Espitia   
- Product Owner: Hector Fabio Cadavid Rengifo

# Descrición General

<------------------------------>

-   Funcionalidades 

<------------------------------>

# Arquitectura

Modelo E-R

<-----------Modelo entidad relación------------------->

Capa de presentación 

<------------------------------>

Caoa Lógica

<------------------------------>

Capa de Persistencia

<------------------------------>

Stack Tecnológico

Lenguaje: Java 1.8
Gestión: Maven Apache 4.0.0
Web: JavaServer Pages (JSP)
Framework visual: JavaServer Faces (JSF)
Biblioteca visual: PrimeFaces 5.0
Inyección-persistencia: MyBatis 3.2.7
Creación MyBatis: Google Guice
Tag Libraries para JSP: JSTL 1.2
BD: PostgreSQL 42.0.0
Registro: Log4j 1.2.17
Administrado BD: H2 1.4.184
Entorno Web: Tomcat 7
Pruebas: Maven Surefire 2.18.1

Aplicación: https://appcool.herokuapp.com



Desarrollo de la aplicación por el equipo UPPOST-COOL según la metodologia SCRUM vista en el curso de PDSW, el proyecto esta divido en 3 Sprints.

Plataforma de programación de clases y gestión de recursos de programas de postgrado de la Unidad de Proyectos de la Escuela Colombiana de Ingeniería

Visión de Producto

La plataforma UP-POST, es una herramienta que ha permitido simplificar significativamente los procesos de la Unidad de Proyectos, en el caso particular de los programas de postgrado manejados por la misma. UP-POST, al adaptarse a la naturaleza particular de los programas de postgrado de la unidad en mención -como el no tener el esquema convencional de programación por semanas de los cursos-, además de simplificar la labor de programación de cursos cada periodo académico, permite la consolidación de datos históricos y por ende, la generación de reportes estratégicos para los procesos de mejoramiento contínuo de esta unidad.


Detalles provistos por el Stakeholder.

- La unidad de proyectos cuenta, por ahora, con dos programas de postgrado. Cada programa se compone de diferentes asignaturas, las cuales –a su vez- se componen de una secuencia de Materias, donde la secuencia implica el orden en el cual se deben ver las asignaturas. Es decir, dentro de una Asignatura, una Materia es pre-requisito de otra. Los prerequisitos pueden ser: completos (es decir, si A es prerequisito de B, la asignatura A debe terminarse ANTES de poder ver B), o co-requisitos (es decir, si A es correquisito de B, se acepta que A pueda verse al tiempo que B).

- La programación de las clases de cada periodo académico se hace a partir de las materias antes mencionadas. Cada vez que se dicta un curso en un nuevo periodo académico, se le asocia una COHORTE y su respectivo profesor. La programación de las clases (asociadas a la materia), a diferencia de los programas convencionales, NO es por semana, sino es en días específicos del periodo académico (por ejemplo, una materia podría verse en un solo dia del periodo académico, o en 15 días sin una periodicidad en particular). Se debe tener en cuenta que un curso, en un determinado periodo, puede dictarse a estudiantes de diferentes programas. Esto significa que dicho curso podría estar asociado a DOS cohortes diferentes, cada una de éstas asociadas a los respectivos programas. Con esto, se debe tener en cuenta que al momento de mostrar la información de un periodo determinado, el detalle de 'COHORTE' de un curso puede tener más de un elemento (tantas cohortes como programas en los cuales se dictaría dicho curso). 

- Al momento de hacer una programación de clases, es necesario validar:

  Que el horario seleccionado no esté por fuera del periodo académico que ese esté programando.

  Que en el horario seleccionado, el profesor (i) esté dentro de los horarios semanales disponibles registrados por el profesor, y (ii) no esté previamente asignado a otro curso de del mismo profesor.
  En caso de que la programación de la clase requiera de recursos (mesa de portátiles, herramientas, etc), las mismas estén disponibles en dicho horario (no reservada para otra clase al mismo tiempo).

  Si el curso que se va a programar tiene un pre-requisito, que el horario NO esté antes de la fecha de finalización de dicho pre-requisito si el pre-requisito es completo, y que no esté antes de la fecha de inicio del mismo si el co-requisito.

- En ocasiones, se requiere de la programación de comités (conformados por profesores) para determinadas fechas y horas en el periodo académico. De la misma manera, el sistema debería permitir la programación de reuniones de comité teniendo en cuenta las restricciones de horario de sus integrantes.



Equipo UPPOST-COOL
