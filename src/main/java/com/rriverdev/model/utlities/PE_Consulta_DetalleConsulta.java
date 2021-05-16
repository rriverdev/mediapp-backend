package com.rriverdev.model.utlities;


/**
 * 
 * @author Ricardo Rivas Parra
 * @PruebasDeEscritorio
 * @NombrePrueba: Consulta y Detalle Consulta
 *
 */
public class PE_Consulta_DetalleConsulta {

	/*
	 * Consulta
	 * id_Consulta	|	id_Paciente	|	id_Medico	|	 fecha
	 * 1			|	1			|	1			|	23.01.2020
	 * 
	 * 
	 * Detalla_Consulta
	 * id_Consulta	|	id_Detalle	|	diagnostico	|	tratamiento
	 * 1			|	1			|	Gripe		|	antigripales
	 * 1			|	2			|	amigdalitis	|	anti-inflamatorios
	 * 2			|	3			|	amigdalitis	|	anti-inflamatorios
	 * 
	 * 
	 * Consulta_Examen
	 * id_Consulta	PK	|	id_Examen PK
	 * 1				|1
	 * 1				|2
	 * 1				|3 
	 * 2				|5
	 * 
	 * 
	 * Examen
	 * id_Exame	|	nombre
	 * 1		|sangre
	 * 2		|ocular		
	 * 
	 * 
	 * Paciente
	 * id_Paciente	|	nombre	|	apellidos	|	dni	|	 id_consulta
	 * 1			|ric		|riv			|21001	|1
	 * 1			|ric		|riv			|21001	|2	
	 * 
	 */
	
	
}
