import java.util.Locale;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,total;
		
		
		System.out.println("Digite um numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		num2 = sc.nextInt();
		total = num1 + num2;
		System.out.println(num1 +" + "+ num2+" = "+total);
		
		
		
		sc.close();
	}

}
