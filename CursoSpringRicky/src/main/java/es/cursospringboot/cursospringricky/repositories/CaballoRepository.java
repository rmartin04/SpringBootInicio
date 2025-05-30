package es.cursospringboot.cursospringricky.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.cursospringboot.cursospringricky.ejercicios.caballos.Caballo;

public interface CaballoRepository extends JpaRepository<Caballo, Integer> {

	Object findByNombreStartsWithIgnoreCase(String nombre);
	List<Caballo> findByNombre(String nombre);

	// No es necesario definir métodos adicionales, JpaRepository ya proporciona
	// métodos CRUD básicos.

	// Si necesitas consultas personalizadas, puedes definir métodos aquí.
	// Por ejemplo:
	// List<Caballo> findByNombre(String nombre);

}
