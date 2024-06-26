package com.cursojava04.modulo4.arreglos;

public class Main {

	public static void main(String[] args) {
		// LOS ARREGLOS DEBEN SER DE UN MISMO TIPO
		// SON DE TAMAÑO FIJO Y USA INDICES
		//-----------------------------------------------------
		
		
		System.out.println("-----DECLARACION DE UN ARREGLO DE ENTEROS-----------");
		
		// TAMBIEN SE PUEDE HACER EN 1 LINEA
		int[] digitos = new int[7];
		// EL 7 SIGNIFICA LOS ESPACIOS PARA DATOS
		// [][][][][][][]
		// 0 1 2 3 4 5 6    --> PARTE DESDE EL 0
		digitos[0] = 100;
		digitos[1] = 290;
		digitos[2] = 478;
		digitos[3] = 324;
		digitos[4] = 12;
		digitos[5] = 123;
		digitos[6] = 1;
		System.out.println("El primer numero es: " + digitos[0]);
		System.out.println("El segundo numero es: " + digitos[1]);
		System.out.println("El tercer numero es: " + digitos[2]);
		System.out.println("El cuarto numero es: " + digitos[3]);
		System.out.println("El quinto numero es: " + digitos[4]);
		System.out.println("El sexto numero es: " + digitos[5]);
		System.out.println("El septimo numero es: " + digitos[6]);
		
		System.out.println("------------------- FOR DIGITOS-------------------");
		
		for (int i = 0; i < digitos.length; i++) {
	       System.out.println("Elemento en la posición " + i + ": " + digitos[i]);
	    }
		
		// CREAMOS EL OBJETO Y LLAMAMOS LOS METODOS
		Main main = new Main();
		main.sumarNumeros();
		main.recorrerConForEach();
	}
	
	public void sumarNumeros() {
		System.out.println("----------- FOR SUMAR NUMEROS------------");
		
		int[] misNumeros = {20,34,70,23,12,34,65,34,34,23,54};
		int suma = 0;
		for(int i = 0; i < misNumeros.length; i++) {
			suma += misNumeros[i];
		}
		System.out.println("La suma es: " + suma);
	}
	
	public void recorrerConForEach() {
		System.out.println("----------- FOR EACH------------");
		int[] arregloNumeros = {10,20,30,40,50,60};
		// RECORRER CON FOR EACH Y MOSTRARLO
		for(int num : arregloNumeros) {
			System.out.println(num);
		}
		
		System.out.println("----------- FOR EACH CON STRING------------");
		String[] arregloNombres = {"Pedro","Juan","Diego","Jose"};
		for(String nombres : arregloNombres) {
			System.out.println(nombres);
		}
	}
	
	

}
