import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		int c;
		double a;
		double b;
		char d;
		
		x = sc.next();
		c = sc.nextInt();
		a = sc.nextDouble();
		b = sc.nextDouble();
		d = sc.next().charAt(0);
		
		System.out.println("Voce digitou: " + x);
		System.out.println("Voce digitou: " + c);
		System.out.println("Voce digitou: " + a);
		System.out.printf("Voce digitou: %.2f%n" , b);
		System.out.println("Voce digitou: "+ d);
		
		sc.close();

	}

}
