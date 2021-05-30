package com.rriverdev.repo;

import com.rriverdev.model.Especialidad;


//@Repository // al heredear de JpaRepository spring lo interpreta como Repository
public interface IEspecialidadRepo extends IGenericRepo<Especialidad, Integer>{
							//			JpaRepository<Entidad, >
	
	
}
