package br.com.lifejesus.locadora.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class Endereco {
	private final int id;
	private final String logradouro;
	private final Integer numero;
	private final String bairro;
	private final String cidade;
	private final String uf;

	private Endereco(Builder builder){
        this.logradouro = builder.logradouro;
        this.numero= builder.numero;
        this.bairro = builder.bairro;
        this.cidade= builder.cidade;
        this.uf=builder.uf;
	}

    public static class Builder{
        private int id;
        private String logradouro= "";
        private Integer numero = 0;
        private String bairro = "";
        private String uf= "";
        private String cidade = "";

        public Builder(){

        }
        public Builder logradouro(String logradouro ){
            this.logradouro = logradouro;
            return this;
        }
        public Builder numero(int numero){
            this.numero = numero;
            return  this;
        }
        public Builder bairro(String bairro){
            this.bairro= bairro;
            return this;
        }
        public Builder uf( String uf){
            this.uf=uf;
            return this;
        }
        public Builder cidade(String cidade){
            this.cidade = cidade;
            return this;
        }

        public Endereco builder(){
            return new Endereco(this);
        }


    }


}
