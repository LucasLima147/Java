package Main;

public class Main {
	private void operacao(int vet[]) {
		int soma = vet[0] + vet[1];
		System.out.println("Resultado da operação: " + soma);
	}

	private void operacao(double vet[]) {
		double soma = vet[0] + vet[1];
		System.out.println("Resultado da operação: " + soma);
	}

	private void operacao(String vet[]) {
		String soma = vet[0] + vet[1];
		System.out.println("Resultado da operação: " + soma);
	}
// ===============================================================
	private void Start() {
		
		int vetInt[] = { 5, 5 };
		double vetDouble[] = { 10.27, 10, 42 };
		String vetString[] = { "44", " - Lucas Lima" };
		
		
		operacao(vetInt);
		operacao(vetDouble);
		operacao(vetString);
	}

	public static void main(String[] args) {
		Main app = new Main();
		app.Start();

	}

}
