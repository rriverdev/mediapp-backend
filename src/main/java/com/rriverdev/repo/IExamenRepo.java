package com.rriverdev.repo;

import com.rriverdev.model.Examen;


//@Repository // al heredear de JpaRepository spring lo interpreta como Repository
public interface IExamenRepo extends IGenericRepo<Examen, Integer>{
							//			JpaRepository<Entidad, >
	
	
}
