import java.util.Locale;
import java.util.Scanner;

public class CodPeca {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, n1, n2;
		float valor1, valor2;
		
		System.out.println("Digite o código da peça: ");
		cod1 = sc.nextInt();
		
		System.out.println("Digite a quantidade de peças: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o valor unitário da peça: ");
		valor1 = sc.nextFloat();
		
		System.out.println("Digite o código da peça: ");
		cod2 = sc.nextInt();
		
		System.out.println("Digite a quantidade de peças: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o valor unitário da peça: ");
		valor2 = sc.nextFloat();
		
		
		System.out.printf("O valor total à pagar é: R$ %.2f%n",(n1*valor1) + (n2*valor2));
		
		sc.close();
		
	}

}

