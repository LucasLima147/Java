package Exercicio01.Main;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private void start() {
		int idade = 15;
		System.out.println("A idade é de " + idade + "anos");
		
		idade = (idade + 5) * 2;
		System.out.println("Resultado 1: " + idade);
		
		idade -= 5;
		System.out.println("Resultado 2: " + idade);
		
		if(idade > 20) {
			System.out.println("Idade maior que 20");
		}else {
			System.out.println("Idade menor ou igual a 20");
		}
		
	}

}
