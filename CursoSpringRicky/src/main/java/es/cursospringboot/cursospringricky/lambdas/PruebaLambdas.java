package es.cursospringboot.cursospringricky.lambdas;

public class PruebaLambdas {

	public static void main(String[] args) {
		
//		Comparable comp = (nombre, num) -> System.out.println(" " + nombre  + num);
//		comp.pintaDatos("Ricky", 5);

		
//		Operacion suma = new Suma();
//		suma.operar(2, 3);
		
//		Operacion ope = (a,b) -> (int)Math.random();
//		
//		miOperacion(6,8,ope);
//		
//		miOperacion(9,18, (f,g)-> f-g );
//		
//		
//		miOperacion(9,18, (f,g) -> { 
//						if (f>5) {
//							f= f*4;
//						}
//						g=g+3;
//						return f*g;
//					});
		
//		System.out.println(ope.operar(2, 3));
//		ope = (a,b) -> a+b;
//		System.out.println(ope.operar(2, 3));
//		
//		Comparable comp = () -> System.out.println("Metodo 1 de la interfaz Comparable");
//		comp.metodo1();
		
		Comparable comp = t -> System.out.println("Texto: " + t);
		comp.metodo1("Hola, soy Ricky");

	}
	
	static void miOperacion (int valor1, int valor2, Operacion op) {
		int resultado = op.operar(valor1, valor2);
		System.out.println(resultado);
	}
	
	

}






