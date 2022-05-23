import java.util.Locale;
import java.util.Scanner;

public class NumFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		float salario, horas_t, v_hora;
		
		System.out.println("Digite o número do funcionário: ");
		num = sc.nextInt();
		
		System.out.println("Informe o número de horas trabalhadas: ");
		horas_t = sc.nextFloat();
		
		System.out.println("Informe o valor trabalho/hora: ");
		v_hora = sc.nextFloat();
		
		salario = horas_t * v_hora;
		
		System.out.println("Número do Funcionário: " + num);
		System.out.printf("Salário à receber: U$ %.2f%n",salario);
		
		
		sc.close();

	}

}

