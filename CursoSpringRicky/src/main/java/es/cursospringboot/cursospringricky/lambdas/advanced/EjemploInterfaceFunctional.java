package es.cursospringboot.cursospringricky.lambdas.advanced;

import es.cursospringboot.cursospringricky.lambdas.advanced.aritmetica.Aritmetica;
import es.cursospringboot.cursospringricky.lambdas.advanced.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {

        Aritmetica suma = Double::sum;
        Aritmetica resta = (a, b) -> a - b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10, 5, suma));
        System.out.println(cal.computar(10, 5, resta));
        System.out.println(cal.computar(10, 5, (a ,b) -> a * b));

        System.out.println(cal.computarConBiFunction(10, 5, (a, b) -> a+b));
    }
}
