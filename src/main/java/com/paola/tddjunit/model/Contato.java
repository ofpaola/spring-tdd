package com.paola.tddjunit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message = "O nome deve ser preenchido!")
	private String nome;
	
	@NotEmpty(message = "O DDD deve ser preenchido!")
	private String ddd;
	
	@NotEmpty(message = "O telefone deve ser preenchido!")
	private String telefone;

	public Contato() {
	}
	
	public Contato(String nome, String ddd, String telefone) {
		this.nome = nome;
		this.ddd = ddd;
		this.telefone = telefone;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}