package es.cursospringboot.cursospringricky;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
	
	public double operar( double num1, double num2,String operacion) {
		double resultado = 0.0;
		switch (operacion) {
		case "suma":
			resultado = num1 + num2;
			break;
		case "resta":
	        resultado = num1 - num2;
			break;
		case "multiplicacion":
			resultado = num1 * num2;
			break;
		case "division":
			if (num2 != 0) {
			resultado = num1 / num2;
			} else {
				System.out.println("Error: División por cero no permitida.");
			}
			break;
		default:
			System.out.println("Operación no reconocida.");
		}
		return resultado;
	}
	

}
