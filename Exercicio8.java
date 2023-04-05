import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o nome do usuário: ");
		String n = entrada.next();
		
		System.out.println("Insira a altura do usuário: ");
		double h = entrada.nextDouble();
		
		System.out.println("Insira o peso do usuário: ");
		double p = entrada.nextDouble();
		
		double IMC = p / (h * h);
		
		System.out.println(n + " tem o IMC: " + IMC);
		
		// TODO Auto-generated method stub

	}

}
