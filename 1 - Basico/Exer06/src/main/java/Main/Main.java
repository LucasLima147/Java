package Main;

import java.util.Iterator;

public class Main {
	private void Start() {
		// criando ARRAY e manipulando com FOR no formato do FOREACH 
		String carros[] = new String[4];
		carros[0] = "Civic";
		carros[1] = "Gol";
		carros[2] = "Palio";
		carros[3] = "Uno";
		for (int i = 0; i < carros.length; i++) {
			System.out.println("Nome do carro: " + carros[i]);
		}
		System.out.println();
		
		// trocando o  valor Gol pelo L200
		carros[1] = "L200";
		for (String carro : carros) {
			System.out.println("Nome do Carro: "+ carro);
		}
		System.out.println();
		
		// colocando o valor Gol na última possição
		carros[carros.length-1] = "Gol";
		for (String carro : carros) {
			System.out.println("Nome do Carro: "+ carro);
		}
		
		//FORMA MAIS RÁPIDA DE DECLARA O MESMO ARRAY
		// String carros[] = {"Civic", "Gol", "Palio", "Uno"};
		
	}
	
	public static void main(String[] args) {
		Main app = new Main ();
		app.Start();
	}

}
