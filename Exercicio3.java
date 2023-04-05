import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em graus Farenheit: ");
		double F = entrada.nextDouble();
		
		double C = (5*(F - 32))/9;
		
		System.out.println("A temperatura em graus Célcius é: " + C);
		
		// TODO Auto-generated method stub

	}

}
