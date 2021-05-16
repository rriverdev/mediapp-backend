package com.rriverdev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="medico")
public class Medico {
	
	
	/**
	 *  JPQL Java Persistence Query Lenguaje | SQL
	 *  JPQ	_> From Consulta c WHERE c.medico.idMedico=1
	 *  SQL_> select * from TABLA cINNER JOIN m ONc.id_Medico = m.id_medico
	 */
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer  idMedico; 
	
	@Column(name ="nombres", nullable = false, length = 70)
	private String nombres;
	
	@Column(name ="apellidos", nullable = false, length = 70)
	private String apellidos;
	
	@Column(name ="CMP", nullable = false, length = 12, unique = true)
	private String CMP;
	
	@Column(name ="foto_Url", nullable = false)
	private byte [] fotoUrl;

	public Integer getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
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

	public String getCMP() {
		return CMP;
	}

	public void setCMP(String cMP) {
		CMP = cMP;
	}

	public byte[] getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(byte[] fotoUrl) {
		this.fotoUrl = fotoUrl;
	}

	
}
