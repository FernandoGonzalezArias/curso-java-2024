package com.cursojava04.modulo4.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperacionesMatematicasTest {
	
	//DECLARO UN OBJETO
	private static OperacionesMatematicas operaciones;
	
	@BeforeAll
	public static void setUpObject() {
		System.out.println("configuracion inicial de objetos");
		//INICIALIZO EL OBJETO (LO CREO)
		operaciones = new OperacionesMatematicas();
	}
	
	@AfterAll
	public static void tearDownClass() {
		System.out.println("Limpieza final de la clase cuando termina de ejecutar");
		operaciones = null;
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("Esta de apunto de ejecutarse una prueba");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("Limpiando recursos...");
	}

	@Test
	public void testSumar() {
		//fail("Not yet implemented");
		System.out.println("Prueba de suma");
		assertEquals(4, operaciones.sumar(2, 2));
	}

}






