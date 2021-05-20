package com.rriverdev.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rriverdev.model.Paciente;
import com.rriverdev.repo.IGenericRepo;
import com.rriverdev.repo.IPacienteRepo;
import com.rriverdev.service.IPacienteSrvice;

@Service
public class PacienteServiceImpl extends CRUDImpl<Paciente, Integer> implements IPacienteSrvice{

	@Autowired
	private IPacienteRepo repo;

	@Override
	protected IGenericRepo<Paciente, Integer> getRepo() {
		return repo;
	}
	


}
