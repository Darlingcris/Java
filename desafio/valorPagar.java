import java.util.Locale;
import java.util.Scanner;

public class valorPagar {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float minutos,pag=0,conta=0;
		
		System.out.println("------------Conta de Telefone------------");
		System.out.println("Quantos minutos foram gastos durante o mes? ");
		minutos = sc.nextFloat();
		conta += minutos;
		
		if(conta > 100) {
			pag = conta - 100;
			System.out.printf("Será acrescentado o valor de R$%.2f no valor do seu plano mensal.", pag*2);
			System.out.println("\n-------------------------------------");
		}else {
			System.out.println("Será pago o valor do seu plano mensal!");
			System.out.println("\n------------------------------------------");
		}
		
		sc.close();
			
		}
	}