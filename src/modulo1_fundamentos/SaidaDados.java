package modulo1_fundamentos;

public class SaidaDados {

	public static void main(String[] args) {
		System.out.println("=== ENTRADA DE DADOS ===");
		System.out.println();
		
		System.out.println("Saída de dados com o método System.out.print():"); 
		// Exibe a mensagem sem quebra de linha.
		System.out.print("Olá, ");
		System.out.print("mundo!");
		System.out.println();
		System.out.println();
		
		System.out.println("Saída de dados com o método System.out.println():");
		// Exibe a mensagem e adiciona uma quebra de linha.
		System.out.println("Olá,");
		System.out.println("mundo!");
		System.out.println();
		
		System.out.println("Saída de dados com o método System.out.printf():");
		// Permite exibir mensagens formatadas usando placeholders.
		String nome = "Marx";
		int idade =  29;
		System.out.printf("Olá, meu nome é %s e tenho %d anos.%n", nome, idade);
		// %s = Adiciona uma String (texto)
		// %d = Adiciona um Inteiro (decimal)
		// %n = Adiciona uma quebra de linha
	}

}
