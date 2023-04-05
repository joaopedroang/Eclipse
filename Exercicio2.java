package Aula2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o nome do aluno: ");
		String nome = entrada.nextLine();		
		System.out.println("Insira a primeira nota do aluno: ");
		double n1 = entrada.nextDouble();
		System.out.println("Insira a segunda nota do aluno: ");
		double n2 = entrada.nextDouble();
		System.out.println("Insira a terceira nota do aluno: ");
		double n3 = entrada.nextDouble();
		
		double media = (n1 + n2 + n3) / 3;
		
		System.out.println("A média do aluno é: " + media);
		if (media < 4) {
			System.out.println(nome + " está reprovado !");
		}
		else if (media < 7) {
			System.out.println(nome + " está de recuperação !");
		}
		else {
			System.out.println(nome + " está aprovado !");
		}
		// TODO Auto-generated method stub

	}

}
