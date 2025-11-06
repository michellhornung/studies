package com.alura;

import java.util.Scanner;

public class PassouDeAno {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Informe a nota do aluno: ");
		int nota = scanner.nextInt();
		
		Boolean notaBool = nota > 70;
		
		if (nota > 70 ) {
			System.out.println("O Aluno passou!!!");
		} else {
			
			System.out.println("O Aluno nao passou!!!");

		}
		
		scanner.close();
		
	}

}
