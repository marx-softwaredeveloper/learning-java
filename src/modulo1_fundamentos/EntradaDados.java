package modulo1_fundamentos;

import java.util.Scanner; // Importando a classe responsável pela entrada de dados

public class EntradaDados {

	public static void main(String[] args) {
		System.out.println("=== ENTRADA DE DADOS ===");
		System.out.println();
		
		Scanner sc = new Scanner(System.in); // Declarando o objeto para entrada de dados.
		
		String nomeCliente;
		String cpf;
		double valorInicial;
		int taxaJuros;
		
		System.out.printf("Infome o nome completo: ");
		nomeCliente = sc.nextLine(); //recebendo uma cadeia de caracteres.
		
		System.out.printf("Informe o CPF: ");
		cpf = sc.next(); //recebendo uma cadeia de caracteres.
		
		System.out.printf("Informe o valor inicial: ");
		valorInicial = sc.nextDouble(); //recebendo dados do tipo double.
		
		System.out.printf("Informe a taxa de juros: ");
		taxaJuros = sc.nextInt(); //recebendo dados do tipo inteiro.
		
		double calcularJuros = (valorInicial * taxaJuros) / 100;
		double valorTotal = calcularJuros + valorInicial;
		
		System.out.println("");
		System.out.println("========== SITUAÇÃO DO CLIENTE ==========");
		System.out.println("");
		
		System.out.printf("NOME COMPLETO: %s%n", nomeCliente);
		System.out.printf("CPF: %s%n", cpf);
		System.out.printf("VALOR INICIAL: R$ %.2f%n", valorInicial);
		System.out.printf("TAXA DE JUROS: %d%%%n", taxaJuros);
		System.out.printf("VALOR DO JUROS: R$ %.2f%n", calcularJuros);
		System.out.printf("VALOR TOTAL DA DÍVIDA: R$ %.2f", valorTotal);	
		
		sc.close();
	}

}
