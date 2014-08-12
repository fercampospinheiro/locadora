package br.com.lifejesus.locadora.domain;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigInteger;
import java.time.LocalDate;

public class Filme {
	private BigInteger id;
	private String titulo;
	private LocalDate lancamento;
	private Locacao locacao;
	private Categoria categoria = new Categoria();

	public Filme(){
	}

	public void alugadoPor(Cliente cliente){
		this.locacao = new Locacao();
		locacao.setCliente(cliente);
		locacao.setFilme(this);
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public void setLancamento(LocalDate lancamento) {
		this.lancamento = lancamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public LocalDate getLancamento() {
		return lancamento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Filme{" +
				"categoria=" + categoria.getNome() +
				", lancamento=" + lancamento +
				", titulo='" + titulo + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Filme)) return false;

		Filme filme = (Filme) o;

		if (!categoria.equals(filme.categoria)) return false;
		if (!id.equals(filme.id)) return false;
		if (!lancamento.equals(filme.lancamento)) return false;
		if (!titulo.equals(filme.titulo)) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id.hashCode();
		result = 31 * result + titulo.hashCode();
		result = 31 * result + lancamento.hashCode();
		result = 31 * result + categoria.hashCode();
		return result;
	}
}
