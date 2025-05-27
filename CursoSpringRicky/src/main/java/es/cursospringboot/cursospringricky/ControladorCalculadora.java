package es.cursospringboot.cursospringricky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorCalculadora {
	@Autowired
	private CalculadoraService calculadoraService;

	@RequestMapping(value = "/calculadora", method = RequestMethod.GET)
	public String mostrarCalculadora() {

		return "calculadora"; // Retorna la vista "calculadora.html"
	}

	// Método para manejar la operación de la calculadora
	@RequestMapping(value = "/calculadora2", method = RequestMethod.GET)
	public String realizarOperacion(@RequestParam("num1") double num1, @RequestParam("num2") double num2,
			@RequestParam("operacion") String operacion, Model model) {

		double resultado = calculadoraService.operar(num1, num2, operacion);

		model.addAttribute("resultado", resultado);

		return "resultado"; // Retorna la vista "resultado.html"
	}
}
