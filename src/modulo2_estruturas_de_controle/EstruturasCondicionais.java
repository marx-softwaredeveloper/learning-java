package modulo2_estruturas_de_controle;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// ESTRUTURA CONDICIONAL IF (Se)
		// A estrutura if é usada para executar um bloco de código somente se uma condição for verdadeira.
		
		// EXEMPLO: 
		System.out.printf("Informe sua idade: ");
		int idade = scanner.nextInt();
		
		if (idade >=18) { // Se a condição for verdadeira, o bloco de código abaixo será executado.
			System.out.println("Você é maior de idade.");
		}
		System.out.println();
		
		
		
		// ESTRUTURA CONDICIONAL IF...ELSE (Se, Senão)
		// A estrutura if-else permite que o programa execute um bloco de código caso a condição do if seja falsa.
		
		//EXEMPLO: 
		System.out.printf("Informe o ano de nascimento: ");
		int anoNascimento = scanner.nextInt();
		
		int idadeAtual = 2025 - anoNascimento;
		
		if (idadeAtual >= 18) { 
			// Se a condição for verdadeira, este bloco de código será executado.
			System.out.printf("Atualmente você tem %d anos e é maior de idade.", idadeAtual);
		} else { 
			// Se a condição for falsa, este bloco será executado.
			System.out.printf("Atualmente você tem %d anos e é menor de idade.", idadeAtual);	
		} 
		System.out.println();
		System.out.println();
		
		
		
		// ESTRUTURA IF...ELSE IF (Se, Senão Se)
		// A estrutura if-else if é usado para testar múltiplas condições.
		
		// EXEMPLO:
		System.out.printf("Informe uma nota de 0 à 10: ");
		double nota = scanner.nextDouble();
		
		if (nota >= 8) {
			// Executado se condição1 for verdadeira
			System.out.println("Nota A");
		} else if (nota >= 7) {
			// Executado se condição2 for verdadeira
			System.out.println("Nota B");
		} else if (nota >= 6) {
			// Executado se condição3 for verdadeira
			System.out.println("Nota C");
		} else {
			// Executado se todas as condições forem falsas
			System.out.println("Reprovado");
		}
		System.out.println();
		
		
		
		// ESTRUTURA CONDICIONAL SWITCH
		// O switch é usado para simplificar a escolha entre múltiplas opções de valor.
		
		// EXEMPLO: 
		System.out.println("Informe um número correspondente ao dia da semana: ");
		int dia = scanner.nextInt();
		
		switch (dia) {
			case 1: 
				// Executado caso valor for 1
				System.out.println("Domingo");
				break;
			case 2:
				// Executado caso valor for 2
				System.out.println("Segunda-feira");
				break;
			case 3: 
				// Executado caso valor for 3
				System.out.println("Terça-feira");
				break;
			case 4: 
				// Executado caso valor for 4
				System.out.println("Quarta-feira");
				break;
			case 5: 
				// Executado caso valor for 5
				System.out.println("Quinta-feira");
				break;
			case 6: 
				// Executado caso valor for 6
				System.out.println("Sexta-feira");
				break;
			case 7: 
				// Executado caso valor for 7
				System.out.println("Sábado");
				break;
			default:
				// Executado caso nenhum valor corresponda
				System.out.println("Dia inválido");
		}
		// O break é usado para sair do switch após executar um caso.
		// O default é opcional e executado se nenhum caso corresponder.
		
		scanner.close();
	}

}
