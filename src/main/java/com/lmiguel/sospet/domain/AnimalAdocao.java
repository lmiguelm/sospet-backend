package com.lmiguel.sospet.domain;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.lmiguel.sospet.domain.enums.IdadeAnimal;
import com.lmiguel.sospet.domain.enums.PorteAnimal;
import com.lmiguel.sospet.domain.enums.SexoAnimal;
import com.lmiguel.sospet.domain.enums.StatusAnimal;
import com.lmiguel.sospet.domain.enums.TipoAnimal;
import com.lmiguel.sospet.domain.enums.TipoPelagem;

@Entity
@JsonTypeName("animalAdocao")
public class AnimalAdocao extends Animal{

	private static final long serialVersionUID = 1L;
	
	
	// ATRIBUTOS
	
	private String nome;
		
	private Integer pelagem;
	
	private Boolean castrado;
	
	private String raca;
	
	
	public AnimalAdocao() {
		
	}

	public AnimalAdocao(Long id, TipoAnimal tipo, SexoAnimal sexo, PorteAnimal porte, StatusAnimal status, IdadeAnimal idade, String imagemUrl, Usuario usuario, String nome, TipoPelagem pelagem, Boolean castrado, String raca) {
		super(id, tipo, sexo, porte, status, idade ,imagemUrl, usuario);
		this.nome = nome;
		this.pelagem = (pelagem == null) ? null : pelagem.getCode();
		this.castrado = castrado;
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPelagem getTipoPelagem() {
		return TipoPelagem.toEnum(pelagem);
	}

	public void setTipoPelagem(TipoPelagem pelagem) {
		this.pelagem = pelagem.getCode();
	}

	public Boolean getCastrado() {
		return castrado;
	}

	public void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
