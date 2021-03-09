package Exerciocio.Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.Statr();
	}

	private void Statr() {
		Scanner scan = new Scanner(System.in);
		int precoInt;
		float preco;
		
		// pegar o valor pelo console
		System.out.print("Digite o valor do preço do produto: ");
		preco = scan.nextFloat();
		
		// converter o valor double para int
		precoInt = (int) preco;
		System.out.println("Valor com casa decimais: "+preco+" | Valor inteiro: " + precoInt);
		
		// convertendo o valor 10(int) em double de forma implícita
		int valor = 10;
		double valorDouble = (double) valor;
		System.out.println("Novo: "+valorDouble+" | Convertido: "+valor);
		
		// convertendo o valor 10(double) em int de forma implícita
		int novoValor = (int) valorDouble;
		System.out.println("Valor int de forma implícita: " + novoValor);
		
	}

}
