package modulo1_fundamentos;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// OPERADORES LÓGICOS
		/* Os operadores lógicos em Java são usados para combinar ou inverter expressões booleanas, 
		 * retornando um valor de verdadeiro (true) ou falso (false).*/
		
		// LISTA DE OPERADORES LÓGICOS
		
		// E (AND) Lógico &&
		// Retorna true se ambas as condições forem verdadeiras.
		// Se qualquer condição for falsa, o resultado será falso.	
		
		// OU (OR) Lógico ||
		// Retorna true se pelo menos uma das condições for verdadeira.
		// Só retorna falso se todas as condições forem falsas.
		
		// NAO (NOT) Lógico: ! 
		// Inverte o valor de uma expressão booleana:
		// !true → false
		// !false → true
		
		
		// EXEMPLO PRÁTICO COM OPERADOR &&
		int idade = 25;
		boolean temCNH = true;
		
		if (idade >= 18 && temCNH) { // Se ambas as condições devem ser verdadeiras.
			System.out.println("Pode dirigir!");
		} else { // Caso alguma das consições for negativa.
			System.out.println("Não pode dirigir!");
		}
		
		
		// EXEMPLO PRÁTICO COM OPERADOR || 
		boolean estaChovendo = false;
		boolean temGuardaChuva = true;
		
		if (estaChovendo || temGuardaChuva) { // Se uma das condições for verdadeira.
			System.out.println("Pode sair de casa.");
		} else { // Se ambas as condiçõs forem falsa.
			System.out.println("Melhor ficar em casa.");
		}
		
		
		// EXEMPLO PRÁTICO COM OPERADOR !
		boolean estaSol = false;
		
		if (!estaSol) { // Se a for false, irá inverter pra verdadeira. 
			System.out.println("Está nublado ou chovendo.");
		} else {
			System.out.println("Está ensolarado.");
		}
		
		
		//COMBINANDO OPERADORES COM ENTRADA DE DADOS
		Scanner scanner = new Scanner(System.in);
		
		int anoNascimento;
		boolean possuiCNH;
		
		System.out.println("Informe o ano de nascimento: ");
		anoNascimento = scanner.nextInt(); 
		
		System.out.println("Você possui CNH? (True/False): ");
		possuiCNH = scanner.nextBoolean();
		
		int anoAtual = 2025;		
		int idadeAtual = anoAtual - anoNascimento;
		
		if (idadeAtual >= 18 && possuiCNH) { // Se tiver +18 e possuir habilitação
			System.out.printf("Sua idade atual é %d anos e você possui habilitação, então você pode dirigir.", idadeAtual);
		} else if (idadeAtual >= 18 && !possuiCNH) { // Se tiver +18 e não possuir habilitação
			System.out.printf("Sua idade atual é %d anos e você não possui habilitação, então você pode dirigir em algumas situações.", idadeAtual);
		} else if (idadeAtual >= 16) { // Se tiver +16
			System.out.printf("Sua idade atual é %d anos e você não possui habilitação, então você pode dirigir em algumas situações.", idadeAtual);
		} else {
			System.out.printf("Sua idade atual é %d anos, então você não pode dirigir.", idadeAtual);
		}
		
		scanner.close();
	}
}      