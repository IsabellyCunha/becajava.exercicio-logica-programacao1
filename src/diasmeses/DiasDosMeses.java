package diasmeses;

import java.util.Scanner;

public class DiasDosMeses {

	/*1 - Calculando dias dos meses:
	Considerando que todos os meses tenham 30 dias, calcular o total de dias de "n" meses onde "n" é um valor 
	informado pelo usuário.
	 */
	
	
	public static void main(String[] args) {
		 int meses, dia;
		 Scanner leitor = new Scanner(System.in);
		 
		 System.out.print("Digite a quantidade de meses que voce deseja calcular: ");
		 meses = leitor.nextInt();
		 
		 dia = meses * 30;
		 
		 System.out.print("A quantidade de dias que " + meses + " meses tem é de: " + dia + " dias");

	}

}
