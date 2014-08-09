package br.com.lifejesus.locadora.domain;
import com.google.common.collect.Lists;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	@OneToMany(mappedBy = "categoria")
	private List<Produto> produto= Lists.newArrayList() ;

	public Categoria() {

	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria)) return false;

        Categoria categoria = (Categoria) o;

        if (!id.equals(categoria.id)) return false;
        if (!nome.equals(categoria.nome)) return false;
        if (!produto.equals(categoria.produto)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + nome.hashCode();
        result = 31 * result + produto.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", produto=" + produto +
                '}';
    }
}
