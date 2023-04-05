import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de pães vendidos: ");
		double p = entrada.nextDouble();
		
		System.out.println("Informe a quantidade de broas vendidas: ");
		double b = entrada.nextDouble();
		
		double P = p * 0.12;
		double B = b * 1.50;
		double T = P + B;
		double d = (P / 100) * 10;
		
		System.out.println("O valor total arrecadado foi: R$" + T);
		System.out.println("O valor a ser depositado é: R$" + d);
		
		
		// TODO Auto-generated method stub

	}

}
