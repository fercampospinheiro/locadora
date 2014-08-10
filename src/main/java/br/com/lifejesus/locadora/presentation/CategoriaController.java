package br.com.lifejesus.locadora.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.com.lifejesus.locadora.domain.Categoria;
import br.com.lifejesus.locadora.domain.CategoriaRepository;


@Controller
@RequestMapping("/Categoria")
public class CategoriaController {

	    @Autowired
	    private CategoriaRepository categoriaRepository;
	    
		@RequestMapping(value="/cadastra", method=RequestMethod.GET)
		public String  preparaCadastroDeCategorias(Model model, Categoria categoria) {
	        model.addAttribute("categoria",categoria);
	        return "/manutencao/categoria/cadastroCategoria";
		}
		
		@RequestMapping(value="/cadastra", method=RequestMethod.POST)
		public String  adicionaNovaCategoria( Categoria categoria, Model model) {
	        categoriaRepository.adicionaNovaCategoria(categoria);
			return "manutencao/confirmacao";
		}
		
		@RequestMapping(value="/atualiza", method=RequestMethod.POST)
		public String alteraCategoriaCadastrada(Categoria categoria, Model model) {
			categoriaRepository.alteraCategegoriaCadastrada(categoria);
			return "manutencao/categoria/descricao";
		}
		
		@RequestMapping(value="/registradas", method=RequestMethod.GET)
		public String buscaTodasCategorias(Model  model) {
			categoriaRepository.buscaTodasCategorias();
			return "manutencao/categoria/registrados";
		}

}
