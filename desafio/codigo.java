import java.util.Scanner;


public class codigo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String nome=" ";
		int cod, quant;
		float valor = 0;
		
		System.out.print("Codigo do produto: ");
		cod = sc.nextInt();
		if (cod>=5 || cod<=0) {
			 System.out.println("Codigo invalido, tente novamente!");
			 return;
		}
		
		System.out.print("Quantidade do produto: ");
		quant = sc.nextInt();
		
		if (cod==1) {
			valor = 4.00f;
			nome = "Cachorro Quente";
		}
		else { if (cod==2) {
			valor = 4.50f;
			nome = "X-Salada";
			}
			if (cod==3) {
				valor = 5.00f;
				nome = "X-Bacon";
			}
			if (cod==4) {
				valor = 2.00f;
				nome = "Torrada Simples";
			}
			if (cod==4) {
				valor = 1.50f;
				nome = "Refrigerante";
			}
			
		}
		
		System.out.println("Nome: " + nome);
		System.out.printf("Valor unitario: %.2f",valor);
		System.out.printf("\nValor a pagar: %.2f",valor * quant);
				
	sc.close();

	}

}

