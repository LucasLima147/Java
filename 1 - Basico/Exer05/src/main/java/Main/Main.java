package Main;

public class Main {
	private void Start() {
		// utilizando o SWITCH/CASE
		for(int cont = 0; cont < 5; cont++) {
			switch (cont) {
				case 1:
					System.out.println("Primeira condi��o");
					break;
				case 2:
					System.out.println("Segunda condi��o");
					break;
				default:
					System.out.println("N�o Encontrou uma condi��o");
					break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Main app = new Main();
		app.Start();
		

	}

}
