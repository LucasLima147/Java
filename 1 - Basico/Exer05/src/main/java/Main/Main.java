package Main;

public class Main {
	private void Start() {
		// utilizando o SWITCH/CASE
		for(int cont = 0; cont < 5; cont++) {
			switch (cont) {
				case 1:
					System.out.println("Primeira condição");
					break;
				case 2:
					System.out.println("Segunda condição");
					break;
				default:
					System.out.println("Não Encontrou uma condição");
					break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Main app = new Main();
		app.Start();
		

	}

}
