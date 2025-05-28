package es.cursospringboot.cursospringricky.ejercicios;

import org.springframework.stereotype.Component;

@Component
public class Caballo {
	
	private String nombre;
	private int edad;
	private double velocidadMaxima;
	private int numeroTriunfos;
	private double experiencia;
	
	public Caballo() {
	}
	
	public Caballo(String nombre, int edad, double velocidadMaxima, int numeroTriunfos, double experiencia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.velocidadMaxima = velocidadMaxima;
		this.numeroTriunfos = numeroTriunfos;
		this.experiencia = experiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getNumeroTriunfos() {
		return numeroTriunfos;
	}

	public void setNumeroTriunfos(int numeroTriunfos) {
		this.numeroTriunfos = numeroTriunfos;
	}

	public double getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Caballo [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", velocidadMaxima=");
		builder.append(velocidadMaxima);
		builder.append(", numeroTriunfos=");
		builder.append(numeroTriunfos);
		builder.append(", experiencia=");
		builder.append(experiencia);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
