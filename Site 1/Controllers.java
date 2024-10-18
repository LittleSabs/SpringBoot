package com.primeirospring.teste_spring.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllers{


    @RequestMapping(value = "/home", method = RequestMethod.GET)

    public String home(){
        return "home";
    }

    @RequestMapping(value = "/nome", method = RequestMethod.POST)

    public String nome(@RequestParam("texto") String texto, Model model) {
        model.addAttribute("textoRecebido", texto);
        return "nome";
    }


}