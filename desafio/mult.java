import java.util.Scanner;

public class mult {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		int n,num;
		
		System.out.print("1° numero: ");
		n=sc.nextInt();
		
		System.out.print("2° numero: ");
		num=sc.nextInt();
		
		
		if (num%n==0 || n%num==0) {
				System.out.println("Sao Multiplos.");
			
		}else {
				System.out.println("Nao sao multiplos.");
		}
		
		
		sc.close();
		
		}

}
