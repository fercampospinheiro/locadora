package br.com.lifejesus.locadora.domain;

/**
 * Created by Fernando_2 on 09/08/14.
 */
public class main {

	public static void main(String[] args) {
		Categoria categoria= new Categoria();
		categoria.setNome("Ação");
		Filme filme = new Filme();
		filme.setTitulo("Top Gear");
		filme.setCategoria(categoria);
		Cliente fernando = new Cliente();
		
		fernando.locaFilme(filme);
		fernando.filmesLocados();
	}
}
