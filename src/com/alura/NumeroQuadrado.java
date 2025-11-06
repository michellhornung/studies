package com.alura;

import java.util.Scanner;

public class NumeroQuadrado {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ïnforme um numero: ");
		Integer numero = scanner.nextInt();
		
		Integer quadrado =  numero * numero;
		
		System.out.println("O quadrado de " + numero + " é " + quadrado + ".");
		
		scanner.close();
	}

}
