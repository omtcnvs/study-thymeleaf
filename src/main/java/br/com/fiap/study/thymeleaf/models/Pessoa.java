package br.com.fiap.study.thymeleaf.models;

import java.time.LocalDate;

import br.com.fiap.study.thymeleaf.enums.SexoType;

public class Pessoa {
	
	private Long id;
	
	private String nome;
	
	private LocalDate dataNascimento;
	
	private SexoType sexo;
	
	public Pessoa(Long id, String nome, LocalDate dataNascimento, SexoType sexo) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public SexoType getSexo() {
		return sexo;
	}

	public void setSexo(SexoType sexo) {
		this.sexo = sexo;
	}
	
}
