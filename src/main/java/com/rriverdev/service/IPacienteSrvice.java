package com.rriverdev.service;

import java.util.List;

import com.rriverdev.model.Paciente;

public interface IPacienteSrvice {

	Paciente registrar(Paciente p) throws Exception;
	
	Paciente modificar(Paciente p) throws Exception;
	
	List<Paciente> listar() throws Exception;
	
	Paciente listarPorId(Integer id)throws Exception;
	
	void eliminar(Integer id)throws Exception;

}
