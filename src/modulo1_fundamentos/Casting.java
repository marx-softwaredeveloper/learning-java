package modulo1_fundamentos;

public class Casting {

	public static void main(String[] args) {
		System.out.println("=== CONVERSÃO DE TIPOS (CASTING) ===");
		System.out.println();
		
		System.out.println("Conversão Implícita (Widening Casting)");		
		/* Ocorre automaticamente quando há ampliação de tipos (de um 
		 * tipo menor para um tipo maior na hierarquia de dados).*/
		
		// Ordem Hierárquica dos Tipos Numéricos:
		// byte → short → int → long → float → double
		
		// EXEMPLO:
		int num1 = 100;
		double num1Double = num1; // Conversão implícita (int para double)
		System.out.println("Valor original: " + num1);
		System.out.println("Valor após a conversão: " + num1Double);
		System.out.println();
		
		
		System.out.println("Conversão Explícita (Narrowing Casting)");
		/* Deve ser feita manualmente, pois ocorre quando há redução de tipos
		 * (de um tipo maior para um tipo menor na hierarquia de dados).*/
		
		// EXEMPLO:
		double num2Double = 9.78;
		int num2Int = (int) num2Double; // Conversão explícita (double para int)
		System.out.println("Valor original: " + num2Double);
		System.out.println("Valor após a conversão: " + num2Int);
		System.out.println();
		
		
		
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		
		
		System.out.println("=== CONVERSÃO DE TIPOS PRIMITIVOS PARA NÃO PRIMITIVOS ===");
		System.out.println();
		
		System.out.println("Conversão de Primitivo para Objeto (Autoboxing):");
		/* OS Tipos primitivos são automaticamente convertidos para seus 
		 * equivalentes objetos (classes wrapper).*/
		
		//EXEMPLO:
		int num3 = 10;
		Integer num1Obj = num3; // Autoboxing
		System.out.println(num1Obj);
		System.out.println();
		
		
		System.out.println("Conversão de Objeto para Primitivo (Unboxing):");
		// Ocorre quando um objeto wrapper é convertido para seu tipo primitivo.
		
		// EXEMPLO: 
		Integer num2Obj = 20;
		int num4 = num2Obj; // Unboxing
		System.out.println(num4);	
		System.out.println();
		
		
		
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		
		
		System.out.println("=== CONVERSÃO ENTRE TIPOS NUMÉRICOS E STRING ===");
		System.out.println();
		
		System.out.println("Conversão de Primitivo Para String:");
		// Use o método String.valueOf() ou concatenação com uma string.
		// EXEMPLO:
		int num5 = 100;
		String str = String.valueOf(num5);
		System.out.println(str);
		System.out.println();
		
		System.out.println("Conversão de String Para Primitivo:");
		// Use os métodos das classes wrapper, como Integer.parseInt() ou Double.parseDouble().
		// EXEMPLO:
		String str2 = "123";
		int num6 = Integer.parseInt(str2);
		System.out.println(num6);
		System.out.println();
		
		
		
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		
				
		System.out.println("=== CONVERSÃO ENTRE TIPOS NÃO COMPATÍVEIS ===");
		System.out.println();
		
		System.out.println("Conversão Entre Tipos Não Compatíveis:");
		/* Java não permite conversão direta entre tipos não relacionados, 
		 * como String e int. Para isso, podemos usar parsing ou métodos 
		 * utilitários.*/
		
		//EXEMPLO1 : Conversão de String para Caracteres
		String str3 = "Java";
		char ch = str3.charAt(0); // Captura o primeiro caractere
		System.out.println(ch);
		
		//EXEMPLO 2: Conversão de Caracteres para String
		char ch2 = 'A';
		String str4 = String.valueOf(ch2);
		System.out.println(str4);		
	}

}
