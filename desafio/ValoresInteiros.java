import java.util.Scanner;

public class ValoresInteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		int A, B, C, D, diferenca;
		
		System.out.println("----------ATENÇÃO----------");
		System.out.println("Digite valores inteiros!");
		System.out.println("---------------------------\n");
		
		System.out.println("Digite o primeiro valor: ");
		A = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		B = sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		C = sc.nextInt();
		
		System.out.println("Digite o quarto valor: ");
		D = sc.nextInt();
		
		diferenca = (A * B) - (C * D);
		
		System.out.println("Diferença = " + diferenca);
		
		sc.close();

	}

}
