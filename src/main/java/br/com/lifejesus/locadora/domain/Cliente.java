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

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	private BigInteger id;
	private String nome;
	private List<Locacao> locacoes = Lists.newArrayList();

	public void locaFilme(Filme filme){
		filme.getLocacao().setData(LocalDate.now());
		this.locacoes.add(filme.getLocacao());
	}

	public void filmesLocados(){
		this.locacoes.forEach(l -> System.out.println("Data = " + l.getData()+ "filme: "+l.getFilme()));
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"locacoes=" + locacoes +
				", nome='" + nome + '\'' +
				'}';
	}
}


