package com.rriverdev.service;

import com.rriverdev.dto.ConsultaListaExamenDTO;
import com.rriverdev.model.Consulta
;

public interface IConsultaService extends ICRUD<Consulta, Integer> {

	
	Consulta registrarTransaccional(ConsultaListaExamenDTO dto);
}
