package com.cursojava04.modulo4.lectura;

import java.util.Scanner;

public class LeerDatos {

	public static void main(String[] args) {
		
		// PARA LLER DATOS DESDE EL TACLADO
		// NECESITAMOS USAR LA CLASE SCANNER
		Scanner scanner = new Scanner(System.in);
		
		// LE DECIMOS A LA PERSONA QUE INGRESE UN NUMERO
		System.out.print("Ingrese un numero: ");
		int numeroEntero = scanner.nextInt();
		System.out.println("Ingresaste un " + numeroEntero);
		scanner.close() ;

	}

}
