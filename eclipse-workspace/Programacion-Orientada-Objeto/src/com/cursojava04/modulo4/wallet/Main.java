package com.cursojava04.modulo4.wallet;

public class Main {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria(123, 152.2,"Fernando");
		CuentaBancaria cuenta2 = new CuentaBancaria(431, 32.2,"Juan");
		
		System.out.println(cuenta1.getTitular() + " Tu saldo es: " + cuenta1.getSaldo());
		System.out.println(cuenta2.getTitular() + " Tu saldo es: " + cuenta2.getSaldo());
	}

}
