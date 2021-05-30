package com.rriverdev.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.rriverdev.model.Consulta;
import com.rriverdev.model.Examen;

public class ConsultaListaExamenDTO {

	/*
	 * Esta clase no es una entidad que se use en la BD, solo es una clase auxilizar de java
	 */
	
	@NotNull
	private Consulta consulta;
	@NotNull
	private List<Examen> lstExamen;
	
	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	public List<Examen> getLstExamen() {
		return lstExamen;
	}
	public void setLstExamen(List<Examen> lstExamen) {
		this.lstExamen = lstExamen;
	}
	
}
