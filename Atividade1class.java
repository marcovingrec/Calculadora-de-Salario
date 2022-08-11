package Aula2;

import java.util.Scanner;

public class Atividade1class {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("==== CALCULADORA DE SALARIO ====");
		System.out.println("Digite o nome do funcionario: ");
		String funcionario = input.next();
		System.out.println("Digite o valor do salario em R$: ");
		Double salario = input.nextDouble();
		Double reajuste = 1.1;
		
		System.out.println("");
		System.out.println("Com o aumento de 10%, o salario passara a ser de R$ "+ (salario*reajuste));
		
		input.close();
		

	}

}
