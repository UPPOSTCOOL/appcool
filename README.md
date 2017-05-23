# UPPOST-COOL 

![alt text](https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/appcool2.jpeg)

Nombre del Proyecto: [UPPOST-COOL](https://github.com/UPPOSTCOOL)

Nombre de la Aplicación: [AppCOOL](https://appcool.herokuapp.com)

Asignatura: Proceso de Desarrollo de Sooftware - [PDSW](https://github.com/PDSW-ECI)

Periodo Academico: 2017-1 

## Rol - Integrante:   

|No.| Rol            | Nombre                        |
|:--|:---------------|:------------------------------|
|1  | team           | [Carol Johana Meneses Pineda](https://github.com/orgs/UPPOSTCOOL/people/carolMeneses)   |   
|2  | team           | [Maria Paula Pinzón Cardozo](https://github.com/orgs/UPPOSTCOOL/people/MariaPaulaP)    |
|3  | team           | [Javier Fernando Silva León](https://github.com/orgs/UPPOSTCOOL/people/javierfsilva7)    |
|4  | Scrum master   | [Juan felipe Ortiz Niño](https://github.com/orgs/UPPOSTCOOL/people/JuanFelipeON)        |
|5  | team           | [Kevin Julian Alavarado Pérez](https://github.com/orgs/UPPOSTCOOL/people/kvncf)  |
|6  | team           | [Manuel Sergio Pérez Espitia](https://github.com/orgs/UPPOSTCOOL/people/dark07perez)   |
|7  | Product Owner  | [Hector Fabio Cadavid Rengifo](https://github.com/hcadavid)  |


# Descripción del Producto

## Visión del Producto

La plataforma UP-POST, es una herramienta que ha permitido simplificar significativamente los procesos de la Unidad de Proyectos, en el caso particular de los programas de postgrado manejados por la misma. UP-POST, al adaptarse a la naturaleza particular de los programas de postgrado de la unidad en mención -como el no tener el esquema convencional de programación por semanas de los cursos-, además de simplificar la labor de programación de cursos cada periodo académico, permite la consolidación de datos históricos y por ende, la generación de reportes estratégicos para los procesos de mejoramiento contínuo de esta unidad.


## Detalles provistos por el Stakeholder.

- La unidad de proyectos cuenta, por ahora, con dos programas de postgrado. Cada programa se compone de diferentes asignaturas, las cuales –a su vez- se componen de una secuencia de Materias, donde la secuencia implica el orden en el cual se deben ver las asignaturas. Es decir, dentro de una Asignatura, una Materia es pre-requisito de otra. Los prerequisitos pueden ser: completos (es decir, si A es prerequisito de B, la asignatura A debe terminarse ANTES de poder ver B), o co-requisitos (es decir, si A es correquisito de B, se acepta que A pueda verse al tiempo que B).

- La programación de las clases de cada periodo académico se hace a partir de las materias antes mencionadas. Cada vez que se dicta un curso en un nuevo periodo académico, se le asocia una COHORTE y su respectivo profesor. La programación de las clases (asociadas a la materia), a diferencia de los programas convencionales, NO es por semana, sino es en días específicos del periodo académico (por ejemplo, una materia podría verse en un solo dia del periodo académico, o en 15 días sin una periodicidad en particular). Se debe tener en cuenta que un curso, en un determinado periodo, puede dictarse a estudiantes de diferentes programas. Esto significa que dicho curso podría estar asociado a DOS cohortes diferentes, cada una de éstas asociadas a los respectivos programas. Con esto, se debe tener en cuenta que al momento de mostrar la información de un periodo determinado, el detalle de 'COHORTE' de un curso puede tener más de un elemento (tantas cohortes como programas en los cuales se dictaría dicho curso). 

- Al momento de hacer una programación de clases, es necesario validar:

  Que el horario seleccionado no esté por fuera del periodo académico que ese esté programando.

  Que en el horario seleccionado, el profesor (i) esté dentro de los horarios semanales disponibles registrados por el profesor, y (ii) no esté previamente asignado a otro curso de del mismo profesor.
  En caso de que la programación de la clase requiera de recursos (mesa de portátiles, herramientas, etc), las mismas estén disponibles en dicho horario (no reservada para otra clase al mismo tiempo).

  Si el curso que se va a programar tiene un pre-requisito, que el horario NO esté antes de la fecha de finalización de dicho pre-requisito si el pre-requisito es completo, y que no esté antes de la fecha de inicio del mismo si el co-requisito.

- En ocasiones, se requiere de la programación de comités (conformados por profesores) para determinadas fechas y horas en el periodo académico. De la misma manera, el sistema debería permitir la programación de reuniones de comité teniendo en cuenta las restricciones de horario de sus integrantes.


## Descrición General

UPPOST-COOL es un proyecto para desarrollar una aplicación para la gestión de horarios de los profesores.

La aplicación solicita un login, por ahora es **admin** con contraseña *admin* 
![alt text][login]

Y enseguida se muestra un indice donde se muestran las funcionaldiades principales: 
![alt text][indice]



[login]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/login.png
[indice]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/funciones/indice.png


### Funcionalidades 

Con AppCOOL  el usuario puede consultar el *Reportes de Programación*, *Registrar una Materia*, consultar la *Programación de Peridos* y realizar el *Registro de una materia en un nuevo Cohorte*. Para consultar los reportes de Programación se debe ingresar el año y el semestre del periodo al cual se quiera consultar. Se puede consultar el *Reporte de Salones* que muestra le fecha y hora de inicio, hora de finalización de la clase, el salon las caracteristicas que debe tener el salon y la Materia de la cual hace parte la clase. 

---
![alt text][repo1]
---

Tambien se puede consultar el *Reporte de Programación* del periodo escogido y muestra el cohorte, la asignatura que ofrece, las Materias de la asignatura, el profesor encargado, las hora de la sesión y la cantidad de horas de cada una de ellas; a cada una de las materias se le pueden *Consultar los Salones* donde se describe la fecha de la clase, la hora de la clase y su duración. 

---
![alt text][repo2]
---

Por otra parte en Registrar Materia, se puede registrar una materia agregando los programas al cual va a pertenecer la materia, se agregan los Prerrequisitos y Correquitos, el nombre que se le quiere dar la materia, el codigo o Mnemónico y una descripción. En caso de que no exista la asignatura, tambien se puede crear cuando se estan agregando los programas. Luego de hacer el registro se pueden *Consultar las Naterias Registradas*.

---
![alt text][repo3]
---

Se ofrece la funcionalidad de Registrar una Materia en en Nuevo Cohorte y por último, en Programación de Periodo, se puede programar seleccionado uno existente. Tiene funciones como asignarle un Periodo, una Asignatura, una Materia y un cohorte, se puede acceder a la pagina de regsitro de Nuevo Periodo, Registrar Nueva Asignatura, Registrar Nueva Materia y Registrar Nuevo Cohorte desde acá. 

---
![alt text][repo4]
---

[repo1]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/funciones/reporteProgram.png
[repo2]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/funciones/reporteProg-lista.png
[repo3]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/funciones/registrarMateria.png
[repo4]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/funciones/programPeriodo.png

# Arquitectura y Diseño

## Modelo E-R

![alt text][er]

## Diagrama de Clases

![alt text][clases]

[er]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/ModeloER.png
[clases]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/Dclases.png

# Arquitectura por capas

## Capa de presentación 

La capa de presentación usa elementos de PrimeFaces, la parte de la aplicación que esta en interacción directa con el usuario.

## Capa Lógica

La capa logica esta diseñda bajo un modelo orientado a objetos.

## Capa de Persistencia

La capa de persistencia esta diseña bajo un modelo relacional, usando una base de datos relacional como motor de persistencia en el lenguaje PostgeeSQL. Se utilizo la tecnica del mapping para convertir datos entre estas dos capas.


## Stack Tecnológico

* Lenguaje: Java 1.8 
* Gestión: Maven Apache 4.0.0 
* Web: JavaServer Pages (JSP) 
* Framework visual: JavaServer Faces (JSF)
* Biblioteca visual: PrimeFaces 5.0 
* Inyección-persistencia: MyBatis 3.2.7 
* Creación MyBatis: Google Guice 
* Tag Libraries para JSP: JSTL 1.2 
* BD: PostgreSQL 42.0.0 
* Registro: Log4j 1.2.17 
* Administrado BD: H2 1.4.184 
* Entorno Web: Tomcat 7
* Pruebas: Maven Surefire 2.18.1
* Despliegue: Heroku


> [Link de la Aplicación AppCOOL en Heroku](https://appcool.herokuapp.com)


# Descripción del Proceso


# Descripción de la Metodología 
Desarrollo de la aplicación por el equipo UPPOST-COOL según la metodologia SCRUM vista en el curso de PDSW, el proyecto esta divido en 3 Sprints. Plataforma de programación de clases y gestión de recursos de programas de postgrado de la Unidad de Proyectos de la Escuela Colombiana de Ingeniería


## Backlog del Proyecto

> [Backlog en Trello.com](https://trello.com/b/JxxWMfSY)


### Release Burndown

 Burndown del proyecto

#### Historias de Usuario Realizadas

Historias de usuaro relaizadas en el proyecto

#### Historias de Usuario Faltantes

Historias de usuaro no relaizadas en el proyecto

### Descripción de Sprints
  
#### Reporte Sprint No 1
    
##### Sprint-backlog
---
![alt text][back-1]
---   

##### sprint-burndown chart

----
![alt text][back-char-1]
----
---
### Reporte GIT 
Reporte GIT general
----
![alt text][git-1]
> [Ver reporte completo Sprint 1](http://profesores.is.escuelaing.edu.co/hcadavid/reportes/2017-1/pdsw/reports/04-24-2017-15H-18M/appcool.repo/index.html)
----
   
[back-1]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/sprints/back-1.png
[back-char-1]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/sprints/backchar-1.png
[git-1]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/git/git-1.png
    
    
#### Reporte Sprint No 2
    
##### Sprint-backlog
---
![alt text][back-2]
---   

##### sprint-burndown chart

----
![alt text][back-char-2]
----

##### Reporte GIT
 
  Reporte GIT general
----
![alt text][git-2]
> [Ver reporte completo Sprint 2](http://profesores.is.escuelaing.edu.co/hcadavid/reportes/2017-1/pdsw/reports/05-11-2017-09H-43M/appcool.repo/)
----
   
[back-2]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/sprints/back-2.png
[back-char-2]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/sprints/backchart-2.png
[git-2]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/git/git-2.png
        

#### Reporte Sprint No 3
    
##### Sprint-backlog
---
![alt text][back-3]
---   

##### sprint-burndown chart

----
![alt text][back-char-3]
----

##### Reporte GIT
 
  Reporte GIT general
----
![alt text][git-3]
> [Ver reporte completo Sprint 2](http://profesores.is.escuelaing.edu.co/hcadavid/reportes/2017-1/pdsw/reports/05-11-2017-09H-43M/appcool.repo/)
----
   
[back-3]: https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/sprints/back-3.PNG
[back-char-3]:https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/sprints/backchart-3.PNG
[git-3]: https://github.com/UPPOSTCOOL/appcool/blob/master/img-readme/git/git-2.png

------

# Reporte de Pruebas

## Casos de Equivalencia

|No. |Clase de Equivalencia   | Análisis                                              |Resultado |
|:----|:-----------------------|:------------------------------------------------------|:---------|
|CE1  |Nombre ya existe        |No puede agregar un nombre existente a otra materia    |Nada      |
|CE2  |Nombre no existe |Puede agregar el nombre a la materia |Agrega nombre a la materia en creación
|CE3  |Codigo ya existe |No puede agregar un codigo que es de otra materia |Nada |
|CE4  |Codigo no existe |Puede agregar el codigo unico a la materia |Agrega codigo a la Materia en creación
|CE5  |Nombre y Codigo, vacios  |No puede agregar una materia sin identificadores |Nada |
|CE6  |Nombre y Codigo, no Vacios |Puede agregar atributos identificadores a la materia |Agrega nombre y codigo a la materia en creación |
|CE7  |Descipcion Vacia |La materia puede no tener descripción | Registra materia |
|CE8  |Descipcion no Vacia  |Agrega la descripción a la materia | Registra materia |
|CE9  |Prerrequisito = Correquisito |Una materia no puede tener las mismas materias como prerrequisito y correquisito a la vez |Error! |
|CE10  |Prerrequisito y  Correquisito, Vacios |Puede registrar una materia que no tenga dependencia de otra |Registra materia |
|CE11 |Prerrequisito != Correquisito  |Una materia puede tener prerrequisitos y correquisitosRegistra |Registra materia |
|CE12 |M.i -> M.j -> M.k "i< j< k< Total.Materias"  |Si una materia tiene prerrequisitos en comun con otra que es prerrequisito de ella, los prerrequisitos de la otra materia son tambien prerrequisitos de la primera,No puede haber una materia que sea prerrequisito de otra y esta no sea prerequisito de ella |Nada|
  
----
 
   <-------imagen de pruebas---------->

