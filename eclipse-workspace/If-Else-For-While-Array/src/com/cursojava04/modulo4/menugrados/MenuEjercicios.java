package com.cursojava04.modulo4.menugrados;

import java.util.Scanner;

public class MenuEjercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    ConversionTemperatura.ejecutar(scanner);
                    break;
                case 2:
                    CalculoAreaCirculo.ejecutar(scanner);
                    break;
                case 3:
                    OperacionesBasicas.ejecutar(scanner);
                    break;
                case 4:
                    DescuentoCompra.ejecutar(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione un número del 1 al 5.");
                    break;
            }
        } while (opcion != 5);
        scanner.close();
    }

    private static void mostrarMenu() {
    	 System.out.println("**********************************************");
        System.out.println("Menú de Ejercicios:");
        System.out.println("1. Conversión de Temperatura (Celsius a Fahrenheit)");
        System.out.println("2. Cálculo de Área de un Círculo");
        System.out.println("3. Operaciones con Dos Números");
        System.out.println("4. Descuento en una Compra");
        System.out.println("5. Salir del programa");
        System.out.println("**********************************************");
       
    }
}
