package com.cursojava04.modulo4.instrumentos;

public class Guitarra {
	
	// ATRIBUTOS
	public String tipo;
	public String marca;
	public int cantidadCuerdas;
	public String color;
	
	//METODOS
	public void emitirNota() {
		System.out.println("Emitiendo una nota");
	}
	
	public void emitirNotaMarca(Guitarra guitarra) {
		System.out.println(guitarra.marca + " Emitiando una nota");
	}
	
	public void afinar() {
		System.out.println("Afinando la guitarra");
	}
	
	

}