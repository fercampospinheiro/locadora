package br.com.lifejesus.locadora.domain;

import java.time.LocalDate;

/**
 * Created by Fernando_2 on 09/08/14.
 */
public class Locacao {
	private Filme filme;
	private LocalDate data;
	private Cliente cliente;
	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Filme getFilme() {
		return filme;
	}

	public LocalDate getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
