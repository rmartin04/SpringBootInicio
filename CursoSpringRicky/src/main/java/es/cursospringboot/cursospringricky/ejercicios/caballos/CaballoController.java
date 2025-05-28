package es.cursospringboot.cursospringricky.ejercicios.caballos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.cursospringboot.cursospringricky.repositories.CaballoRepository;


@Controller
public class CaballoController {
	// Inyectamos el repositorio de Caballo para acceder a la base de datos
	@Autowired
	private CaballoRepository caballoRep;
	
	@Autowired
	private Caballo caballoObjeto;
	
    @GetMapping("/caballos")
    public String mostrarCaballo(Model model) {
       
        model.addAttribute("caballo", caballoObjeto);
        
        return "caballos";
    }
    
 // Procesar el formulario (POST)
    
    @PostMapping("/introducir")
    public String procesarFormulario(@ModelAttribute Caballo caballo, Model model) {
    	
    	caballoRep.save(caballo); // Guardamos el caballo en la base de datos
    	caballoRep.findAll(); // Recuperamos todos los caballos de la base de datos (opcional)
    	
        // Aquí ya tienes los datos del formulario en el objeto "usuario"
    	
        model.addAttribute("caballoProcesado", caballo);
        
        return "introducidos";
    }

}
