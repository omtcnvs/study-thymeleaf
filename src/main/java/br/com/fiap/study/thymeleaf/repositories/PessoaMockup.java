package br.com.fiap.study.thymeleaf.repositories;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.study.thymeleaf.enums.SexoType;
import br.com.fiap.study.thymeleaf.models.Pessoa;

public class PessoaMockup {

	private static List<Pessoa> pessoas = new ArrayList<>();

	public static List<Pessoa> getAll() {
		buildPessoasList();
		return pessoas;
	}

	private static void buildPessoasList() {
		pessoas.add(new Pessoa(1L, "Matheus", LocalDate.of(2003, 9, 8), SexoType.MASCULINO));
		pessoas.add(new Pessoa(2L, "Naomi", LocalDate.of(2003, 10, 14), SexoType.FEMININO));
		pessoas.add(new Pessoa(3L, "Jonas", LocalDate.of(2003, 3, 22), SexoType.MASCULINO));
		pessoas.add(new Pessoa(4L, "Marcia", LocalDate.of(1969, 8, 4), SexoType.FEMININO));
	}

}
