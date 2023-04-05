import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em graus Célcius: ");
		double C = entrada.nextDouble();
		
		double F = (C * 1.8) + 32;
		
		System.out.println("A temperatura em graus Farenheit é: " + F);
		// TODO Auto-generated method stub

	}

}
