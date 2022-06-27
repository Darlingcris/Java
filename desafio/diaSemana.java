import java.util.Scanner;

public class diaSemana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("=====Dia da Semana=====");
		System.out.print("Escolha um número de 1 a 7 para saber o dia da semana: ");
		num=sc.nextInt();
		
		switch (num) {
			
			case 1: 
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
		
		}
		

		sc.close();

	}

}