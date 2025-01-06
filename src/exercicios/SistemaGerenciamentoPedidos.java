package exercicios;

import java.util.Scanner;


public class SistemaGerenciamentoPedidos {

	public static void main(String[] args) {
		// SISTEMA DE GERENCIAMENTO DE PEDIDOS
		/* Neste exemplo, vamos criar um sistema de gerenciamento de pedidos para um restaurante, 
		 * utilizando entrada de dados, laços de repetição e estruturas condicionais. 
		 * 
		 * O programa permite que o usuário:
		 * - Insira múltiplos itens do menu.
		 * - Especifique a quantidade de cada item.
		 * - Calcule o total do pedido com a opção de aplicar uma taxa de serviço opcional. */
		
		// Método para entrada de dados.
		Scanner scanner = new Scanner(System.in);
		
		// Menu do restaurante:
		System.out.println("Bem-vindo ao Restaurante Java");
		System.out.println();
		System.out.println("Aqui esta o menu:");
		
		String[] menu = {"Pizza", "Hamburguer", "Salada", "Refrigerante", "Sobremesa"};
		Double[] valor = {40.00, 25.00, 18.00, 8.00, 12.00};
		
		// Exebição do menu com a estrutura for
		for (int i = 0; i < menu.length; i++) {
			System.out.printf("%d. %s - R$ %.2f%n", i + 1, menu[i], valor[i]);
		}
		
		// Configuração inicial do pedido
		double totalPedido = 0;
		boolean continuar = true;
		int escolha = 0;
		
		// Entrada de dados para o pedido
		while (continuar) {
			System.out.print("\nDigite o número do item que deseja adicionar ao pedido (ou 0 para finalizar): ");
            escolha = scanner.nextInt();

            if (escolha == 0) {
            	System.out.print("\nPedido finalizado.\n");
                break; // Encerra o loop se o usuário quiser finalizar
            }

            if (escolha < 1 || escolha > menu.length) {
                System.out.print("\nOpção inválida. Vamo tentar novamente.\n");
                continue;
            }

            // Obter a quantidade
            System.out.printf("Quantas unidades de %s você deseja? ", menu[escolha - 1]);
            int quantidade = scanner.nextInt();

            if (quantidade <= 0) {
                System.out.print("\nQuantidade inválida. Por favor, insira um número positivo.\n");
                continue;
            }
            
            System.out.printf("%n%d x %s adicionado ao pedido.%n", quantidade, menu[escolha - 1]);
            

            // Adicionar ao total
            double subtotal = valor[escolha - 1] * quantidade;
            totalPedido += subtotal;

                    
            // Perguntando se deseja adicionar mais itens.
            System.out.print("\nDeseja acrescentar mais itens ao seu pedido? (sim/nao): ");
            String adicionarItem = scanner.next().toLowerCase();
            
            if(adicionarItem.equals("nao")) {
            	System.out.printf("%nSubtotal: R$ %.2f%n", totalPedido);
            	break;
            } else {
            	continue;
            }                     
		}
		
		// Perguntando sobre a taxa de serviço.
		if (escolha == 0) {
			System.out.printf("Volte sempre!");
		} else {
			System.out.print("\nDeseja pagar a taxa de serviço de 10%? (sim/nao): ");
			String taxaServico = scanner.next().toLowerCase();
			
			if(taxaServico.equals("sim")) {
				totalPedido *= 1.10;
				System.out.println("Taxa de serviço adicionada ao total.");
			}
			
			// Exibindo o total final.
			System.out.printf("%nTotal do pedido: R$ %.2f%n", totalPedido);
			System.out.println();
			System.out.printf("Obrigado por pedir no Restaurante Java!");			
		}
		
		
		scanner.close();
	}

}
