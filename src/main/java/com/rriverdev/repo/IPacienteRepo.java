package com.rriverdev.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rriverdev.model.Paciente;


//@Repository // al heredear de JpaRepository spring lo interpreta como Repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer>{
							//			JpaRepository<Entidad, >
	
	
}
