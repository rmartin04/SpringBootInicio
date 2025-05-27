package es.cursospringboot.cursospringricky;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/start")
public class PrimerControlador {
	
	 //Este es un controlador de tipo MVC (Modelo-Vista-Controlador)
//	@RequestMapping(value = "/inicio",method =RequestMethod.GET)
//	public String metodo1(Model model,HttpServletRequest request,LocalDate date) {
//		System.out.println("Entrando en el controlador en SpringBoot");
//		String valor = request.getParameter("param1");
//		model.addAttribute("mensaje", "Ricardo Martín Ruiz");
//		model.addAttribute("param_valor", valor);
//		return "Hola";
//	}
//====================================================================================	
	@RequestMapping(value = "/inicio",method =RequestMethod.GET)
	public String metodo2(Model model,@RequestParam("param1") String valor) {
		System.out.println("Entrando en el controlador en SpringBoot");
		model.addAttribute("mensaje", "Ricardo Martín Ruiz");
		model.addAttribute("param_valor", valor);
		return "Hola";
	}
//=====================================================================================	
	@RequestMapping(value = "/inicio",method =RequestMethod.POST)
	public String metodo3(Model model,HttpServletRequest request,LocalDate date) {
		System.out.println("Entrando en el controlador en SpringBoot");
		String valor = request.getParameter("param1");
		model.addAttribute("mensaje", "Ricardo Martín Ruiz");
		model.addAttribute("param_valor", valor);
		return "Hola";
	}
	

	@RequestMapping("/{generico}")
	public String printHelloGet(ModelMap model, 
			@PathVariable("generico") String accion, 
			@RequestParam("numero") String param) {
		
		System.out.println("printHelloGet entra: "+ accion);
		
		if (accion.toUpperCase().equals("GET")){
			model.addAttribute("message","Action get called with parameter "+param);
		}else{
			model.addAttribute("message","Action other called with parameter "+param);
		}
		return "hola";//Separado de la vista, se manda el valor pero no se sabe donde se va a mostrar. ME Abstraigo de la tecnologia que hay por debajo
	}





}
