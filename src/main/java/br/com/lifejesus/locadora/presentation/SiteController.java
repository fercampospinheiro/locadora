package br.com.lifejesus.locadora.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {
    @RequestMapping("/home")
    public String exibeHome(){
        return  "/site/home";
    }
}
