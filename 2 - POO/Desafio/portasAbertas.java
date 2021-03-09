import java.util.Scanner;

class Casa{
	String cor;
	boolean porta1, porta2, porta3;

	void pinta(String novaCor){
		this.cor = novaCor;
	}

	int quantasPortasEstaoAbertas(){
		if(this.porta1 && this.porta2 && this.porta3){
			return 3;
		}
		else if(this.porta1 && this.porta2) || (this.porta1 && this.porta3) || (this.porta2 && this.porta3) {
			return 2;
		}
		else if(this.porta1) || (this.porta2) || (this.porta3){
			return 1;
		}
		else{
			return 0;
		}
	}
}

class Main(){
	Casa minhaCasa = new Casa();
	Scanner lerTeclado = new Scanner(System.in);

	porta.cor = "natural";
	porta.porta1 = false;
	porta.porta2 = false;
	porta.porta3 = false;

	system.out.println("Vamos abrir e fechar as portas e pintar a casa");
	while (true){
		lerTeclado.nextLine();
		
	}
}