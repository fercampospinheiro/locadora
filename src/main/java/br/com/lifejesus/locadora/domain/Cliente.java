package br.com.lifejesus.locadora.domain;

//~--- JDK imports ------------------------------------------------------------

import com.google.common.collect.Lists;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

public class Cliente {
	private BigInteger id;
	private String nome;
	private List<Locacao> locacoes = Lists.newArrayList();

	public void locaFilmes(Filme filme){
		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setCliente(this);
		this.locacoes.add(locacao);
	}

	public void exibefilmesLocados(){
		this.locacoes.forEach(l -> System.out.println("Data = " + l.getData()+ "filme: "+l.getFilme()+ "cliente :" + l.getCliente().getNome()));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"locacoes=" + locacoes +
				", nome='" + nome + '\'' +
				'}';
	}
}


