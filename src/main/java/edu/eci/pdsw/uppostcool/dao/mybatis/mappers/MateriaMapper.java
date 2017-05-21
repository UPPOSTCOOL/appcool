package edu.eci.pdsw.uppostcool.dao.mybatis.mappers;

import edu.eci.pdsw.uppostcool.entities.Materia;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2083722
 */
public interface MateriaMapper {
    /**
     * consulta el listado de clases de asignaturas en el semestre=1|2 y anio
     * @param semestre
     * @param anio
     * @return lista de materias
     */
    public List<Materia> consultarMateriasClase(@Param("semestre") int semestre,@Param("anio") int anio);

    /**
     * consulta el listado de materias de un programa específico
     * @param id_programa
     * @return lista de materias
     */
    public List<Materia> consultarMateriasPorPrograma(@Param("id_programa") int id_programa);
    
    /**
     * consulta una materia con su información y Co y Requisitos
     * @param codigo
     * @param id_programa
     * @return materia
     */
    public Materia consultarMateriaConRequisitos(@Param("codigo") String codigo,@Param("id_p") int id_programa);
    
    /**
     * Insertar una materia
     * @param codigo
     * @param nombre
     * @param descripcion 
     */
    public void insertarMateria(@Param("codigo") String codigo,@Param("nombre") String nombre,@Param("desc") String descripcion);
    
    /*
    * Insertar Prerequisito a una materia
    */
    public Materia insertarMateriaPrerequisito(@Param("codigoMat") String codigoMat,@Param("codigoPre") String codigoPre,@Param("id_p") int id_programa);
    
    /*
    * Insertar Corequisito a una materia
    */
    public Materia insertarMateriaCorequisito(@Param("codigoMat") String codigoMat,@Param("codigoCo") String codigoCo,@Param("id_p") int id_programa);
    
    /**
     * Relacionar Asignatura a una materia
     * @param id_asign
     * @param codigoMateria
     * @return materia
     */
    public Materia insertarAsign_Mater(@Param("id_asign") int id_asign,@Param("id_mater") String codigoMateria);
    
    /**
     * consulta todas las materias registradas
     * @return lista de materias registradas
     */
    public List<Materia> consultarMaterias();
    
    /**
     * actualiza una materia, basado en el codigo anterior
     * @param codigoAnterior
     * @param codigo
     * @param nombre
     * @param descripcion
     */
    public void actualizarMateria(@Param("codigoAnterior") String codigoAnterior, @Param("codigo") String codigo,@Param("nombre") String nombre,@Param("desc") String descripcion);
    
    /**
     * elimina los prerequisitos de materias 
     * @param codigo
     */
    public void eliminarMateriaPrerequisitos(@Param("id_materia") String codigo);
    
    /**
     * elimina los corequisitos de materias 
     * @param codigo
     */
    public void eliminarMateriaCorequisitos(@Param("id_materia") String codigo);
    
    /**
     * Elimina las relaciones de las asignaturas con materias
     * @param codigo
     */
    public void eliminarAsign_Mater(@Param("id_materia") String codigo);
    
}