package es.cursospringboot.cursospringricky.lambdas.advanced;

import java.util.Arrays;

import es.cursospringboot.cursospringricky.lambdas.advanced.dao.Producto;
import es.cursospringboot.cursospringricky.lambdas.advanced.dao.ProductoDAO;
import es.cursospringboot.cursospringricky.lambdas.advanced.models.Cliente;

public class Test {

	public static void main(String[] args) {
		EjemploConsumer ec = new EjemploConsumer();
		ec.getProductos( () -> {
        	ProductoDAO pDAO = new ProductoDAO(null);
        	return pDAO.getProductos();
        } );
		
		ec.getProductos(() -> Arrays.asList(new Producto()) );
		
		
		ec.generaNombre("Jose");
		

	}
	
	public static void pintaNombreCliente(Cliente cliente) {
		System.out.println(cliente.getNombre());
	}

}
