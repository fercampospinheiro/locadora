package br.com.lifejesus.locadora.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lifejesus.locadora.domain.Cliente;

@Controller
@RequestMapping("/manutencaoCliente")
public class ClienteController {

	@RequestMapping(value="/registra", method=RequestMethod.GET)
	public String preparaViewCliente(Cliente cliente, Model model) {
		
		model.addAttribute("cliente", cliente);
		return "manutencao/cliente/cadastro";
	}
	
	@RequestMapping(value="/registra", method=RequestMethod.POST)
	public String registraCliente(Cliente cliente) {
		return "manutencao/cliente/confirmacao";
	}
	
	@RequestMapping(value="/atualiza", method= RequestMethod.POST)
	public String atualizarInformacaoCliente(Cliente cliente, Model model) {
		return "manutencao/cliente/descricao";
	}
	
	@RequestMapping(value="/registrados", method= RequestMethod.GET) 
	public String listaCliente(Model model){
		return "manutencao/cliente/registrados";
	}
	
	@RequestMapping(value="/localiza", method= RequestMethod.GET) 
	public String localizaCliente(int codigoCliente,Model model) {
		
		return "manutencao/cliente/descricao";
		
	}
}
