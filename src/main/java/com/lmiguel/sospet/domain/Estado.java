package com.lmiguel.sospet.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Estado implements Serializable {

	private static final long serialVersionUID = 1L;

	// ATRIBUTOS
	
	private Long id;
	
	private String nome;
	
	
	// ASSOCIAÇÕES
	
	private Set<Cidade> cidades = new HashSet<>();
	
	
	public Estado() {
		
	}


	public Estado(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Set<Cidade> getCidades() {
		return cidades;
	}


	public void setCidades(Set<Cidade> cidades) {
		this.cidades = cidades;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}