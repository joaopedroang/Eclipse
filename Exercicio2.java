import java.util.Scanner;
public class Exercicio2 {
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		double n1 = entrada.nextDouble();
		
		System.out.println("Insira o segundo número: ");
		double n2 = entrada.nextDouble();
		
		double a = n1 + n2;
		double s = n1 - n2;
		double m = n1 * n2;
		double d = n1 / n2;
		
		System.out.println("A soma dos dois números é: " + a );
		System.out.println("A subtração dos dois números é: " + s);
		System.out.println("A multiplicação dos dois números é: " + m);
		System.out.println("A divisão dos dois números é: " + d);
		// TODO Auto-generated method stub

	}

}
