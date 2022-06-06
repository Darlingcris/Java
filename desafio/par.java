import java.util.Scanner;

public class par {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número inteiro: ");
		num=sc.nextInt();
		
		if (num%2==0) {
			System.out.println("O valor digitado é Par.");
		}else{
			System.out.println("O valor digitado é Impar.");
		}
		
		
		sc.close();
		
		}

}

