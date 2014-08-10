package br.com.lifejesus.locadora.domain;
import com.google.common.collect.Lists;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	@Id
	@GeneratedValue
	private BigInteger id;
	private String nome;
	@OneToMany(mappedBy = "categoria")
	private List<Filme> filmes = Lists.newArrayList() ;

	public Categoria() {

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void associaFilme(Filme filme){
		filmes.add(filme);
	}

	public String getNome() {
		return nome;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Categoria)) return false;

		Categoria categoria = (Categoria) o;

		if (!filmes.equals(categoria.filmes)) return false;
		if (!id.equals(categoria.id)) return false;
		if (!nome.equals(categoria.nome)) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id.hashCode();
		result = 31 * result + nome.hashCode();
		result = 31 * result + filmes.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "Categoria{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", filmes=" + filmes.toString() +
				'}';
	}
}
