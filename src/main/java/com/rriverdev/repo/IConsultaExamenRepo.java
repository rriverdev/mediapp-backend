package com.rriverdev.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.rriverdev.model.ConsultaExamen;

public interface IConsultaExamenRepo extends IGenericRepo<ConsultaExamen, Integer>{

	/*
	 * otro metodo usado en  JE java Enterprise
		@Query(value = "INSERT INTO consulta_examen(id_consulta, id_examen) VALUES (?1,?2)", nativeQuery = true )
		Integer registrar( Integer idConsulta, Integer idExamen);
	 * 	
	 */
	//SQL || DML Data Manipulation Lenguaje INSERT, UPDATE, DELETE
	//	@Transactional	se mueve la anotacion a un nivel superior(ConsultaServiceImpl) para mantener la integrar de todas las tablas donde va a registrar y no solo en consulta_examen
	@Modifying	// si no se agrega modify no se pueden realizar update o deletes
	@Query(value = "INSERT INTO consulta_examen(id_consulta, id_examen) VALUES (:idConsulta, :idExamen)", nativeQuery = true )
	Integer registrar(@Param("idConsulta") Integer idConsulta, @Param("idExamen") Integer idExamen);

}
