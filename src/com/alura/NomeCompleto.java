package com.alura;

import java.util.Scanner;

public class NomeCompleto {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = scanner.next();
		
		System.out.print("Informe o sobrenome: ");
		String sobrenome = scanner.next();
		
		System.out.println("O nome completo é: " + nome + " " + sobrenome);
		
		scanner.close();
		
		
	}

}
