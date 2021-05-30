package com.rriverdev.repo;

import com.rriverdev.model.Consulta;


//@Repository // al heredear de JpaRepository spring lo interpreta como Repository
public interface IConsultaRepo extends IGenericRepo<Consulta, Integer>{
							//			JpaRepository<Entidad, >
	
	
}
