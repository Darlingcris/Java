import java.util.Locale;
import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double largura,comprimento, metro,area,total;
		
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		metro = sc.nextDouble();
		
		area = largura * comprimento;
		total = area * metro;
		
		System.out.printf("Area = %.2f%n" , area);
		System.out.printf("Preco = %.2f%n" , total);
		
		
		sc.close();

	}

}