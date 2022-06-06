import java.util.Scanner;

public class hora {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		float inicio, fim, total;
		
		System.out.print("Inicio do jogo: ");
		inicio = sc.nextFloat();
		
		System.out.print("Fim do jogo: ");
		fim = sc.nextFloat();
		
		System.out.println("SAIDA:");
		
		if (inicio < fim) {
			total = (inicio - fim) * (-1);
			
		}else {
			total = 24 - inicio + fim;
			
		}
		System.out.printf("O jogo durou %.2f horas.", total);
		
		sc.close();
		}

}
