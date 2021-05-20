package com.rriverdev.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rriverdev.exception.ModeloNotFoundException;
import com.rriverdev.model.Medico;
import com.rriverdev.service.IMedicoService;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/medicos")//("/Medicos")
public class MedicoController {

	@Autowired
	private IMedicoService service;
	
	@GetMapping
	public ResponseEntity<List<Medico>> listar() throws Exception{
		List<Medico> lista = service.listar();
		return new ResponseEntity<List<Medico>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Medico> listarPorId(@PathVariable("id") Integer id) throws Exception{
		Medico obj = service.listarPorId(id);
		if (obj.getIdMedico() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		
		return  new ResponseEntity<Medico>(obj, HttpStatus.OK);
	}

	@GetMapping("/hateoas/{id}")
	public EntityModel<Medico> listarPorIdHateoas(@PathVariable("id") Integer id) throws Exception{
		Medico obj = service.listarPorId(id);
		
		if(obj.getIdMedico() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		}
		//localhost:8080/Medicos/{id}
		EntityModel<Medico> recurso = EntityModel.of(obj);
		
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).listarPorId(id));
		recurso.add(link.withRel("Medico-recurso"));
		
		WebMvcLinkBuilder linkz = linkTo(methodOn(this.getClass()).listarPorIdHateoas(id));//+"chupateUnLemooooOn");
		recurso.add(linkz.withRel("second?"));
		return recurso;
	}
								/*@PostMapping
								public ResponseEntity<Medico> registrar(@Valid @RequestBody Medico p) throws Exception{
									Medico obj = service.registrar(p);
									return new ResponseEntity<Medico>(obj, HttpStatus.CREATED);
								}*/
	
	
	
	
	@PostMapping
	public ResponseEntity<Medico> registrar(@Valid @RequestBody Medico p) throws Exception{
		Medico obj = service.registrar(p);
		//localhost:8080/pcientes/{2}
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdMedico()).toUri();
		return ResponseEntity.created(location).build();
	}
	@PutMapping
	public ResponseEntity<Medico> modificar(@Valid @RequestBody Medico p) throws Exception{
		Medico obj = service.modificar(p);
		return new ResponseEntity<Medico>(obj, HttpStatus.OK); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id")  Integer id) throws Exception{
		Medico obj = service.listarPorId(id);
		if (obj.getIdMedico() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.I_AM_A_TEAPOT);
	}
	
	
}
