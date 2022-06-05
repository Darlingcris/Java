
import java.util.Scanner;

public class condicional {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero inteiro: ");
		num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("O numero " +num+ " digitado é Positivo.");
		}else {
			if (num < 0){
				System.out.println("O numero " +num+ " digitado é Negativo.");
		}
			if (num == 0) {
				System.out.println("O numero "+num+" digitado é Nulo");
			}
		}
		
		sc.close();
		
		}

}
