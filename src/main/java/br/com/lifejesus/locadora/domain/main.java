package br.com.lifejesus.locadora.domain;

/**
 * Created by Fernando_2 on 09/08/14.
 */
public class main {

	public static void main(String[] args) {

		Categoria categoriaA = new Categoria();
		categoriaA.setNome("Ação");

		Categoria categoriaB = new Categoria();
		categoriaB.setNome("Comédia");

		Categoria categoriaC = new Categoria();
		categoriaC.setNome("Épico");

		Filme filme1 = new Filme();
		filme1.setTitulo("A virada");
		Filme filme2 = new Filme();
		filme2.setTitulo("300");
		Filme filme3 = new Filme();
		filme3.setTitulo("Professor Aloprado");

		filme1.setCategoria(categoriaA);
		filme2.setCategoria(categoriaC);
		filme3.setCategoria(categoriaB);

		categoriaA.associaFilme(filme1);
		categoriaA.associaFilme(filme2);

		categoriaB.associaFilme(filme3);
		categoriaC.associaFilme(filme2);




		Cliente cliente =  new Cliente();
		cliente.setNome("Antonio");
        Endereco novoEndereco = new Endereco.Builder().logradouro("Rua orlando").numero(12).bairro("VilaAlpina").cidade("São Paulo").uf("SP").builder();
        cliente.defineEndereco(novoEndereco);
		cliente.criaUsuario("fercampospinheiro@gmail.com", "00000");

		cliente.locaFilmes(filme1);
		cliente.locaFilmes(filme2);
		cliente.locaFilmes(filme3);
		filme1.alugadoPor(cliente);
		filme2.alugadoPor(cliente);
		filme3.alugadoPor(cliente);

		cliente.exibefilmesLocados();
		cliente.exibeDadosDoUsuario();
	}
}
