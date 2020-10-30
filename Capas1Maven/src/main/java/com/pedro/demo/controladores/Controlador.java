package com.pedro.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pedro.demo.negocio.ILogica;

@Controller
public class Controlador {
	
	@Autowired
	ILogica coches;
	
	@RequestMapping("coches")
	public String calcularNumeroCoches(@RequestParam("nombre") String n, ModelMap model) {
			
			Integer numeroCoches = coches.coches(n);
			
			model.addAttribute("d", numeroCoches);
			
			
			return "coches";
		}
	
}
