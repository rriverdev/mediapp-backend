package com.rriverdev.service;

import com.rriverdev.model.Medico;

public interface IMedicoService extends ICRUD<Medico, Integer> {
/**
 * Se genero la interfaz ICRUD para no replicar funciones basicas que se usaran en varios services
 * de esta manera se puede realizar metodos abstractos unicos para el service o clase implementadora
 * por ejemplo aqui podria ser:
 * 
 * 	Medico promocionMedicoForence(Medico p) throws Exception;
 * 	Medico nuevoMedicoEspecialista(Medico p) throws Exception;
 * 
 * metodos mas especializados en la implementacion y no las genericas como:
 *  alta baja consulta lista eliminar etc.
 */
//	Medico registrar(Medico p) throws Exception;
//	
//	Medico modificar(Medico p) throws Exception;
//	
//	List<Medico> listar() throws Exception;
//	
//	Medico listarPorId(Integer id)throws Exception;
//	
//	void eliminar(Integer id)throws Exception;

}
