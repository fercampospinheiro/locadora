package br.com.lifejesus.locadora.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lifejesus.locadora.domain.Categoria;
import br.com.lifejesus.locadora.domain.CategoriaRepository;
import br.com.lifejesus.locadora.domain.Fornecedor;
import br.com.lifejesus.locadora.domain.FornecedorRepository;
import br.com.lifejesus.locadora.domain.Produto;
import br.com.lifejesus.locadora.domain.ProdutoRepository;

@Controller
@RequestMapping("/Produto")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private FornecedorRepository fornecedorRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

	@RequestMapping(value="/cadastro", method=RequestMethod.GET)
	public String  preparaCadastroDeProduto(Model model, Produto produto) {
        model.addAttribute("produto",produto);
		model.addAttribute("fornecedores", fornecedorRepository.buscaTodosFornecedores());
        model.addAttribute("categorias",categoriaRepository.buscaTodasCategorias());
        return "/manutencao/produto/cadastroProduto";
	}
	
	@RequestMapping(value="/cadastro", method=RequestMethod.POST)
	public String  adicionaNovoProduto(
		Produto produto,
		@ModelAttribute("categorias")List<Categoria> categorias,
		@ModelAttribute("fornecedores")	List<Fornecedor> fornecedores,
		Model model
		) {

		produtoRepository.adicionaNovoProduto(produto);
		return "/manutencao/confirmacao";
	}
	
	@RequestMapping(value="/atualiza", method=RequestMethod.POST)
	public String atualizarIformacaoProduto(Produto produto, Model model) {
		return "/manutencao/produto/descricao";
	}
	
	@RequestMapping(value="/registrados", method=RequestMethod.GET)
	public String listaProdutos(Model  model) {
		return "/manutencao/produto/registrados";
	}
	@RequestMapping(value="/localiza", method=RequestMethod.POST)
	public String procuraProduto(int codigoProduto, Model model) {
		return "/manutencao/produto/descricao";
	}
	
}
