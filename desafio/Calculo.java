import java.util.Locale;
import java.util.Scanner;

public class Calculo{

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		float A, B, C;
		double PI=3.14159;
		
		
		System.out.println("Digite o primeiro número: ");
		A = sc.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		B = sc.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		C = sc.nextFloat();
		
		System.out.printf("Triângulo: %.3f%n", (A * C) / 2);
		System.out.printf("Circulo: %.3f%n", PI * C * C);
		System.out.printf("Trapézio: %.3f%n", ((A + B)/2) * C);
		System.out.printf("Quadrado: %.3f%n", B * B);
		System.out.printf("Retângulo: %.3f%n", A * B);
		
		
		sc.close(); 

	}

}
