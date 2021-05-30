package com.rriverdev.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rriverdev.dto.ConsultaListaExamenDTO;
import com.rriverdev.model.Consulta;
import com.rriverdev.model.DetalleConsulta;
import com.rriverdev.repo.IGenericRepo;
import com.rriverdev.repo.IConsultaExamenRepo;
import com.rriverdev.repo.IConsultaRepo;
import com.rriverdev.service.IConsultaService;

@Service
public class ConsultaServiceImpl extends CRUDImpl<Consulta, Integer> implements IConsultaService{

	@Autowired
	private IConsultaRepo repo;

	@Autowired
	private IConsultaExamenRepo ceRepo;
	
	@Override
	protected IGenericRepo<Consulta, Integer> getRepo() {
		return repo;
	}
	
	@Transactional
	@Override
	public Consulta registrarTransaccional(ConsultaListaExamenDTO dto) {
//		for(DetalleConsulta det : consulta.getDetalleConsulta()) {
//			det.setConsulta(consulta);
//		}
		//insercion en detalle consulta
		dto.getConsulta().getDetalleConsulta().forEach(detailArray -> detailArray.setConsulta(dto.getConsulta()));
		repo.save(dto.getConsulta());
		
		//insercion en tabla consuta_examen 
		dto.getLstExamen().forEach(ex -> ceRepo.registrar(dto.getConsulta().getIdConsulta(), ex.getIdExamen()));
		
		return dto.getConsulta();
	}
	


}
