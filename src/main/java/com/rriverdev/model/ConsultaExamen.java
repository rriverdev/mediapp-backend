package com.rriverdev.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "consulta_examen")
@IdClass(ConsultaExamenPK.class) 
public class ConsultaExamen {
/*	
 * @IdClass: Especifica una clase de llave primaria compuesta que se asigna a varios campos o propiedades de la entidad.
 * 
 */
	
	@Id
	private Consulta consulta;
	
	@Id
	private Examen examen;

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}
	
	
	
	

}
