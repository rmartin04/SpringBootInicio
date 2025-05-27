package es.cursospringboot.cursospringricky.ejercicios.caballos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CaballoController {
	
	@Autowired
	private Caballo caballoObjeto;
	
    @GetMapping("/caballos")
    public String mostrarUsuario(Model model) {
       
        model.addAttribute("caballos", caballoObjeto);
        
        return "caballos";
    }
    
 // Procesar el formulario (POST)
    @PostMapping("/procesar")
    public String procesarFormulario(@ModelAttribute Caballo caballo, Model model) {
        // Aquí ya tienes los datos del formulario en el objeto "usuario"
        model.addAttribute("caballoProcesado", caballo);
        
        return "resultado";
    }

}
