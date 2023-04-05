package Aula2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Insira a sua idade");
		int idade = entrada.nextInt();
		
		if (idade >= 18) {
			System.out.println(nome + " está apto a se alistar !!");
		}
		else {
			System.out.println(nome + " não está apto a se alistar !!");
		}
		// TODO Auto-generated method stub

	}

}
