import java.util.Locale;
import java.util.Scanner;


public class RaioCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		double area, raio, A, PI = 3.14159;
		
		System.out.println("Digite o raio da circunferencia: ");
		raio = sc.nextDouble();
		
		A = Math.pow(raio,2);
		
		area = PI * A;
		
		System.out.printf("A area do circulo e: %.4f%n",area);
		
		sc.close();
	}

}
