import java.util.Locale;
import java.util.Scanner;

public class intervalo {
	
	public static void main(String[] args) {
 
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		
		float valor;
 
		System.out.println("Digite um valor: ");
		valor = sc.nextFloat();
		
		
		
		if (valor>=0 && valor<=25) {
			System.out.printf("O Intervalo de %.2f está entre: ",valor);
			System.out.println("[0 e 25]");
			
		}else {
			if (valor>25 && valor <=50) {
				System.out.printf("O Intervalo de %.2f está entre: ",valor);
				System.out.println("[25 e 50]");
			}
			
			if(valor>50 && valor<=75) {
				System.out.printf("O Intervalo de %.2f está entre: ",valor);
				System.out.println("[50 e 75]");
			}
			
			if(valor>75 && valor<=100) {
				System.out.printf("O Intervalo de %.2f está entre: ",valor);
				System.out.println("[75 e 100]");
			}
			
			if (valor<0 || valor>100) {
				System.out.println("VALOR FORA DO INTERVALO.");
			}
		}
		
		sc.close();
}
}