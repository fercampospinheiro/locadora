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
import java.util.List;

public class Cliente {
	private BigInteger id;
	private String nome;
	private List<Locacao> locacoes = Lists.newArrayList();
	private Usuario usuario = new Usuario();
	private Endereco endereco;

	public void locaFilmes(Filme filme){
		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setCliente(this);
		this.locacoes.add(locacao);
	}

    public Endereco defineEndereco(Endereco enderecoBuilder){
        return  this.endereco = endereco;
    }
	public void criaUsuario(String email,String senha){
		this.usuario.setEmail(email);
		this.usuario.setSenha(senha);
	}

		
	public void exibefilmesLocados(){
		this.locacoes.forEach(
				locacao -> System.out.println(	"Data = " + locacao.getData()+
												"filme: "+locacao.getFilme()+
												"cliente :" + locacao.getCliente().getNome())
		);
	}

	public void exibeDadosDoUsuario(){

		System.out.printf("usuario: %s email : %s",this.usuario.getEmail(),this.usuario.getSenha());
	}

    public void exibeEndereco(){
        System.out.printf("Logradouro: %s numero : %s  bairro: % cidade: % estado: % ",
                            this.endereco.,this.usuario.getSenha());
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


	@Override
	public String toString() {
		return "Cliente{" +
				"locacoes=" + locacoes +
				", nome='" + nome + '\'' +
				'}';
	}
}


