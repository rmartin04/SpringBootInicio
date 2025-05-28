package es.cursospringboot.cursospringricky.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.cursospringboot.cursospringricky.ejercicios.caballos.Caballo;

public interface CaballoRepository extends JpaRepository<Caballo, Integer> {

	// No es necesario definir métodos adicionales, JpaRepository ya proporciona
	// métodos CRUD básicos.

	// Si necesitas consultas personalizadas, puedes definir métodos aquí.
	// Por ejemplo:
	// List<Caballo> findByNombre(String nombre);

}
