package com.rriverdev.repo;

import com.rriverdev.model.Paciente;


//@Repository // al heredear de JpaRepository spring lo interpreta como Repository
public interface IPacienteRepo extends IGenericRepo<Paciente, Integer>{
							//			JpaRepository<Entidad, >
	
	
}
