package com.rriverdev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.BatchSize;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Paciente Model")
@Entity
//@Table(name = "tbl_paciente", schema = "public.esquema1")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer idPaciente;
	
	@Schema(description = "Nombre del Paciente")
	@Size(min = 3, message = "{nombres.size}")
	@Column(name ="nombres", nullable = false, length = 70)
	private String nombres;
	
	@Size(min = 3, message = "{apellidos.size}")
	@Column(name ="apellidos", nullable = false, length = 70)
	private String  apellidos;

	@Size(min = 8, max = 8, message = "DNI del paciente debe contar con 8 caracteres")
	@Column(name ="dni", nullable = false, length = 8, unique = true)
	private String dni;

	@Size(min = 6, max = 170, message = "direccion paciente debe contar con minimo 6 caracteres")
	@Column(name ="direccion", nullable = false, length = 170)
	private String direccion;

	@Size(min = 10, max = 12, message = "Telefono debe contar con al menos 10 numeros")
	@Column(name ="telefono", nullable = false, length = 10)
	private String telefono;

	/* @Pattern(regexp = ) */
	@Email(message = "Formato Incorrecto del Email")
	@Column(name ="email", nullable = false, length = 70)
	private String email;
	
	
	
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
