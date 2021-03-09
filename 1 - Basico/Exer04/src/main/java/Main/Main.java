package Main;

import java.util.Iterator;

public class Main {
	
	private void Start() {
		int i = 1;

		// exibindo 20 o valor do interator com o WHILE
		while(i <= 20) {
			System.out.println("Valor i: " + i);
			i ++;
		}
		System.out.println();
		
		// exibindo 20 o valor do interator com o DO WHILE
		int k = 1;
		do {
			System.out.println("Valor k: " + k);
			k ++;
		} while (k <= 20);
		System.out.println();
				
		// exibindo 20 o valor do interator com o FOR
		for(int j = 1; j <= 20; j ++) {
			System.out.println("Valor j: " + j);
		}
	}
	
	
	public static void main(String[] args) {
		Main app = new Main();
		app.Start();

	}

}
