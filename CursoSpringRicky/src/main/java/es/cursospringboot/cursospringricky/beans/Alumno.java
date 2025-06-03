package es.cursospringboot.cursospringricky.beans;

import java.util.List;

public class Alumno {
	private int id;
    private String nombre;
    private String email;
    private List<String> asignaturas;
    private double notaMedia;
    
	public Alumno() {
		super();
		
	}
	public Alumno(int id, String nombre, String email, List<String> asignaturas, double notaMedia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.asignaturas = asignaturas;
		this.notaMedia = notaMedia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
    
	
}
