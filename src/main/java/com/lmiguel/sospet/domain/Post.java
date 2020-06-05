package com.lmiguel.sospet.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Post implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	// ATRIBUTOS
	
	private Long id;
	
	private Date data;
	
	private String titulo;
	
	private String corpo;
	
	
	// ASSOÇIAÇÕES
	
	private Usuario autor;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	
	public Post() {
		
	}


	public Post(Long id, Date data, String titulo, String corpo, Usuario autor) {
		super();
		this.id = id;
		this.data = data;
		this.titulo = titulo;
		this.corpo = corpo;
		this.autor = autor;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getCorpo() {
		return corpo;
	}


	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}


	public Usuario getAutor() {
		return autor;
	}


	public void setAutor(Usuario autor) {
		this.autor = autor;
	}


	public List<Comentario> getComentarios() {
		return comentarios;
	}


	public void addComentario(Comentario comentario){
		comentarios.add(comentario);
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
		Post other = (Post) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Post [id=" + id + ", data=" + data + ", titulo=" + titulo + ", corpo=" + corpo + ", autor=" + autor
				+ ", comentarios=" + comentarios + "]";
	}
	
	
}