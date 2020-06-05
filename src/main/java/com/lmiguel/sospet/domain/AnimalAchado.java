package com.lmiguel.sospet.domain;

import java.util.Date;

import com.lmiguel.sospet.domain.enums.PorteAnimal;
import com.lmiguel.sospet.domain.enums.SexoAnimal;
import com.lmiguel.sospet.domain.enums.StatusAnimal;
import com.lmiguel.sospet.domain.enums.TipoAnimal;

public class AnimalAchado extends Animal {

	private static final long serialVersionUID = 1L;
	
	
	// ATRIBUTOS
	
	private Date dataEncontrado;
	
	
	public AnimalAchado() {
		
	}

	public AnimalAchado(Long id, TipoAnimal tipo, SexoAnimal sexo, PorteAnimal porte, StatusAnimal status, Usuario usuario, Date dataEncontrado) {
		super(id, tipo, sexo, porte, status, usuario);
		this.dataEncontrado = dataEncontrado;
	}

	public Date getDataEncontrado() {
		return dataEncontrado;
	}

	public void setDataEncontrado(Date dataEncontrado) {
		this.dataEncontrado = dataEncontrado;
	}	
}