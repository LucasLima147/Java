package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.Start();

	}

	private void Start() {
		Scanner scan = new Scanner(System.in);
		int idade;
		System.out.print("Digite o uma idade: ");
		idade = scan.nextInt();
		
		if(idade > 20) {
			System.out.println("Idade maior que 20");
		}else if(12 > idade && idade < 17) {
			System.out.println("Idade maior que Idade maior que 12 e menor que 17");
		}else if(idade == 7 || idade < 5) {
			System.out.println("Idade igual a 7 OU menor que 5");
		}else {
			System.out.println("Outras Combinações");
		}
	}

}
