package cal_salario_min;
import java.util.Scanner;

//Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
//(1SM=R$788,00)

// ---Calculo ----//

// ler o valor do salário minimo (atual)
// ler salário minimo do usuário
// Cal a qaunt de salarios minimos que o usuário ganha


public class salario_minimo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int salario_min = 1100;
		int salario_pe;
		
		System.out.println("Digite seu salario atual: ");
		salario_pe = input.nextInt();		
		
		int quat = salario_pe/salario_min; // vai dividir em partes iguais do sal_min
		
		
		System.out.println ("A pessoa ganha um salario de: " + salario_pe + " que e equivalente a : " + quat + " salarios minimos");

	}

}
