package br.com.lifejesus.locadora.presentation;

import javax.servlet.http.HttpSession;

import br.com.lifejesus.locadora.domain.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lifejesus.locadora.domain.Usuario;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

	@RequestMapping("/login")
	public String  loginFormulario(Usuario usuario, Model model) {
		model.addAttribute("usuario", usuario);
		model.addAttribute("usuarios", usuarioRepository.buscaTodos());

		return "/usuario/login";
	}
	
	@RequestMapping(value="/autentica",method= RequestMethod.POST)
	public String autenticaUsuario(@ModelAttribute(value="usuario")Usuario usuario, HttpSession session  ) {
		session.setAttribute("usuarioLogado", usuario);
		return "/website/home";
	}
	
	
}
