package com.cursojava04.modulo4.encapsulamiento;

public class Main {

	public static void main(String[] args) {
		
		//CREAR UN OBJETO DE PERSONA
		Persona p1 = new Persona("Tio", "Nacho", 34, "18750211k");
		
		p1.setNombre("Nachito");
		System.out.println(p1.getNombre());
		

	}

}