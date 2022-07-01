import java.util.Scanner;

public class funcao {

	
	public static int max (int x, int y, int z) {
		int aux;
		
		if (x>y && x>z) {
			aux=x;
			
		}else if(y>z) {
			aux=y;
	
		}else{
			 aux=z;
			}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("O maior valor é: "+ value );
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite 3 numeros.");
		System.out.print("Primeiro numero: ");
		int a = sc.nextInt();
		System.out.print("Segundo numero: ");
		int b = sc.nextInt();
		System.out.print("Terceiro numero: ");
		int c = sc.nextInt();
		
		int higher= max(a,b,c);
		showResult(higher);
				
		sc.close();

	}

}
