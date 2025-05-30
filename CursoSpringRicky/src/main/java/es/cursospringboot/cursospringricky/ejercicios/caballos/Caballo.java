package es.cursospringboot.cursospringricky.ejercicios.caballos;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Component
@Table(name = "TB_CABALLO")
public class Caballo {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "ID_CABALLO")
	private int id;
	@Column(name = "NOMBRE", length = 50, nullable = false)
	private String nombre;
	@Column(name = "EDAD", nullable = false)
	private int edad;
	@Column(name = "VELOCIDAD_MAXIMA", nullable = false)
	private double velocidadMaxima;
	@Column(name = "NUMERO_TRIUNFOS", nullable = false)
	private int numeroTriunfos;
	@Column(name = "EXPERIENCIA", nullable = false)
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
