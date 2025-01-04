package modulo1_fundamentos;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		// OPERADOR TERNÁRIO
		/* O operador ternário é uma forma concisa de escrever expressões condicionais. 
		 * Ele substitui estruturas if-else simples e ajuda a melhorar a legibilidade do 
		 * código em situações específicas. O nome "ternário" vem do fato de que o operador 
		 * utiliza três operandos. */
		
		// SINTAXE: condição ? expressão1 : expressão2;
		// condição: Uma expressão booleana que será avaliada como true ou false.
		// expressão1: Retornada se a condição for true.
		// expressão2: Retornada se a condição for false.
		
		//EXEMPLOS DE USO:
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu ano de nascimento: ");
		int anoNascimento = scanner.nextInt();
		
		int anoAtual = 2025;	
		int idadeAtual = anoAtual - anoNascimento;
		
		// Verificando se é maior de idade com operador ternário
		String maiorDeIdade = (idadeAtual >= 18) ? "maior de idade." : "menor de idade.";
		
		System.out.printf("Sua idade atual é %d anos, é %s %n", idadeAtual, maiorDeIdade);
		System.out.println();
		
		System.out.println("Você possui CNH? (True/False): ");
		boolean possuiCNH = scanner.nextBoolean();
		
		
		// Encadeamento de Operadores Ternários
		String podeDirigir = (idadeAtual >= 18 && possuiCNH) ? "Pode dirigir sem restrições." : // Se for maior de 18 anos e possuir habilitação, pode dirigir sem restrições.
							 (idadeAtual >= 18 && !possuiCNH) ? "Pode dirigir em algumas situações." : // Se for maior de 18 anos e não possuir habilitação, pode dirigir em algumas situações.
							 (idadeAtual >= 16) ? "Pode dirigir em algumas situações." : // Se for maior de 16 anos e não possuir habilitação, pode dirigir em algumas situações.
							 "Não pode dirigir."; // Se não for maior de 16 anos, não pode dirigir.
		
		
		System.out.println(podeDirigir);
							
		scanner.close();		
	}
}
