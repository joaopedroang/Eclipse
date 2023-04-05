import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno(a):" );
		String n= entrada.next();
		
		System.out.println("Insira a primeira nota do aluno: ");
		double n1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		double n2 = entrada.nextDouble();
		
		double m = (n1 + n2) / 2;
		
		System.out.println( n + " tem média: " + m);
		// TODO Auto-generated method stub

	}

}
