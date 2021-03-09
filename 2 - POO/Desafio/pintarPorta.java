import java.util.Scanner;

class Porta{
	// Atributos
	boolean aberta;
	String cor;
	double dimensaoX, dimensaoY, dimensaoZ;
	

	// Métodos
	void abre(){
		this.aberta = true;
	}

	void fecha(){
		this.aberta = false;
	}

	void pinta(String novaCor){
		this.cor = novaCor;
	}

	void estaAberta(){
		if(!this.aberta){
			this.abre();
		}
		else{
			this.fecha();
		}
	}

	// Método_extra
	void estadoDaPorta(){
		String estadoPorta;
		estadoPorta = "A porta da cor eh: " + this.cor +
					"\nSuas dimensoes sao: " + this.dimensaoX+" "+this.dimensaoY+" "+this.dimensaoZ;
		if(this.aberta){
			estadoPorta += "\nA porta esta aberta";
		}
		else{
			estadoPorta += "\nA porta esta fechada";
		}
		System.out.println(estadoPorta);
	}

}

class Main{
	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		Porta porta = new Porta();
		int opcaoMenu;
		opcaoMenu = 0;
		porta.aberta = false;
		porta.dimensaoX = 0;
		porta.dimensaoZ = 0;
		porta.dimensaoY = 0;
		porta.cor = "natural";

		System.out.println("Vamos brincar de pintar porta?");
		while(true){
			System.out.println("\nOpcoes:\n" + 
								"1 - Abrir/fechar porta;\n"+
								"2 - Alterar Dimencoes da porta;\n"+
								"3 - Alterar a cor;\n"+
								"4 - Estado Atual da porta;\n"+
								"0 - finalizar alteracoes.");
			System.out.print("Opcao desejada: ");
			opcaoMenu = lerTeclado.nextInt();

			if (opcaoMenu == 1) {
				porta.estaAberta();
			}
			else if (opcaoMenu == 2) {
				System.out.print("Digite a dimensao X: ");
				porta.dimensaoX = lerTeclado.nextFloat();
				System.out.print("Digite a dimensao Y: ");
				porta.dimensaoY = lerTeclado.nextFloat();
				System.out.print("Digite a dimensao Z: ");
				porta.dimensaoZ = lerTeclado.nextFloat();
			}
			else if (opcaoMenu == 3) {
				System.out.print("Digite a nova cor da porta: ");
				porta.cor = lerTeclado.next();
				System.out.println(porta.cor);
			}
			else if (opcaoMenu == 4) {
				porta.estadoDaPorta();
			}
			else if(opcaoMenu == 0){
				break;
			}
			else{
				System.out.println("Opção inválida\n");
			}
			lerTeclado.nextLine();
		}

	}
}