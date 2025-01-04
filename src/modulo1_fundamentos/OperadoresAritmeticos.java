package modulo1_fundamentos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		System.out.println("=== OPERADORES ARITMÉTICOS BÁSICOS ===");
		System.out.println();
		
		int valor1 = 11, valor2 = 13;

        System.out.println("(+) Soma: " + (valor1 + valor2));         
        System.out.println("(-) Subtração: " + (valor1 - valor2));    
        System.out.println("(*) Multiplicação: " + (valor1 * valor2)); 
        System.out.println("(/) Divisão Inteira: " + (valor1 / valor2)); 
        System.out.println("(%) Módulo (resto): " + (valor1 % valor2)); 
        System.out.println();
        System.out.println();
        
        
        System.out.println("ATRIBUIÇÃO COM OPERADORES ARITMÉTICOS");
        System.out.println();
        

        valor1 += 5; // x = x + 5
        System.out.println("(+=) Após soma: " + valor1);

        valor1 -= 3; // x = x - 3
        System.out.println("(-=) Após subtração: " + valor1);

        valor1 *= 2; // x = x * 2
        System.out.println("(*=) Após multiplicação: " + valor1);

        valor1 /= 4; // x = x / 4
        System.out.println("(/=) Após divisão: " + valor1);

        valor1 %= 3; // x = x % 3
        System.out.println("(%=) Após módulo: " + valor1);
       
        System.out.println();
        System.out.println();
        
        
        System.out.println("OPERADORES DE INCREMENTO E DECREMENTO");
        System.out.println();
        
        int x = 5;    
        System.out.println("Valor inicial da variável x: " + x);
        
        ++x; // Pré-incremento
        System.out.println("Valor da variável x após o Pré-incremento: " + x);
        
        x++; // Pós-incremento
        System.out.println("Valor da variável x após o Pós-incremento: " + x);
            
        System.out.println();
        System.out.println("Valor da variável x: " + x);
        System.out.println();
        
        --x;
        System.out.println("Valor da variável x após o Pré-decremento: " + x); 
        
        x--;
        System.out.println("Valor da variável x após o Pós-decremento: " + x); 
        System.out.println();
        
        System.out.println("Valor final da variável: " + x);
        
	}

}
