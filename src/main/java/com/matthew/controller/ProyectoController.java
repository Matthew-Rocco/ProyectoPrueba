package com.matthew.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.matthew.clases.Contacto;

@Controller
public class ProyectoController {
	
    @GetMapping("/listado")
    public String contactoForm(Model model) {
        model.addAttribute("contacto", new Contacto());
        return "form";
    }
 
    @PostMapping("/listado")
    public String contactoSubmit(@ModelAttribute Contacto contacto) {
        return "result";
    }
    
}
