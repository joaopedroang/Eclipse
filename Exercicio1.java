package Aula2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um núero: ");
		double n1 = entrada.nextDouble();
		
		System.out.println("Insira outro número: ");
		double n2 = entrada.nextDouble();
		
		double soma = n1 + n2;
		
		if (soma > 20) {
			double resultado1 = soma + 5;
			System.out.println("O resultado é: " + resultado1);
		}
		else {
			double resultado2 = soma * 8;
			System.out.println("O resultado é: " + resultado2);
		}
		// TODO Auto-generated method stub

	}

}
