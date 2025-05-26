package es.cursospringboot.cursospringricky;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class PrimerControlador {
	
	// Este es un controlador de tipo MVC (Modelo-Vista-Controlador)
	@RequestMapping("/inicio")
	public String metodo1(Model model,HttpServletRequest request,LocalDate date) {
		System.out.println("Hola desde el controlador en SpringBoot");
		model.addAttribute("mensaje", "Ricardo Martín Ruiz");
		return "Hola";
	}

}
